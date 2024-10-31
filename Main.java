public class Main {
    public static void main(String[] args) {
        int rows = 8, cols = 8;
        char[][] tablaTest = new char[8][8];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                tablaTest[i][j] = '_';
            }
        }

        System.out.println("Tabla de sah initiala: ");
        tablaTest[0][0] = 'P';
        tablaTest[2][4] = 'Q';
        tablaTest[1][3] = 'N';
        tablaTest[7][4] = 'Q';
        tablaTest[4][7] = 'P';
        tablaTest[2][3] = 'P';
        tablaTest[0][5] = 'C';
        tablaTest[0][3] = 'N';
        tablaTest[2][4] = 'Q';
        tablaTest[4][4] = 'P';


        TablaSah tabla2 = new TablaSah(tablaTest);
        tabla2.afisareTable();
        System.out.println();

        // System.out.println("Tabla de sah dupa pozitionarea pieselor in starea initiala: ");
        // tabla2.initializareTabla();
        // tabla2.afisareTable();

        tabla2.setPosition(4, 4, 'R');
        tabla2.setPosition(5, 3, 'Q');
        tabla2.setPosition(3, 2, 'B');
        tabla2.setPosition(7, 5, 'K');
        tabla2.setPosition(5, 5, 'C');

        System.out.println("Tabla de sah dupa adaugarea pieselor: ");
        tabla2.afisareTable();

        System.out.println("PION(P): ");
        Pion pionul1 = new Pion(4, 7, tabla2);
        System.out.print("Test1: "); pionul1.mutarePion(5, 7);
        System.out.print("Test2: "); pionul1.mutarePion(4, 6);

        System.out.println("\nTURN(R): ");
        Turnul turn1 = new Turnul(4, 4, tabla2);
        System.out.print("Test1: "); turn1.mutareTurn(5, 7);
        System.out.print("Test2: "); turn1.mutareTurn(4, 6);
        System.out.print("Test3: "); turn1.mutareTurn(6, 4);

        System.out.println("\nNEBUN(B): ");
        Nebun nebun1 = new Nebun(3, 2, tabla2);
        System.out.print("Test1: "); nebun1.mutareNebun(2, 3);
        System.out.print("Test2: "); nebun1.mutareNebun(4, 0);
        System.out.print("Test3: "); nebun1.mutareNebun(4, 5);

        System.out.println("\nREGINA(Q): ");
        Regina reg = new Regina(4, 3, tabla2);
        System.out.println("Test1: "); reg.mutareRegina(5,3);
        System.out.println("Test2: "); reg.mutareRegina(3, 4);
        System.out.println("Test3: "); reg.mutareRegina(5, 4);

        System.out.println("\nREGE(K): ");
        Rege rege = new Rege(7, 5, tabla2);
        System.out.print("Test1: "); rege.mutareRege(8, 6);
        System.out.print("Test1: "); rege.mutareRege(6, 5);
        System.out.print("Test1: "); rege.mutareRege(5, 2);

        System.out.println("\nCAL(C): ");
        Cal cal1 = new Cal(5, 5, tabla2);
        System.out.print("Test1: "); cal1.mutareCal(7, 4);
        System.out.print("Test1: "); cal1.mutareCal(4, 3);
        System.out.print("Test1: "); cal1.mutareCal(5, 7);
    }
}