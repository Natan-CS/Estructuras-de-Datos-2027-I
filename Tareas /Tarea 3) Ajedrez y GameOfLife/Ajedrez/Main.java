public class Main {
    public static void main(String[] args) {
        Array2D tablero = new Array2D(8, 8);

        String[] piezasNegras = {"\u265C", "\u265E", "\u265D", "\u265B", "\u265A", "\u265D", "\u265E", "\u265C"};
        String peonNegro = "\u265F";
        String[] piezasBlancas = {"\u2656", "\u2658", "\u2657", "\u2655", "\u2654", "\u2657", "\u2658", "\u2656"};
        String peonBlanco = "\u2659";

        for (int c = 0; c < 8; c++) {
            tablero.setItem(0, c, piezasNegras[c]);
            tablero.setItem(1, c, peonNegro);

            for (int r = 2; r < 6; r++) {
                tablero.setItem(r, c, " ");
            }

            tablero.setItem(6, c, peonBlanco);
            tablero.setItem(7, c, piezasBlancas[c]);
        }

        for (int r = 0; r < 8; r++) {
            System.out.print((8 - r) + " ");
            for (int c = 0; c < 8; c++) {
                System.out.print(tablero.getItem(r, c) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}