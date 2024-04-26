abstract class Nemico{

    private int salute;
    
    public Nemico(int salute){
        this.salute=salute;
    }

    public int getSalute() {
        if (salute < 20) {
            System.out.println("Livello di salute nemico basso!");
        }
        return salute;
    }

    public void setSalute(int salute) {
        if (salute >= 0 && salute <= 100) {
            this.salute = salute;
        } else  {
            System.out.println("La salute non può essere negativa");
        }
    }

    public  void subiscidanno(int danno){
        this.salute= getSalute() - danno;
        System.out.println("il nemico ha subito danno, salute rimasta: "+ getSalute());
    }

    public abstract int attacca();

   


}
