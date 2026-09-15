import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> dimensionesVisitadas = new HashSet<>();

        System.out.println("-DIMENSIONES DE MINECRAFT-");

        //Prueba 1: El Jugador aparece en el Overworld
        System.out.println("El Jugador Aparece en el Mundo... ");
        dimensionesVisitadas.add("Overworld");
        imprimirEstado(dimensionesVisitadas);

        //Prueba 2: El jugador crea un portal y va al Nether
        System.out.println("El Jugador Crea y Entra en un Portal de Obsidiana... ");
        dimensionesVisitadas.add("Nether");
        imprimirEstado(dimensionesVisitadas);

        //Prueba 3:El jugador regresa al Overworld (prueba de duplicado)
        System.out.println("El Jugador Regresa... ");
        dimensionesVisitadas.add("Overworld");
        imprimirEstado(dimensionesVisitadas);

        //Prueba 4:El jugador viaja al END
        System.out.println("El Jugador Entra en el Portal del End... ");
        dimensionesVisitadas.add("END");
        imprimirEstado(dimensionesVisitadas);

        //Prueba 5:Verificación
        System.out.println(" Revisióion de Logros ");
        if (dimensionesVisitadas.contains("END") && dimensionesVisitadas.contains("Nether")) {
            System.out.println("Felicidades has visitado TODAS las dimensiones del juego");
        }

        System.out.println("Total de dimensiones descubiertas: " + dimensionesVisitadas.size() + "/3");
    }

    private static void imprimirEstado(Set<String> dimensiones) {
        System.out.println("Dimensiones descubiertas hasta ahora: " + dimensiones);
    }
}