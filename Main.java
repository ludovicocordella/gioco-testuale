import java.util.Scanner;

public class Main {
    static Scanner parole=new Scanner(System.in);

    public static void main(String[] args) {
        
        int danno; 

        Mago mago = new Mago();
        Nemico1 nemico1 =new Nemico1();

        //nemico1.subiscidanno(mago.attacca());

        // danno= mago.difendi(nemico1.attacca());
        // mago.subiscidanno(danno);
        // System.out.println(mago.getSalute());

        //mago.abilità();

        while(mago.getSalute()>0){
            System.out.println("salute: "+ mago.getSalute()+ " energia: "+ mago.getEnergia());
            System.out.println("livello 1, nemico 1 \n1 per attaccare (10 punti energia) \n2 per abilità speciale (50 punti energia)\naltro per non fare nulla");
            String risposta=parole.nextLine();
            if (risposta.equals("1")){

                nemico1.subiscidanno(mago.attacca());


            }else if(risposta.equals("2")){

            } else{
                System.out.println("coraggioso da parte tua");
            }

        }


    }
}
