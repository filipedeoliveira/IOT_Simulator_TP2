/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

/**
 *
 * @author Stéphane
 */
public class ConcreteObserver extends ControladorAtuador implements Observer {
    
    public ConcreteObserver(int user) {
        super(user);
    }

    @Override
    public void update(int i) {
        if (i == 7) {
            float tempAtual = Simulador.getTemperaturaManha1();
            System.out.println("Bom dia são - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzDia();
            System.out.println("A luminosidade atual é " + luminosidade + "lux");
        } else if (i == 9) {

            float tempAtual = Simulador.getTemperatura();
            System.out.println("São " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzDia();
            System.out.println("A luminosidade atual é " + luminosidade + "lux");
        } else if (i == 12) {

            float tempAtual = Simulador.getTemperatura();
            System.out.println("São - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzDia();
            System.out.println("A luminosidade atual é " + luminosidade  + "lux");
        } else if (i == 14) {

            float tempAtual = Simulador.getTemperatura();
            System.out.println("São - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzDia();
            System.out.println("A luminosidade atual é " + luminosidade + "lux");
        } else if (i == 16) {
            float tempAtual = Simulador.getTemperatura();
            System.out.println("São - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzDia();
            System.out.println("A luminosidade atual é " + luminosidade + "lux");
        } else if (i == 18) {
            float tempAtual = Simulador.getTemperatura();
            System.out.println("São - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzDia();
            System.out.println("A luminosidade atual é " + luminosidade + "lux");

        } else if (i == 19) {
            float tempAtual = Simulador.getTemperatura();
            System.out.println("Bem vindo a casa - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");

            float luminosidade = Simulador.getLuzNoite();
            System.out.println("A luminosidade atual é " + luminosidade  + "lux");

        } else if (i == 21) {
            float tempAtual = Simulador.getTemperatura();
            System.out.println("São - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");
            float luminosidade = Simulador.getLuzNoite();
            System.out.println("A luminosidade atual é " + luminosidade);

        } else if (i == 24) {
            float tempAtual = Simulador.getTemperatura();
            System.out.println("Boa noite - " + i + "h" + " a temperatura atual é " + tempAtual + "ºC");
            float luminosidade = Simulador.getLuzNoite();
            System.out.println("A luminosidade atual é " + luminosidade + "lux");
        }
    }

}
