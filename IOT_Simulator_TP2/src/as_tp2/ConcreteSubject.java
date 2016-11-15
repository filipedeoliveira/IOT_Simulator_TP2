/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stéphane
 */
public class ConcreteSubject implements Subject{
 private List<ControladorAtuador> observers = new ArrayList<ControladorAtuador>();
    @Override
    public void registerObserver(ControladorAtuador cli) {
        observers.add(cli);
    }

    @Override
    public void removeObserver(ControladorAtuador cli) {
             observers.remove(cli);
    }

    @Override
    public void notifyObservers() {
        for (ControladorAtuador c : observers)
            try {
                int i=7;
                HorarioAtuadores.smartHome(i,c.getUser());
            } catch (InterruptedException ex) {
                Logger.getLogger(ConcreteSubject.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ConcreteSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
