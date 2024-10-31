public class Regina {private final int rows = 8;
    private final int cols = 8;
    private int x,y;
    private TablaSah tabla;
    private Turnul turn;
    private Nebun nebun;

    public Regina(int x, int y, TablaSah tabla){
        this.x = x;
        this.y = y;
        this.tabla = tabla;
        this.turn = new Turnul(x,y, tabla);
        this.nebun = new Nebun(x,y,tabla);
    }

    public void mutareRegina(int pozRow, int pozCol) {
        System.out.print("Mutare in functie de turn: ");
        turn.mutareTurn(pozRow, pozCol);
        System.out.print("Mutare in functie de nebun: ");
        nebun.mutareNebun(pozRow, pozCol);
        if( turn.regina_ok == 1 || nebun.regina_ok == 1){
            System.out.println("Concluzie: Mutare posibila!");
        } else {
            System.out.println("Concluzie: Mutare invalida!");
        }
    }
}
