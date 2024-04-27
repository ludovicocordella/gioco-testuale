import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner parole = new Scanner(System.in);
    static int danno;

    static public void whilelivello(Personaggio mago, Nemico nemico1) {

        while (nemico1.getSalute() > 0 && mago.getSalute() > 0) {

            System.out.println("------------");
            System.out.println("salute: " + mago.getSalute() + " energia: " + mago.getEnergia());
            System.out.println("salute nemico: " + nemico1.getSalute());
            System.out.println(
                    "1 per attaccare (10 punti energia) \n2 per abilità speciale (50 punti energia)\naltro per non fare nulla");
            String risposta = parole.nextLine();
            if (risposta.equals("1")) {

                nemico1.subiscidanno(mago.attacca());

            } else if (risposta.equals("2")) {
                if (mago instanceof Mago) {
                mago.abilità();
                }else if (mago instanceof Guerriero){
                    nemico1.subiscidanno(mago.abilità());
                } else if (mago instanceof Ladro ){
                
                    if(mago.abilità()==1){
                        danno=nemico1.attacca();
                        nemico1.subiscidanno(danno);
                        continue;
                    }
                }

            }   else {
                System.out.println("coraggioso da parte tua");
            }

            if (nemico1.getSalute() > 0) {

                System.out.println("------------");
                danno = nemico1.attacca();

                System.out.println("vuoi difenderti(10 punti energia)? si/premi altro per non difenderti");
                String risposta2 = parole.nextLine();
                if (risposta2.equalsIgnoreCase("si")) {
                    danno = mago.difendi(danno);
                }
                mago.subiscidanno(danno);
            }

        }
    }

    static public void potenziamentipostlivello(Personaggio mago) {

        System.out.println("potenziamento di salute tra 40 e 100");
        Random random = new Random();
        int min = 4;
        int max = 10;
        int numeroCasualeRange = random.nextInt(max - min + 1) + min;
        System.out.println("Numero casuale tra " + min + " e " + max + ": " + numeroCasualeRange);
        mago.setSalute(mago.getSalute() + numeroCasualeRange * 10);
        System.out.println("nuovo livello di salute: " + mago.getSalute());

        System.out.println("potenziamento di energia tra 40 e 100");
        Random random2 = new Random();
        int min2 = 4;
        int max2 = 10;
        int numeroCasualeRange2 = random2.nextInt(max2 - min2 + 1) + min;
        System.out.println("Numero casuale tra " + min2 + " e " + max2 + ": " + numeroCasualeRange2);
        mago.setEnergia(mago.getEnergia() + numeroCasualeRange2 * 10);
        System.out.println("nuovo livello di energia: " + mago.getEnergia());

    }

    static public void whilegrande(Personaggio mago, Nemico nemico1, Nemico nemico2, Nemico nemico3) {
        while (mago.getSalute() > 0) {

            if (nemico1.getSalute() > 0 && mago.getSalute() > 0) {
                System.out.println("------------");
                System.out.println("livello 1, nemico 1 (danni da 10 a 40)");
                mago.aumentaLivello();
            }
            whilelivello(mago, nemico1);

            if (nemico2.getSalute() > 0 && mago.getSalute() > 0) {
                System.out.println("------------");
                System.out.println("livello 2, nemico 2 (danni da 20 a 50)");
                mago.aumentaLivello();
                potenziamentipostlivello(mago);
            }
            whilelivello(mago, nemico2);

            if (nemico3.getSalute() > 0 && mago.getSalute() > 0) {
                System.out.println("------------");
                System.out.println("livello 3, nemico 3 (danni da 30 a 60)");
                mago.aumentaLivello();
                potenziamentipostlivello(mago);
            }
            whilelivello(mago, nemico3);

        }
        
        if (nemico3.getSalute()==0){
            System.out.println("GAME WIN 🎉🎉🎉🎉🎉");
        }
    }

    public static void main(String[] args) {

        Mago mago = new Mago();
        Guerriero guerriero = new Guerriero();
        Ladro ladro =new Ladro();
        Nemico1 nemico1 = new Nemico1();
        Nemico2 nemico2 = new Nemico2();
        Nemico3 nemico3 = new Nemico3();

        System.out.println("premi:\n1 per mago\n2 per guerriero\n3 per ladro\naltro per uscire");
        String risposta = parole.nextLine();

        if (risposta.equals("1")) {

            System.out.println("Hai scelto il mago, le tue caratteristiche sono:");
            System.out.println("salute: " + mago.getSalute() + " energia: " + mago.getEnergia()
                    + "\nl'abilità speciale consiste nell' aumentare la salute di 50");
            whilegrande(mago, nemico1, nemico2, nemico3);

        } else if (risposta.equals("2")) {

            System.out.println("Hai scelto il guerriero, le tue caratteristiche sono:");
            System.out.println("salute: " + guerriero.getSalute() + " energia: " + guerriero.getEnergia()
                    + "\nl'abilità speciale consiste in un attacco con danno potenziato x2");
            whilegrande(guerriero, nemico1, nemico2, nemico3);

        } else if (risposta.equals("3")) {

            System.out.println("Hai scelto il ladro, le tue caratteristiche sono:");
            System.out.println("salute: " + ladro.getSalute() + " energia: " + ladro.getEnergia()
                    + "\nl'abilità speciale consiste nel confondere il nemico e così tanto da provocarsi danno da solo");
            whilegrande(ladro, nemico1, nemico2, nemico3);

        } else {
            System.out.println("bye bye");
        }

        

    }
}
