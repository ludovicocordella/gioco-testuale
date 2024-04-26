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

                mago.abilità();

            } else {
                System.out.println("coraggioso da parte tua");
            }
            
            if(nemico1.getSalute()>0){

            System.out.println("------------");
            danno = nemico1.attacca();

            System.out.println("vuoi difenderti(10 punti energia)? si/premi altro per non difenderti");
            String risposta2 = parole.nextLine();
            if (risposta2.equalsIgnoreCase("si")) {
                danno = mago.difendi(danno);
            }
            mago.subiscidanno(danno);}

        }
    }

    static public void potenziamentipostlivello(Personaggio mago) {
        System.out.println("potenziamento di salute tra 30 e 80");
        Scanner parole = new Scanner(System.in);
        System.out.println("premere invio per lanciare il dado");
        String dado = parole.nextLine();
        Random random = new Random();
        int min = 5;
        int max = 10;
        int numeroCasualeRange = random.nextInt(max - min + 1) + min;
        System.out.println("Numero casuale tra " + min + " e " + max + ": " + numeroCasualeRange);
        mago.setSalute(mago.getSalute()+numeroCasualeRange*10);
        System.out.println("nuovo livello di salute: "+mago.getSalute());

        System.out.println("potenziamento di energia tra 30 e 80");
        System.out.println("premere invio per lanciare il dado");
        String dado2 = parole.nextLine();
        Random random2 = new Random();
        int min2 = 5;
        int max2 = 10;
        int numeroCasualeRange2 = random2.nextInt(max2 - min2 + 1) + min;
        System.out.println("Numero casuale tra " + min2 + " e " + max2 + ": " + numeroCasualeRange2);
        mago.setEnergia(mago.getEnergia()+numeroCasualeRange2*10);
        System.out.println("nuovo livello di energia: "+mago.getEnergia());


    }

    public static void main(String[] args) {

        Mago mago = new Mago();
        Nemico1 nemico1 = new Nemico1();
        Nemico2 nemico2 = new Nemico2();
        Nemico3 nemico3 = new Nemico3();

        System.out.println("Hai scelto il mago, le tue caratteristiche sono:");
        System.out.println("salute: " + mago.getSalute() + " energia: " + mago.getEnergia());

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
    }
}
