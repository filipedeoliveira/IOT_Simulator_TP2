/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AQUECIMENTO;
import as_tp2.Command;
/**
 *
 * @author Stéphane
 */
public class LigarAquecimentoCommand implements Command{
    Aquecimento aq;
    
    public LigarAquecimentoCommand(Aquecimento aq ){
        this.aq=aq;
    }
    
    @Override
    public void execute() {
        aq.open();
    }

    @Override
    public void undo() {
        aq.open();
    }
}
