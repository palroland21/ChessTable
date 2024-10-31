public class Cal {
        private final int rows = 8;
        private final int cols = 8;
        private int x, y;
        private TablaSah tabla;

        public Cal(int x, int y, TablaSah tabla){
            this.x = x;
            this.y = y;
            this.tabla = tabla;
        }


        public void mutareCal(int pozRow, int pozCol){
            if( pozRow < 0 || pozRow >= 8 || pozCol < 0 || pozRow >= 8){
                System.out.println("Pozitie invalida!");
                return;
            }

            // Deplasari mai mult pe verticala

            // Sus-dreapta
            if(this.x == pozRow - 2 && this.y == pozCol - 1){
                System.out.println("Mutare posibila!");
                return;
            }

            // Sus-stanga
            if(this.x == pozRow - 2 && this.y == pozCol + 1){
                System.out.println("Mutare posibila!");
                return;
            }

            // Jos-dreapta
            if(this.x == pozRow + 2 && this.y == pozCol - 1){
                System.out.println("Mutare posibila!");
                return;
            }

            // Jos-stanga
            if(this.x == pozRow + 2 && this.y == pozCol + 1){
                System.out.println("Mutare posibila!");
                return;
            }

            // Deplasari mai mult pe orizontala

            // Sus-dreapta
            if(this.x == pozRow - 1 && this.y == pozCol - 2){
                System.out.println("Mutare posibila!");
                return;
            }

            // Sus-stanga
            if(this.x == pozRow - 1 && this.y == pozCol + 2){
                System.out.println("Mutare posibila!");
                return;
            }

            // Jos-dreapta
            if(this.x == pozRow + 1 && this.y == pozCol - 2){
                System.out.println("Mutare posibila!");
                return;
            }

            // Jos-stanga
            if(this.x == pozRow + 1 && this.y == pozCol + 2){
                System.out.println("Mutare posibila!");
                return;
            }

            System.out.println("Mutare imposibila!");

        }
}
