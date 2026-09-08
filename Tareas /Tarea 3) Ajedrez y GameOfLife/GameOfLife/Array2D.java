public class Array2D {
    private int renglones;
    private int columnas;
    private int[][] datos;

    public Array2D(int renglones, int columnas) {
        this.renglones = renglones;
        this.columnas = columnas;
        this.datos = new int[renglones][columnas];
    }

    public void setItem (int r, int c, int valor) {
        if (r >= 0 && r < renglones && c >= 0 && c < columnas) {
            datos[r][c] = valor;
        }
    }

    public int getItem (int r, int c) {
        if (r >= 0 && r < renglones && c >= 0 && c < columnas) {
            return datos[r][c];
        }
        return 0;
    }

    public int getRenglones() {return renglones; }
    public int getColumnas() { return columnas; }
}
