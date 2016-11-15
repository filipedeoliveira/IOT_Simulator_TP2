
package as_tp2;

public interface Subject { 
    public void registerObserver(ControladorAtuador cli);
    public void removeObserver(ControladorAtuador cli);
    public void notifyObservers(); 

}
