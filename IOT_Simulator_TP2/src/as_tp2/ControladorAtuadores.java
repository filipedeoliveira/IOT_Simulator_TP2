package as_tp2;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ControladorAtuadores {

    public static List lastTemp = new ArrayList<Float>();

    public static void executaComandosTemperatura() throws InterruptedException {
        float temp = 20.0f;

        try {
            //ler parametros 
            int minH = -1;
            int maxH = 2;
            int res;
            Random randT = new Random();
            res = randT.nextInt(maxH - minH) + minH;

            if (res >= 0) {
                //subir
                while (temp < 28) {
                    temp = (float) (temp + 0.5);
                    System.out.println("A temperatura é: %.2f " + temp);
                    sleep(1000);
                }

                System.out.println("O ambiente está a ficar muito quente, deseja atuar? [Y - Yes / N - No]");

                char escolha = (char) (System.in.read());
                if (escolha == 'N' || escolha == 'n') {
                    while (temp < 35) {
                        temp = (float) (temp + 0.5);
                        System.out.println("A temperatura é: %.2f " + temp);
                        sleep(1000);
                    }
                    System.out.println("Modo segurança ligado temperatura a descer");
                    lastTemp.add(temp);
                }
            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Comandos não executados!");
        }

    }

}
