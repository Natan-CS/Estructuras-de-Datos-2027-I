import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JuegoDeLaVida {
    private Array2D cuadricula;
    private int renglones;
    private int columnas;

    public JuegoDeLaVida(int renglones, int columnas) {
        this.renglones = renglones;
        this.columnas = columnas;
        this.cuadricula = new Array2D(renglones, columnas);
    }

    public void IniciarCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int r = 0;
            while ((linea = br.readLine()) != null && r < renglones) {
                String[] valores  = linea.split(",");
                for (int c = 0; c < valores.length && c < columnas; c++) {
                    cuadricula.setItem(r, c, Integer.parseInt(valores[c].trim()));
                }
                r++;
            }
        } catch (IOException e) {
            System.out.println("Error al cargar archivo");
        }
    }

    private int ContarvecinosVivos(int r, int c) {
        int vivos = 0;
        int [] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int [] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nr < renglones && nc >= 0 && nc < columnas) {
                vivos += cuadricula.getItem(nr, nc);
            }
        }
        return vivos;
    }

    public void calcularSiguienteGeneracion() {
        Array2D nuevaGen = new Array2D(renglones, columnas);

        for (int r = 0; r < renglones; r++) {
            for (int c = 0; c < columnas; c++) {
                int vecinosVivos =  ContarvecinosVivos(r, c);
                int estadoActual = cuadricula.getItem(r, c);

                if (estadoActual == 1) {
                    if (vecinosVivos == 2 || vecinosVivos == 3) {
                        nuevaGen.setItem(r, c, 1);
                    } else {
                        nuevaGen.setItem(r, c, 0);
                    }
                } else {
                    if (vecinosVivos == 3) {
                        nuevaGen.setItem(r, c, 1);
                    } else {
                        nuevaGen.setItem(r, c, 0);
                    }
                }
            }
        }

        cuadricula = nuevaGen;
    }

    public void ImprimirTablero() {
        for (int r = 0; r < renglones; r++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print(cuadricula.getItem(r, c) == 1 ? "0 " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
