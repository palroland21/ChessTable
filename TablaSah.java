public class TablaSah {
    private char[][] table;
    private final int rows = 8;
    private final int cols = 8;

    public TablaSah(char[][] tabla){
        this.table = tabla;
    }

    public TablaSah(){
        char[][] tab = new char[8][8];
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                tab[i][j] = '_';
            }
        }

        this(tab);
    }

    public void initializareTabla(){

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                this.table[i][j] = '_';
            }
        }

        // Piesele negre
        this.table[0][0] = this.table[0][7] = 'R';
        this.table[0][1] = this.table[0][6] = 'K';
        this.table[0][2] = this.table[0][5] = 'B';
        this.table[0][3] = 'Q';
        this.table[0][4] = 'K';

        for(int i=0; i<8; i++){
            this.table[1][i] = 'P';
        }

        // Piesele albe
        this.table[7][0] = this.table[7][7] = 'r';
        this.table[7][1] = this.table[7][6] = 'k';
        this.table[7][2] = this.table[7][5] = 'b';
        this.table[7][3] = 'q';
        this.table[7][4] = 'k';

        for(int i=0; i<8; i++){
            this.table[6][i] = 'p';
        }
    }

    public void afisareTable(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(this.table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public char getPosition(int x, int y){
         return this.table[x][y];
    }
    public void setPosition(int x, int y, char item){
        this.table[x][y] = item;
    }

}
