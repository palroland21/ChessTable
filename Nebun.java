public class Nebun {
    private final int rows = 8;
    private final int cols = 8;
    private int x,y;
    private TablaSah tabla;
    int regina_ok = 0;

    public Nebun(int x, int y, TablaSah tabla){
        this.x = x;
        this.y = y;
        this.tabla = tabla;
    }

    public void mutareNebun(int pozRow, int pozCol) {
        if (pozRow < 0 || pozRow >= 8 || pozCol < 0 || pozRow >= 8) {
            System.out.println("Pozitie invalida!");
            return;
        }

        int i = this.x + 1;
        int j = this.y + 1;
        // Deplasare dreapta-jos
        while((i < 8 && j < 8) && (i >= pozRow && j <= pozCol)){
            if (this.tabla.getPosition(i, j) != '_') {
                System.out.println("Pozitie ocupata!");
                return;
            }
            i++;
            j++;
        }

        // Deplasare dreapta-sus
        i = this.x - 1;
        j = this.y + 1;
        while( (i >= 0 && j < 8) && (i <= pozRow && j <= pozCol) ){
            if (this.tabla.getPosition(i, j) != '_') {
                System.out.println("Pozitie ocupata!");
                return;
            }
            i--;
            j++;
        }

        // Deplasare stanga-jos
        i = this.x + 1;
        j = this.y - 1;
        while((i < 8 && j >= 0) && (i >= pozRow && j >= pozCol) ){
            if (this.tabla.getPosition(i, j) != '_') {
                System.out.println("Pozitie ocupata!");
                return;
            }
            i++;
            j--;
        }

        // Deplasare stanga-sus
        i = this.x - 1;
        j = this.y - 1;
        while((i >= 0 && j >= 0) && (i <= pozRow && j >= pozCol) ){
            if (this.tabla.getPosition(i, j) != '_') {
                System.out.println("Pozitie ocupata!");
                return;
            }
            i--;
            j--;
        }

        System.out.println("Mutare posibila!");
        regina_ok = 1;

    }

}
