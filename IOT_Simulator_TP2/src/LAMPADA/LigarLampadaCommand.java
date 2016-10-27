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
public class LigarLampadaCommand implements Command{
    LampadaInteligente lamp;
    
    public LigarLampadaCommand(LampadaInteligente lamp){
        this.lamp=lamp;
    }
    
    @Override
    public void execute() {
        lamp.open();
    }

    @Override
    public void undo() {
        lamp.open();
    }
}
