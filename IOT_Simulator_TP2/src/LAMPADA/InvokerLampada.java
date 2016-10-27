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
public class InvokerLampada {
    
   private Command[] commands;
    private Command ultimoCommand;
    
    
    public InvokerLampada(Command LigarLampadaCommand,Command DesligarLampadaCommand){
        this.commands = new Command[2];
        commands[0] = LigarLampadaCommand;
        commands[1] = DesligarLampadaCommand;
    }
    
     public void ligarAC(){
        commands[0].execute();
        ultimoCommand = commands[0];
    }
    
    public void desligarAC(){
        commands[1].execute();
        ultimoCommand = commands[1];
    }
    
    public void desfazer(){
        ultimoCommand.undo();
    }
    
}