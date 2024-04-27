
// Classe astratta Personaggio
abstract class Personaggio {

    private int salute;
    private int energia;
    private int livello;

    public Personaggio(int salute, int energia, int livello) {
        this.salute = salute;
        this.energia = energia;
        this.livello = livello;
    }

    public int getSalute() {
        if (salute < 0) {
            return 0;
            

        } 
        return salute;
    }

    public void setSalute(int salute) {
        if (salute > 0)  {
            this.salute = salute;
        } else{
            System.out.println("La salute non può essere negativa");
        }
    }

    public void subiscidanno(int danno) {
        this.salute= getSalute()-danno;
        if(salute<=0){
            System.out.println("Salute esaurita...\nGAME OVER\n :( :( :(");
        } else if (salute < 20) {
            System.out.println("Livello di salute basso!");
        }else {
        System.out.println("salute rimasta "+ salute);}
    }

    public void aumentoenergia(){

        int salutepersa=10;
        int energiapresa=10;

        this.salute= this.salute-salutepersa;
        this.energia= this.energia+energiapresa;
        System.out.println("salute: "+ getSalute()+" energia: "+ getEnergia());

    }


    public int getEnergia() {
        
        return energia;
    }


    public void setEnergia(int energia) {

        if (energia >= 0 ) {
            this.energia = energia;
        } if (energia < 20) {
            System.out.println("Livello di energia basso!");
        }
        
    }

    public int getLivello() {
        return livello;
    }

    public void aumentaLivello() {
        this.livello += 1;
        if(livello>1){
        System.out.println("livello aumentato, livello attuale: "+ livello);}
    }

    
    public abstract int attacca();

    public abstract int difendi(int attacco);

    public abstract int abilità();

    public abstract int riduciDanni(int difesa, int attacco); 

}