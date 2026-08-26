import java.util.Scanner;
import java.io.File;

public class Programa_Inicial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Elección de meses
        System.out.print("Escribe el primer mes para analizar las visitas:");
        String mesPrimero = teclado.next().toLowerCase();

        System.out.print("Escribe el segundo mes para analizar las visitas:");
        String mesSegundo = teclado.next().toLowerCase();

        //Variables
        int twSeguidoresEnero = 0;
        int twSeguidoresJunio = 0;

        int ytVisitas1 = 0;
        int ytVisitas2 = 0;

        int sumaCrecFb = 0;
        int sumaCrecTw = 0;

        int sumaLikesFb = 0;
        int sumaLikesTw = 0;
        int sumaLikesYt = 0;

        try {
            //Analisis del archivo
            File archivo = new File("datos_redes_sociales (1).csv");
            Scanner lector = new Scanner(archivo);

            //Saltamos títulos
            if (lector.hasNextLine()) {
                lector.nextLine();
            }
            //Analiza o escanea línea por línea
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                linea = linea.replace("\"65,41\"", "65410");;

                //Separar la línea por comas
                Scanner separador = new Scanner(linea);
                separador.useDelimiter(",");

                //Extraer las 15 columnas
                String redSocial =  separador.next().trim();
                String concepto =  separador.next().trim();
                String anio =  separador.next().trim();

                String m1 =  separador.next().trim();
                String m2 =  separador.next().trim();
                String m3 =  separador.next().trim();
                String m4 =  separador.next().trim();
                String m5 =  separador.next().trim();
                String m6 =  separador.next().trim();
                String m7 =  separador.next().trim();
                String m8 =  separador.next().trim();
                String m9 =  separador.next().trim();
                String m10 =  separador.next().trim();
                String m11 =  separador.next().trim();
                String m12 =  separador.next().trim();

                separador.close();

                //Análisis de datos

                //1)
                if (redSocial.equals("TWITTER") && concepto.equals("SEGUIDORES (FOLLOWERS)")) {
                    twSeguidoresEnero = Integer.parseInt(m1);
                    twSeguidoresJunio = Integer.parseInt(m6);
                }

                //2)
                if (redSocial.equals("YOUTUBE") && concepto.equals("VISUALIZACIONES")) {
                    //Asigna el mes 1 que el usuario eligio
                    if(mesPrimero.equals("Enero")) ytVisitas1 = Integer.parseInt(m1);
                    else if (mesPrimero.equals("Febrero")) ytVisitas1 = Integer.parseInt(m2);
                    else if (mesPrimero.equals("Marzo")) ytVisitas1 = Integer.parseInt(m3);
                    else if (mesPrimero.equals("Abril")) ytVisitas1 = Integer.parseInt(m4);
                    else if (mesPrimero.equals("Mayo")) ytVisitas1 = Integer.parseInt(m5);
                    else if (mesPrimero.equals("Junio")) ytVisitas1 = Integer.parseInt(m6);
                    else if (mesPrimero.equals("Julio")) ytVisitas1 = Integer.parseInt(m7);
                    else if (mesPrimero.equals("Agosto")) ytVisitas1 = Integer.parseInt(m8);
                    else if (mesPrimero.equals("Septiembre")) ytVisitas1 = Integer.parseInt(m9);
                    else if (mesPrimero.equals("Octubre")) ytVisitas1 = Integer.parseInt(m10);
                    else if (mesPrimero.equals("Noviembre")) ytVisitas1 = Integer.parseInt(m11);
                    else if (mesPrimero.equals("Diciembre")) ytVisitas1 = Integer.parseInt(m12);

                    //Asignar mes 2 que el usuario elija
                    if (mesSegundo.equals("Enero")) ytVisitas2 = Integer.parseInt(m1);
                    else if (mesSegundo.equals("Febrero")) ytVisitas2 = Integer.parseInt(m2);
                    else if (mesSegundo.equals("Marzo")) ytVisitas2 = Integer.parseInt(m3);
                    else if (mesSegundo.equals("Abril")) ytVisitas2 = Integer.parseInt(m4);
                    else if (mesSegundo.equals("Mayo")) ytVisitas2 = Integer.parseInt(m5);
                    else if (mesSegundo.equals("Junio")) ytVisitas2 = Integer.parseInt(m6);
                    else if (mesSegundo.equals("Julio")) ytVisitas2 = Integer.parseInt(m7);
                    else if (mesSegundo.equals("Agosto")) ytVisitas2 = Integer.parseInt(m8);
                    else if (mesSegundo.equals("Septiembre")) ytVisitas2 = Integer.parseInt(m9);
                    else if (mesSegundo.equals("Octubre")) ytVisitas2 = Integer.parseInt(m10);
                    else if (mesSegundo.equals("Noviembre")) ytVisitas2 = Integer.parseInt(m11);
                    else if (mesSegundo.equals("Diciembre")) ytVisitas2 = Integer.parseInt(m12);
                }

                //3) Promedio
                if (redSocial.equals("FACEBOOK") && concepto.equals("CRECIMIENTO (seguidores)")) {
                    sumaCrecFb = Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3) + Integer.parseInt(m4) + Integer.parseInt(m5) + Integer.parseInt(m6);
                }

                if (redSocial.equals("TWITTER") && concepto.equals("CRECIMIENTO DE FOLLOWERS")) {
                    sumaCrecTw = Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3) + Integer.parseInt(m4) + Integer.parseInt(m5) + Integer.parseInt(m6);
                }

                //4) Promedio general
                if (redSocial.equals("FACEBOOK") && concepto.equals("ME GUSTA EN PUBLICACIONES")) {
                    sumaLikesFb = Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3) + Integer.parseInt(m4) + Integer.parseInt(m5) + Integer.parseInt(m6) + Integer.parseInt(m7) + Integer.parseInt(m8) + Integer.parseInt(m9) + Integer.parseInt(m10) + Integer.parseInt(m11) + Integer.parseInt(m12);
                }

                if (redSocial.equals("TWITTER") && concepto.equals("ME GUSTA")) {
                    sumaLikesTw = Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3) + Integer.parseInt(m4) + Integer.parseInt(m5) + Integer.parseInt(m6) + Integer.parseInt(m7) + Integer.parseInt(m8) + Integer.parseInt(m9) + Integer.parseInt(m10) + Integer.parseInt(m11) + Integer.parseInt(m12);
                }

                if (redSocial.equals("YOUTUBE") && concepto.equals("ME GUSTA")) {
                    sumaLikesYt = Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3) + Integer.parseInt(m4) + Integer.parseInt(m5) + Integer.parseInt(m6) + Integer.parseInt(m7) + Integer.parseInt(m8) + Integer.parseInt(m9) + Integer.parseInt(m10) + Integer.parseInt(m11) + Integer.parseInt(m12);
                }
            }
            lector.close();;

            //Cálculos

            System.out.println("  RESULTADOS  ");

            //1)
            int difTwitter = twSeguidoresJunio - twSeguidoresEnero;
            System.out.println("1. Diferencia de seguidores en Twitter (Junio - Enero): " + difTwitter);

            //2)
            int difYoutube = ytVisitas2 - ytVisitas1;
            if (difYoutube < 0) difYoutube = difYoutube * -1; // Valor absoluto
            System.out.println("2. Diferencia de vistas en YouTube (" + mesPrimero + " y " + mesSegundo + "): " + difYoutube);

            //3)
            double promCrecFb = sumaCrecFb / 6.0;
            double promCrecTw = sumaCrecTw / 6.0;
            System.out.println("3. Promedio de crecimiento (Enero-Junio):");
            System.out.println("   Facebook: " + promCrecFb);
            System.out.println("   Twitter: " + promCrecTw);

            //4)
            double promLikesFb = sumaLikesFb / 12.0;
            double promLikesTw = sumaLikesTw / 12.0;
            double promLikesYt = sumaLikesYt / 12.0;
            System.out.println("4. Promedio general de 'Me gusta o Likes':");
            System.out.println("   Facebook: " + promLikesFb);
            System.out.println("   Twitter: " + promLikesTw);
            System.out.println("   YouTube: " + promLikesYt);

        } catch (Exception e) {
            System.out.println("ERROR al leer el archivo ");;
        }
    }
}
