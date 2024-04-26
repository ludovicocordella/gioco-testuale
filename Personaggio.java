
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
        if (salute < 20) {
            System.out.println("Livello di salute basso!");
        }
        return salute;
    }

    public void setSalute(int salute) {
        if (salute >= 0)  {
            this.salute = salute;
        } else{
            System.out.println("La salute non può essere negativa");
        }
    }

    public void subiscidanno(int danno) {
        this.salute= getSalute()-danno;
    }

    


    public int getEnergia() {
        if (energia < 20) {
            System.out.println("Livello di energia basso!");
        }
        return energia;
    }

    // public void setEnergia(int energia) {

    //     if (energia >= 0 && energia <= 100) {
    //         this.energia = energia;
    //     } else if (energia > 100) {
    //         System.out.println("La salute non può essere superiore a 100");
    //     } else if (energia < 0) {
    //         System.out.println("La salute non può essere negativa");
    //     }
        
    // }

    public void setEnergia(int energia) {

        if (energia >= 0 ) {
            this.energia = energia;
        } else  {
            System.out.println("L'energia non può essere negativa");
        }
        
    }

    public int getLivello() {
        return livello;
    }

    public void aumentaLivello() {
        this.livello += 1;
    }

    
    public abstract int attacca();

    public abstract int difendi(int attacco);

    public abstract void abilità();

}