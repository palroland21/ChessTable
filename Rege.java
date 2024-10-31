public class Rege {
        private final int rows = 8;
        private final int cols = 8;
        private int x, y;
        private TablaSah tabla;

        public Rege(int x, int y, TablaSah tabla){
            this.x = x;
            this.y = y;
            this.tabla = tabla;
        }


        public void mutareRege(int pozRow, int pozCol){
            if( pozRow < 0 || pozRow >= 8 || pozCol < 0 || pozRow >= 8){
                System.out.println("Pozitie invalida!");
                return;
            }
            if( this.x >= pozRow + 2 || this.y >= pozCol + 2){
                System.out.println("Mutare nevalida!");
                return;
            }

            if(this.tabla.getPosition(pozRow, pozCol) != '_'){
                System.out.println("Pozitie ocupata!");
                return;
            }

            System.out.println("Mutare posibila!");
        }
}
