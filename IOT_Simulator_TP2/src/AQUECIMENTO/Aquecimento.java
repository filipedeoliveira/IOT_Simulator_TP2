/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AQUECIMENTO;

/**
 *
 * @author Stéphane
 */
public class Aquecimento {
    public final static int LIGADO = 0;
    public final static int DESLIGADO = 1;
    
    private int estado = 0;
    
    public int getEstado(){
        return estado;
    }
    
    public void setEstado(int estado){
        this.estado = estado;
    }
    
    public void open(){
        this.estado = LIGADO;
        System.out.println(">Aquecimento Ligado");
    }
    
    public void close(){
         this.estado = DESLIGADO;
        System.out.println(">Aquecimento Desligado");
    }
    
}
