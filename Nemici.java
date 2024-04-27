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

   

    public  void subiscidanno(int danno){
        if(danno>0){
        this.salute= getSalute() - danno;
        System.out.println("il nemico ha subito danno, salute rimasta: "+ getSalute());}
    }

    public abstract int attacca();

   


}
