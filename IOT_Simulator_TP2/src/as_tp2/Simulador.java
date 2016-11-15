/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_tp2;

import java.util.ArrayList;
import java.util.Random;

public class Simulador {

    public static ArrayList lastTemperature = new ArrayList<Float>();
    
    
    public static float getTemperatura() {
        //alterar os limites pra valores mais normais pra uma casa
        float aux = (Float) lastTemperature.get(lastTemperature.size() - 1);
        float minT = -5.0f;
        float maxT = 5.0f;
        Random randT = new Random();

        float temp;
        temp = randT.nextFloat() * (maxT - minT) + minT;
        float resultado = aux+temp;
        float result = (float)((int)( resultado *100f ))/100f;
        lastTemperature.add(result);
        return result;
    }
    public static float getAumenta() {
        //alterar os limites pra valores mais normais pra uma casa
        float temp = (Float) lastTemperature.get(lastTemperature.size() - 1);
        float minimo = 0.0f;
        float maximo = 2.0f;
        Random randT = new Random();

        
        float aux = randT.nextFloat() * (maximo - minimo) + minimo;
        float resultado = temp+aux;
        float result = (float)((int)( resultado *100f ))/100f;
        lastTemperature.add(result);
        return result;
    }
    
    public static float getDiminui() {
        //alterar os limites pra valores mais normais pra uma casa
        float temp = (Float) lastTemperature.get(lastTemperature.size() - 1);
        float minimo = 0.0f;
        float maximo = 3.0f;
        Random randT = new Random();

        
        float aux = randT.nextFloat() * ((maximo - minimo) + minimo);
        float resultado = temp-aux;
        float result = (float)((int)( resultado *100f ))/100f;
        lastTemperature.add(result);
        return result;
    }
    
    
    public static float getTemperaturaManha1() {
        //alterar os limites pra valores mais normais pra uma casa
        float minX = 7.0f;
        float maxX = 13.0f;
        Random randX = new Random();
        float aux = randX.nextFloat() * (maxX - minX) + minX;
        float result = (float)((int)( aux *100f ))/100f;
        lastTemperature.add(result);
        return result;
    }
 
   
    public static float getLuzDia() {
        float minL = 88000.045f;
        float maxL = 188000.0f;
        float luz;
        Random randL = new Random();

        luz = randL.nextFloat() * (maxL - minL) + minL;
        float result = (float)((int)( luz *100f ))/100f;
        return luz;
    }
    
    public static float getLuzNoite() {
        float minL = 0.045f;
        float maxL = 500.045f;
        float luz;
        Random randL = new Random();

        luz = randL.nextFloat() * (maxL - minL) + minL;
        float result = (float)((int)( luz *100f ))/100f;
        return luz;
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
     public static String getPressao() {
        float minP = 300f;// ver intervalo de valores
        float maxP = 1100.0f;
        String pressao;
        Random randP = new Random();

        pressao = "Pressão: " + Float.toString(randP.nextFloat() * (maxP - minP) + minP) + "hPa";
        //System.out.println("A pressão é: %.2f  " + pressao);
        return pressao;
    }


     public static String getAcustica() {
        float minA = 125.0f;// ver intervalo de valores
        float maxA = 4000.0f;
        String acustica;
        Random randA = new Random();

        acustica = "Acustica: " + Float.toString(randA.nextFloat() * (maxA - minA) + minA) + "Hz";
        //System.out.println("A acústica é: %.2f " + acustica);
        return acustica;
    }

    public static String getAcelerometro() {
        float minAc = -2.0f;// ver intervalo de valores
        float maxAc = 16.0f;
        String acelerometro;
        Random randAc = new Random();

        acelerometro = "Aceleração: " + Float.toString(randAc.nextFloat() * (maxAc - minAc) + minAc) + "g";
        //System.out.println("A aceleraçãp é: %.2f " + acelerometro);
        return acelerometro;
    }

    public static String getGiroscopio() {
        float minG = -125.0f;// ver intervalo de valores
        float maxG = 2000.0f;
        String giroscopio;
        Random randG = new Random();

        giroscopio = "Giroscópio: " + Float.toString((randG.nextFloat() * (maxG - minG) + minG)) + "º/s";
        //System.out.println("A horientaçã é: %.2f " + giroscopio);
        return giroscopio;
    }

    public static String getMagnetometro() {
        float minX = -1300.0f;
        float maxX = 1300.0f;
        float minY = -1300.0f;
        float maxY = 1300.0f;
        float minZ = -2500.0f;
        float maxZ = 2500.0f;
        String magnetometro;
        Random randX = new Random();
        Random randY = new Random();
        Random randZ = new Random();

        magnetometro = "Magnetometro: " + Float.toString(randX.nextFloat() * (maxX - minX) + minX) + "X , " + Float.toString(randY.nextFloat() * (maxY - minY) + minY) + "Y , " + Float.toString(randZ.nextFloat() * (maxZ - minZ) + minZ) + "Z";
        //System.out.println("A magneterização é: %.2f " + magnetometro);
        return magnetometro;
    }

}
