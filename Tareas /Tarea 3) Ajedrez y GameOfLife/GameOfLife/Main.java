public class Main {
    public static void main(String[] args) {

        int renglones = 10;
        int columnas = 10;

        JuegoDeLaVida juego = new JuegoDeLaVida(renglones, columnas);

        System.out.println("Generacion 0 (Inicial)");
        juego.IniciarCSV("poblacion.csv");
        juego.ImprimirTablero();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Generación " + i + ":");
            juego.calcularSiguienteGeneracion();
            juego.ImprimirTablero();
        }
    }
}