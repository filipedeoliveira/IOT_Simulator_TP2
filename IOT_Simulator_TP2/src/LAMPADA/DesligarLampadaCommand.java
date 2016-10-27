/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAMPADA;

import as_tp2.Command;

/**
 *
 * @author Stéphane
 */
public class DesligarLampadaCommand implements Command{
    LampadaInteligente lamp;
    
    public DesligarLampadaCommand(LampadaInteligente lamp){
        this.lamp=lamp;
        
    }
    
    @Override
    public void execute() {
        lamp.close();
    }

    @Override
    public void undo() {
        lamp.open();
    }
}
