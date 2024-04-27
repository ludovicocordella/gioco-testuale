import java.util.Random;
import java.util.Scanner;

public class Ladro extends Personaggio {

    public Ladro() {
        super(70, 90, 0);
    }

    // restituisce un danno che dipende dal livello e un lancio casuale, se non si
    // ha energia restituisce zero
    public int attacca() {
        System.out.println("il ladro attacca: ");
        int costoEnergia = 10;
        if (getEnergia() >= costoEnergia) {
            setEnergia(getEnergia() - costoEnergia);
            System.out.println(
                    "l'attacco ha un costo di " + costoEnergia + " ti rimangono " + getEnergia() + " di energia");
            Scanner parole = new Scanner(System.in);
            System.out.println("premere invio per lanciare il dado a 4 facce");
            String dado = parole.nextLine();
            Random random = new Random();
            int min = 1;
            int max = 4;
            int numeroCasualeRange = random.nextInt(max - min + 1) + min;
            System.out.println("Numero casuale tra " + min + " e " + max + ": " + numeroCasualeRange);

            System.out.println("Danni: " + numeroCasualeRange*10 * getLivello());
            return numeroCasualeRange*10*getLivello();

        } else {
            System.out.println("Non hai abbastanza energia per attaccare");
            return 0;
        }

    }

    // restituisce il danno dato come input tolto di una parte random, se non si ha
    // energia restituisce attacco
    public int difendi(int attacco) {
        System.out.println("il ladro si difende: ");
        int costoEnergia = 10;
        if (getEnergia() >= costoEnergia) {

            setEnergia(getEnergia() - costoEnergia);
            System.out.println(
                    "la difesa ha un costo di " + costoEnergia + " ti rimangono " + getEnergia() + " di energia");
            Scanner parole = new Scanner(System.in);
            System.out.println("premere invio per lanciare il dado a 4 facce");
            String dado = parole.nextLine();
            Random random = new Random();
            int min = 2;
            int max = 5;
            int numeroCasualeRange = random.nextInt(max - min + 1) + min;
            System.out.println("Numero casuale tra " + min + " e " + max + ": " + numeroCasualeRange);
            int dif;

            System.out.println("Difesa: " + 10 * numeroCasualeRange* getLivello());
                    dif = 10* numeroCasualeRange * getLivello();
                    System.out.println("Hai attivato l'abilità di difesa e il danno è ora pari a "
                            + riduciDanni(dif, attacco) + " punti.");
                    return riduciDanni(dif, attacco);


        } else {
            System.out.println("Non hai abbastanza energia per difenderti, danno pieno di " + attacco);
            return attacco;
        }
    }

    public int riduciDanni(int difesa, int attacco) {

        int danniRidotti = attacco - difesa;
        if (danniRidotti > 0) {
            return danniRidotti;
        } else {
            return 0;
        }
    }

    public int abilità() {
        System.out.println("il ladro usa abilità speciale: il nemico si provocherà danno da solo al prossimo attacco ");
        
       
        int costoEnergia = 50;
        if (getEnergia() >= costoEnergia) {
            setEnergia(getEnergia() - costoEnergia);
            System.out.println(
                    "l'attacco speciale ha un costo di " + costoEnergia + " ti rimangono " + getEnergia() + " di energia");
            
            return 1;

        } else {
            System.out.println("Non hai abbastanza energia per usare abilità speciale");
            return 0;
        }

    }




    
}

