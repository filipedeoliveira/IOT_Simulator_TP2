/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import AR_CONDICIONADO.ArCondicionado;
import AR_CONDICIONADO.DesligarArCondicionadoCommand;
import AR_CONDICIONADO.LigarArCondicionadoCommand;
import ESTORE.AbrirEstoreCommand;
import ESTORE.EstoreElectrico;
import ESTORE.FecharEstoreCommand;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stéphane
 */
public class CasosExtremos {
    
    public static void security(float tempAtual) throws IOException, InterruptedException{
      
        if (tempAtual > 25) maiorque25(tempAtual);
        else if (tempAtual<=5) menorQue5(tempAtual);
    }
    


    public static void maiorque25(float tempAtual) throws IOException, InterruptedException{
                System.out.println("Modo segurança ligado temperatura atingiu valor demasiado alto ");
                ArCondicionado ac = new ArCondicionado();
                LigarArCondicionadoCommand on = new LigarArCondicionadoCommand(ac);
                EstoreElectrico el = new EstoreElectrico();
                FecharEstoreCommand fec = new FecharEstoreCommand(el);
                
                Invoker in = new Invoker();
                in.takeOrder(on);
                in.takeOrder(fec);
                in.placeOrders();
                int j = 0;
                while (j < 5) {
                    float res = Simulador.getDiminui();
                    System.out.println(" Temperatura a diminuir" + res + "ºC");
                    sleep(1000);
                    j++;
                }
    }
    
     public static void menorQue5(float tempAtual) throws IOException, InterruptedException{
                System.out.println("Modo segurança ligado temperatura atingiu valor demasiado baixo ");
                ArCondicionado ac = new ArCondicionado();
                DesligarArCondicionadoCommand on = new DesligarArCondicionadoCommand(ac);
                EstoreElectrico el = new EstoreElectrico();
                AbrirEstoreCommand fec = new AbrirEstoreCommand(el);
                Invoker in = new Invoker();
                in.takeOrder(on);
                in.takeOrder(fec);
                in.placeOrders();
                int j = 0;
                while (j < 5) {
                    float res = Simulador.getAumenta();
                    System.out.println(" Temperatura a aumentar" + res + "ºC");
                    sleep(1000);
                    j++;
                }

    }
}