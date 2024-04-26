import java.util.Random;
import java.util.Scanner;

public class Mago extends Personaggio {

    public Mago() {
        super(60, 100, 0);
    }

    // restituisce un danno che dipende dal livello e un lancio casuale, se non si
    // ha energia restituisce zero
    public int attacca() {
        System.out.println("il mago attacca: ");
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

            switch (numeroCasualeRange) {
                case 1:
                    System.out.println("Danni: " + 10 * getLivello());
                    return 10 * getLivello();
                case 2:
                    System.out.println("Danni: " + 20 * getLivello());
                    return 20 * getLivello();
                case 3:
                    System.out.println("Danni: " + 30 * getLivello());
                    return 30 * getLivello();
                case 4:
                    System.out.println("Danni: " + 40 * getLivello());
                    return 40 * getLivello();
                default:
                    return 0;
            }
        } else {
            System.out.println("Non hai abbastanza energia per attaccare");
            return 0;
        }

    }

    // restituisce il danno dato come input tolto di una parte random, se non si ha
    // energia restituisce attacco
    public int difendi(int attacco) {
        System.out.println("il mago si difende: ");
        int costoEnergia = 10;
        if (getEnergia() >= costoEnergia) {

            setEnergia(getEnergia() - costoEnergia);
            System.out.println(
                    "la difesa ha un costo di " + costoEnergia + " ti rimangono " + getEnergia() + " di energia");
            Scanner parole = new Scanner(System.in);
            System.out.println("premere invio per lanciare il dado a 4 facce");
            String dado = parole.nextLine();
            Random random = new Random();
            int min = 1;
            int max = 4;
            int numeroCasualeRange = random.nextInt(max - min + 1) + min;
            System.out.println("Numero casuale tra " + min + " e " + max + ": " + numeroCasualeRange);
            int dif;
            switch (numeroCasualeRange) {
                case 1:

                    System.out.println("Difesa: " + 10 * getLivello());
                    dif = 10 * getLivello();
                    System.out.println("Hai attivato l'abilità di difesa e il danno è ora pari a "
                            + riduciDanni(dif, attacco) + " punti.");
                    return riduciDanni(dif, attacco);

                case 2:
                    System.out.println("Difesa: " + 20 * getLivello());
                    dif = 20 * getLivello();
                    System.out.println("Hai attivato l'abilità di difesa e il danno è ora pari a "
                            + riduciDanni(dif, attacco) + " punti.");
                    return riduciDanni(dif, attacco);

                case 3:

                    System.out.println("Difesa: " + 30 * getLivello());
                    dif = 30 * getLivello();
                    System.out.println("Hai attivato l'abilità di difesa e il danno è ora pari a "
                            + riduciDanni(dif, attacco) + " punti.");
                    return riduciDanni(dif, attacco);

                case 4:

                    System.out.println("Difesa: " + 40 * getLivello());
                    dif = 40 * getLivello();
                    System.out.println("Hai attivato l'abilità di difesa e il danno è ora pari a "
                            + riduciDanni(dif, attacco) + " punti.");
                    return riduciDanni(dif, attacco);

                default:

                    return 0;
            }

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

    public void abilità() {
        System.out.println("il mago usa abilità spaciale: ");
        int costoEnergia = 50;
        int aumentoSalute = 50;
        if (getEnergia() >= costoEnergia ) {
            if (getSalute()+aumentoSalute <= 100){


            setEnergia(getEnergia() - costoEnergia);
            System.out.println(
                    "l' abilità speciale ha un costo di " + costoEnergia + " ti rimangono " + getEnergia() + " di energia");
            setSalute(getSalute() + aumentoSalute);
            System.out.println("Hai attivato l'abilità speciale: aumento della salute di " + aumentoSalute + " punti. Salute: "+ getSalute());

            } else{
                setSalute(getSalute() + aumentoSalute);
            }
        } else {
            System.out.println("Non hai abbastanza energia, non puoi attivare l'abilità speciale");

        }
    }

}
