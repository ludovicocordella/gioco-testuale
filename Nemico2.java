import java.util.Random;

public class Nemico2 extends Nemico{

    public Nemico2() {
        super(150);
    }

    public  int attacca(){
        System.out.println("il nemico attacca: ");
        Random random = new Random();
            int min = 1;
            int max = 4;
            int numeroCasualeRange = random.nextInt(max - min + 1) + min;
            System.out.println("Numero casuale tra " + min + " e " + max + ": " + numeroCasualeRange);

            switch (numeroCasualeRange) {
                case 1:
                    System.out.println("Danni: " + 20 ); //se modifichi danno, sia qui che riga sotto, sia nel system out nel main
                    return 20 ;
                case 2:
                    System.out.println("Danni: " + 30 );
                    return 30 ;
                case 3:
                    System.out.println("Danni: " + 40 );
                    return 40 ;
                case 4:
                    System.out.println("Danni: " + 50 );
                    return 50 ;
                default:
                    return 0;
            }
    }

    
}
