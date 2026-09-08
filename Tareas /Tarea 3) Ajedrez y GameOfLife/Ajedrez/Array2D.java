public class Array2D {
    public int renglones;
    private int columnas;
    private String[][] datos;

    public Array2D(int renglones, int columnas) {
        this.renglones = renglones;
        this.columnas = columnas;
        this.datos = new String[renglones][columnas];
    }

    public void setItem(int r, int c, String valor) {
        if (r >= 0 && r < renglones && c >= 0 && c < columnas) {
            datos[r][c] = valor;
        }
    }

    public String getItem(int r, int c) {
        if (r >= 0 && r < renglones && c >= 0 && c < columnas) {
            return datos[r][c];
        }
        return " ";
    }

    public int getRenglones() { return renglones; }
    public int getColumnas() { return columnas; }
}
