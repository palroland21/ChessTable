public class Pion {
    private final int rows = 8;
    private final int cols = 8;
    private int x, y;
    private TablaSah tabla;

    public Pion(int x, int y, TablaSah tabla){
        this.x = x;
        this.y = y;
        this.tabla = tabla;
    }


    public void mutarePion(int pozRow, int pozCol){
       if( pozRow < 0 || pozRow >= 8 || pozCol < 0 || pozRow >= 8){
           System.out.println("Pozitie invalida!");
           return;
       }
       if(this.tabla.getPosition(pozRow, pozCol) != '_'){
           System.out.println("Pozitie ocupata!");
           return;
       }
       if( (this.x == pozRow +1 || this.x == pozRow - 1) && (this.y == pozCol) ){
           System.out.println("Mutare posibila!");
       } else {
           System.out.println("Pozitie invalida!");
       }

    }
}
