/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stéphanes
 */
public class Temperatura {
    
    public static void diminui1() throws IOException, InterruptedException{
        float temp;
        temp = (Float)ControloAtuadoresTemperatura.lastTemp.get(ControloAtuadoresTemperatura.lastTemp.size() - 1);
        float temp2 = temp-10;
        while(temp>temp2 ){
          
                temp = (float) (temp - 0.5);
                 System.out.println("A diminuir a temperatura ...  " + temp + "ºC");
               
                sleep(1000);
        
        }
        ControloAtuadoresTemperatura.estabilizar(temp);
    }
    
    
    public static void aumenta1() throws IOException, InterruptedException{
        float temp;
        temp = (Float)ControloAtuadoresTemperatura.lastTemp.get(ControloAtuadoresTemperatura.lastTemp.size() - 1);
        float temp2 = temp+11;
        while(temp<temp2){
            temp = (float) (temp + 0.5);
              System.out.println("A aumentar a temperatura ...  " + temp + "ºC");
                sleep(1000);
        }
        ControloAtuadoresTemperatura.estabilizar(temp);
    }
    
   
}
