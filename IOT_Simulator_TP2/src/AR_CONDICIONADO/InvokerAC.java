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
public class InvokerAC {
    private Command[] commands;
    private Command ultimoCommand;
    
    
    public InvokerAC(Command LigarArCondicionadoCommand,Command DesligarArCondicionadoCommand){
        this.commands = new Command[2];
        commands[0] = LigarArCondicionadoCommand;
        commands[1] = DesligarArCondicionadoCommand;
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
