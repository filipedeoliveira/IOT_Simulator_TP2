package as_tp2;


public class ControladorAtuadores {
/*
    public static List lastTemp1 = new ArrayList<Float>();

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
                    //ligar ar condicionado
                }
                else if (escolha == 'S' || escolha == 's'){
                    lastTemp.add(temp);
                    System.out.println("Modo segurança ligado temperatura a descer");
                    ArCondicionado ac = new ArCondicionado();
                    LigarArCondicionadoCommand on = new LigarArCondicionadoCommand(ac);
                    EstoreElectrico el = new EstoreElectrico();
                    FecharEstoreCommand fec = new FecharEstoreCommand(el);
                    Invoker in = new Invoker();
                    in.takeOrder(on);
                    in.takeOrder(fec);
                    in.placeOrders();
                }
                
            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Comandos não executados!");
        }

    }
*/
}