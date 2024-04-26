abstract class Nemico{

    private int salute;
    
    public Nemico(int salute){
        this.salute=salute;
    }

    public int getSalute() {
         if (salute < 0) {
             return 0;
         }
        return salute;
    }

    // public void setSalute(int salute) {
    //     if (salute >= 0 && salute <= 100) {
    //         this.salute = salute;
    //     } else  {
    //         System.out.println("La salute non può essere negativa");
    //     }
    // }

    public  void subiscidanno(int danno){
        if(danno>0){
        this.salute= getSalute() - danno;
        System.out.println("il nemico ha subito danno, salute rimasta: "+ getSalute());}
    }

    public abstract int attacca();

   


}
