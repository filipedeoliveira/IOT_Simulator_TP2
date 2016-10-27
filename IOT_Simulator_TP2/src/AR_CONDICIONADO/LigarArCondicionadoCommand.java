/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AR_CONDICIONADO;

import as_tp2.Command;

/**
 *
 * @author Stéphane
 */
public class LigarArCondicionadoCommand implements Command{
     ArCondicionado ac;
    
    public LigarArCondicionadoCommand(ArCondicionado ac){
        this.ac=ac;
    }
    
    @Override
    public void execute() {
        ac.open();
    }

    @Override
    public void undo() {
        ac.open();
    }
}