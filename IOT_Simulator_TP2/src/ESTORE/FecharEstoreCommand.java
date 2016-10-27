/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ESTORE;

import as_tp2.Command;

/**
 *
 * @author Stéphane
 */
public class FecharEstoreCommand implements Command{
     EstoreElectrico estoro;
    
    public FecharEstoreCommand(EstoreElectrico estoro){
        this.estoro=estoro;
    }
    
    @Override
    public void execute() {
        estoro.close();
    }

    @Override
    public void undo() {
        estoro.open();
    }
}
