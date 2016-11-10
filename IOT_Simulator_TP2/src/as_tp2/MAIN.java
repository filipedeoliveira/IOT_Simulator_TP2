/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Stéphane
 */
public class MAIN {
    public static void main(String[] args) throws IOException, InterruptedException{
        System.out.println("#########################");    
        System.out.println("########SmartHome########");
        System.out.println("#########################"); 

            ControloAtuadoresTemperatura.executaComandosTempInicial();
       
    }
}
