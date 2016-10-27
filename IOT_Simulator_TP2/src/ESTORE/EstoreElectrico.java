/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ESTORE;

/**
 *
 * @author Stéphane
 */
public class EstoreElectrico {
    public final static int ABERTO = 0;
    public final static int FECHADO = 1;
    
    private int estado = 0;
    
    public int getEstado(){
        return estado;
    }
    
    public void setEstado(int estado){
        this.estado = estado;
    }
    
    public void open(){
        this.estado = ABERTO;
        System.out.println("Estore aberto");
    }
    
    public void close(){
         this.estado = FECHADO;
        System.out.println("Estore aberto");
    }
    
}

