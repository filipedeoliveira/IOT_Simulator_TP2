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
public class InvokerEstore {
    private Command[] commands;
    private Command ultimoCommand;
    
    public InvokerEstore(Command AbrirEstoreCommand, Command FecharEstoreCommand){
        this.commands = new Command[2];
        commands[0] = AbrirEstoreCommand;
        commands[1] = FecharEstoreCommand;  
    }
    
    public void abrirEstore(){
        commands[0].execute();
        ultimoCommand = commands[0];
    }
    
    public void FecharEstore(){
        commands[1].execute();
        ultimoCommand = commands[1];
    }
    
    public void desfazer(){
        ultimoCommand.undo();
    }
    
    
}
