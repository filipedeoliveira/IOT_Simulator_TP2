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
public class ControloAtuadoresTemperatura {
    public static ArrayList<Float> lastTemp = new ArrayList<Float>();
    
    public static void executaComandosTempInicial() throws IOException, InterruptedException{
        
       float tempAtual = Simulador.getTemperatura();
        System.out.println("A temperatura é:  " + tempAtual + "ºC");
       
        if (tempAtual >= 25) maiorque25(tempAtual);
        else if (tempAtual > 5 && tempAtual < 25) meio(tempAtual);
        else if (tempAtual<=5) menorQue5(tempAtual);
    }
    


    public static void maiorque25(float tempAtual) throws IOException, InterruptedException{
            System.out.println("O ambiente está muito quente, deseja atuar? [Y - Yes / N - No]");
            Scanner sc = new Scanner(System.in);
            String escolha = sc.next();
            
            if (escolha.equals ("N") || escolha.equals ("n")) {
                while (tempAtual < 35) {
                    tempAtual = (float) (tempAtual + 0.5);
                    System.out.println("A temperatura é:  " + tempAtual + "ºC");
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Erro");
                    }
                }
                System.out.println("Modo segurança ligado temperatura atingiu valor demasiado alto...a descer ");
                ArCondicionado ac = new ArCondicionado();
                LigarArCondicionadoCommand on = new LigarArCondicionadoCommand(ac);
                EstoreElectrico el = new EstoreElectrico();
                FecharEstoreCommand fec = new FecharEstoreCommand(el);
                Invoker in = new Invoker();
                in.takeOrder(on);
                in.takeOrder(fec);
                in.placeOrders();
                lastTemp.add(tempAtual);
                Temperatura.diminui1();

            } else if (escolha.equals ("Y") || escolha.equals ("y")) {
                ArCondicionado ac = new ArCondicionado();
                LigarArCondicionadoCommand on = new LigarArCondicionadoCommand(ac);
                EstoreElectrico el = new EstoreElectrico();
                FecharEstoreCommand fec = new FecharEstoreCommand(el);
                Invoker in = new Invoker();
                in.takeOrder(on);
                in.takeOrder(fec);
                in.placeOrders();
                lastTemp.add(tempAtual);
                Temperatura.diminui1();
            } 
            else System.out.println("erro");
    }

    
    public static void meio(float temp) throws IOException, InterruptedException{
            int minH = -1;
            int maxH = 2;
            int res;
            Random randT = new Random();
            res = randT.nextInt(maxH - minH) + minH;
            
           if (res >= 0) {
            while (temp < 25) {
                temp = (float) (temp + 0.5);
                 System.out.println("A temperatura é:  " + temp + "ºC");
                    sleep(1000);
                
            }
            lastTemp.add(temp);
            maiorque25(temp);
        }
            else {
               while (temp > 5) {
                   temp = (float) (temp - 0.5);
                    System.out.println("A temperatura é:  " + temp + "ºC");
                   
                       sleep(1000);
                   
            }
            lastTemp.add(temp);
            menorQue5(temp);
        }
            
            
    }
    
     public static void menorQue5(float tempAtual) throws IOException, InterruptedException{
     
            System.out.println("O ambiente está muito frio, deseja atuar? [Y - Yes / N - No]");
            char escolha1 = (char) (System.in.read());

            if (escolha1 == 'N' || escolha1 == 'n') {
                while (tempAtual > -5) {
                    tempAtual = (float) (tempAtual - 0.5);
                    System.out.println("A temperatura é:  " + tempAtual + "ºC");
                    
                        sleep(1000);
                   
                }
                System.out.println("Modo segurança ligado temperatura atingiu valor demasiado baixo...a subir ");
                ArCondicionado ac = new ArCondicionado();
                DesligarArCondicionadoCommand on = new DesligarArCondicionadoCommand(ac);
                EstoreElectrico el = new EstoreElectrico();
                AbrirEstoreCommand fec = new AbrirEstoreCommand(el);
                Invoker in = new Invoker();
                in.takeOrder(on);
                in.takeOrder(fec);
                in.placeOrders();
                lastTemp.add(tempAtual);
                Temperatura.aumenta1();

            } else if (escolha1 == 'Y' || escolha1 == 'y') {
                ArCondicionado ac = new ArCondicionado();
                DesligarArCondicionadoCommand on = new DesligarArCondicionadoCommand(ac);
                EstoreElectrico el = new EstoreElectrico();
                AbrirEstoreCommand fec = new AbrirEstoreCommand(el);
                Invoker in = new Invoker();
                in.takeOrder(on);
                in.takeOrder(fec);
                in.placeOrders();
                lastTemp.add(tempAtual);
                Temperatura.aumenta1();
            } else {
                System.out.println("ERROR");
            }

    }
     
    public static void estabilizar(float tempAtual) throws IOException, InterruptedException{
         int i=0;            
        while(i<10){    
        int minH = -1;
            int maxH = 2;
            int res;
            Random randT = new Random();
            res = randT.nextInt(maxH - minH) + minH;
                float aux=tempAtual;
                float temp= aux+res;
                 System.out.println("A estabilizar temperatura:  " + temp + "ºC");
                sleep(1000);
                i++;
            }
            System.out.println("....MEIA HORA DEPOIS....");
            executaComandosTempInicial();

           
    } 
}