/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import java.util.Random;

public class Simulador {

    public static float getTemperatura() {
        //alterar os limites pra valores mais normais pra uma casa
        float minT = -5.0f;
        float maxT = 33.0f;
        Random randT = new Random();

        float temp;
        temp = randT.nextFloat() * ((maxT - minT) + minT);
        return temp;
    }

    public static String getHumidade() {
        float minH = 10f;// humidade em percentagem 
        float maxH = 90f;
        String humidade;
        Random randH = new Random();

        humidade = "Humidade: " + Float.toString(randH.nextFloat() * (maxH - minH) + minH) + "%rH";
        //System.out.println("A humidade é: %.2f " + humidade);
        return humidade;
    }

    public static float getLuz() {
        float minL = 0.045f;// ver intervalo de valores
        float maxL = 188000.0f;
        float luz;
        Random randL = new Random();

        luz = randL.nextFloat() * ((maxL - minL) + minL);
        //System.out.println("A intensidade de Luz é: %.2f " + luz);
        return luz;
    }

}
