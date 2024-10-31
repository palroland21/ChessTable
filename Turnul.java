public class Turnul {
    private final int rows = 8;
    private final int cols = 8;
    private int x,y;
    private TablaSah tabla;
    int regina_ok = 0;

    public Turnul(int x, int y, TablaSah tabla){
        this.x = x;
        this.y = y;
        this.tabla = tabla;
    }

    public void mutareTurn(int pozRow, int pozCol) {
        if (pozRow < 0 || pozRow >= 8 || pozCol < 0 || pozRow >= 8) {
            System.out.println("Pozitie invalida!");
            return;
        }
        if( (pozRow != this.x && pozCol == this.y) || (pozRow == this.x && pozCol != this.y)){
            // Deplasare pe verticala-sus
            for (int i = this.x + 1; i <= pozRow; i++) {
                if (this.tabla.getPosition(i, pozCol) != '_') {
                    System.out.println("Pozitie/cale ocupata!");
                    return;
                }
            }

            // Deplasare pe verticala-jos
            for (int i = this.x - 1; i >= pozRow; i--) {
                if (this.tabla.getPosition(i, pozCol) != '_') {
                    System.out.println("Pozitie/cale ocupata!");
                    return;
                }
            }

            // Deplasare pe orizontala-drp
            for (int i = this.y + 1; i <= pozCol; i++) {
                if (this.tabla.getPosition(pozRow, i) != '_') {
                    System.out.println("Pozitie/cale ocupata!");
                    return;
                }
            }

            // Deplasare pe orizontala-stg
            for (int i = this.y- 1; i >= pozRow; i--) {
                if (this.tabla.getPosition(pozRow, i) != '_') {
                    System.out.println("Pozitie/cale ocupata!");
                    return;
                }
            }

            System.out.println("Mutare posibila!");
            regina_ok = 1;
            return;

        } else {
            System.out.println("Mutare imposibila pentru turn!");
        }

    }
    }
