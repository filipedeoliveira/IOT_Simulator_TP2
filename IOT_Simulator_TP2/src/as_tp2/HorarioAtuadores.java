/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import AQUECIMENTO.Aquecimento;
import AQUECIMENTO.DesligarAquecimentoCommand;
import AQUECIMENTO.LigarAquecimentoCommand;
import AR_CONDICIONADO.ArCondicionado;
import AR_CONDICIONADO.LigarArCondicionadoCommand;
import ESTORE.AbrirEstoreCommand;
import ESTORE.EstoreElectrico;
import ESTORE.FecharEstoreCommand;
import LAMPADA.DesligarLampadaCommand;
import LAMPADA.LampadaInteligente;
import LAMPADA.LigarLampadaCommand;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Stéphane
 */
public class HorarioAtuadores {

    public static void smartHome(int i, int id) throws InterruptedException, IOException {

        while (true) {
            if (i == 7) {
                i = sete(i, id);
            } else if (i == 9) {
                i = nove(i, id);
            } else if (i == 12) {
                i = doze(i, id);
            } else if (i == 14) {
                i = quatorze(i, id);
            } else if (i == 16) {
                i = dezasseis(i, id);
            } else if (i == 18) {
                i = dezoito(i, id);

            } else if (i == 19) {
                i = dezanove(i, id);
            } else if (i == 21) {
                i = vinteUm(i, id);
            } else if (i == 24) {
                i = vinteQuatro(i, id);
            } else if (i == 2) {
                i = dois(i);
            }
            sleep(2000);

        }
    }

    public static int sete(int i, int id) throws InterruptedException {

        System.out.println(">>>>>NOVO DIA <<<<<<<");// abrir estores ligar aquecimento 
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);
        System.out.println("###Ativados protocolos normais (Aquecendo a casa) ### ");
        EstoreElectrico el = new EstoreElectrico();
        AbrirEstoreCommand fec = new AbrirEstoreCommand(el);
        Aquecimento aq = new Aquecimento();
        LigarAquecimentoCommand on = new LigarAquecimentoCommand(aq);
        Invoker in = new Invoker();
        in.takeOrder(fec);
        in.takeOrder(on);
        sleep(1000);
        in.placeOrders();
        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        float temp = (float) tempAtual;
        int j = 0;
        while (j < 5) {
            float res = Simulador.getAumenta();
            System.out.println(" Aumentando a temperatura " + res + "ºC");
            sleep(1000);

            j++;
        };
        System.out.print("\n");
        return i = i + 2;
    }

    public static int nove(int i, int id) throws InterruptedException {
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);
        System.out.println("###Ativados protocolos normais ### ");
        Aquecimento aq = new Aquecimento();
        DesligarAquecimentoCommand on = new DesligarAquecimentoCommand(aq);
        Invoker in = new Invoker();
        in.takeOrder(on);
        sleep(1000);
        in.placeOrders();

        System.out.print("\n");
        return i = i + 3;
    }

    public static int doze(int i, int id) throws InterruptedException, IOException {//normal
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);

        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        CasosExtremos.security(tempAtual);

        System.out.print("\n");

        return i = i + 2;
    }

    public static int quatorze(int i, int id) throws InterruptedException, IOException {
        //normal
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);

        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        CasosExtremos.security(tempAtual);
        System.out.print("\n");

        return i = i + 2;
    }

    public static int dezasseis(int i, int id) throws InterruptedException, IOException {
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);

        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        CasosExtremos.security(tempAtual);
        System.out.print("\n");

        return i = i + 2;
    }

    public static int dezoito(int i, int id) throws InterruptedException, IOException {
        //ligar aqueciemnto
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);
        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        int j = 0;
        if (tempAtual < 22) {
            System.out.println("###Ativados protocolos normais (aquecendo a casa para a chegada do cliente) ### ");
            Aquecimento aq = new Aquecimento();
            LigarAquecimentoCommand on = new LigarAquecimentoCommand(aq);
            Invoker in = new Invoker();
            in.takeOrder(on);
            sleep(1000);
            in.placeOrders();
            while (j < 5) {
                float res = Simulador.getAumenta();
                System.out.println(" Temperatura a aumentar " + res + "ºC");
                sleep(1000);
                j++;
            }
        } else if (tempAtual >= 22 && tempAtual < 25); else if (tempAtual > 25) {
            CasosExtremos.security(tempAtual);

        }

        System.out.print("\n");
        return i = i + 1;
    }

    public static int dezanove(int i, int id) throws InterruptedException, IOException {
        //ligar luzes
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);
        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        System.out.println("###Ativados protocolos normais (ligar luzes pq a visibilidade vai diminuir)### ");
        LampadaInteligente l = new LampadaInteligente();
        LigarLampadaCommand on = new LigarLampadaCommand(l);
        Invoker in = new Invoker();
        in.takeOrder(on);
        sleep(1000);
        in.placeOrders();
        CasosExtremos.security(tempAtual);
        System.out.print("\n");
        return i = i + 2;
    }

    public static int vinteUm(int i, int id) throws InterruptedException, IOException {
        //fechar estores
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);
        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        System.out.println("###Ativados protocolos normais (Já é de noite hora de fechar os estores) ### ");
        EstoreElectrico el = new EstoreElectrico();
        FecharEstoreCommand fec = new FecharEstoreCommand(el);
        Invoker in = new Invoker();
        in.takeOrder(fec);
        sleep(1000);
        in.placeOrders();
        CasosExtremos.security(tempAtual);

        System.out.print("\n");
        return i = i + 3;
    }

    public static int vinteQuatro(int i, int id) throws InterruptedException, IOException {//desligar luzes
        ConcreteObserver o = new ConcreteObserver(id);
        o.update(i);
        sleep(1000);
        float tempAtual = (Float) Simulador.lastTemperature.get(Simulador.lastTemperature.size() - 1);
        System.out.println("###Ativados protocolos normais (hora de dormir desligar luzes ...)### ");
        LampadaInteligente l = new LampadaInteligente();
        DesligarLampadaCommand on = new DesligarLampadaCommand(l);
        Invoker in = new Invoker();
        in.takeOrder(on);
        sleep(1000);
        in.placeOrders();
        CasosExtremos.security(tempAtual);

        System.out.print("\n");
        return i = i - 22;
    }

    public static int dois(int i) throws InterruptedException {
        int j = i;
        while (j < 7) {
            if (j % 2 == 0) {
                float res = Simulador.getAumenta();
                System.out.println("São " + j + "h... temperatura estabilizada durante a noite:  " + res + "ºC");
                float luminosidade = Simulador.getLuzNoite();
                System.out.println("A luminosidade atual é " + luminosidade  + "lux");
                System.out.print("\n");
                sleep(2000);
                j++;
            } else if (j % 2 != 0) {
                float res = Simulador.getDiminui();
                System.out.println("São " + j + "h... temperatura estabilizada durante a noite:  " + res + "ºC");
                float luminosidade = Simulador.getLuzNoite();
                System.out.println("A luminosidade atual é " + luminosidade  + "lux");
                System.out.print("\n");
                sleep(2000);
                j++;
            }
        }
        return i = 7;
    }

}
