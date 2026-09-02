import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File archivo = new File("junio.dat");

            Scanner lectorConteo = new Scanner(archivo);
            lectorConteo.nextLine();
            int lineas = 0;
            while (lectorConteo.hasNextLine()) {
                lectorConteo.nextLine();
                lineas++;
            }
            lectorConteo.close();

            ArrayADT empleados = new ArrayADT(lineas);

            Scanner lectorDatos =new Scanner(archivo);
            lectorDatos.nextLine();

            int i = 0;
            while (lectorDatos.hasNextLine()) {
                String linea = lectorDatos.nextLine();
                String[] datos = linea.split(",");

                int num =  Integer.parseInt(datos[0].trim());
                String nom = datos[1].trim();
                String pat = datos[2].trim();
                String mat =  datos[3].trim();
                int hExtra = Integer.parseInt(datos[4].trim());
                double sueldo = Double.parseDouble(datos[5].trim());
                int anio = Integer.parseInt(datos[6].trim());

                Empleado emp = new Empleado(num, nom, pat, mat, hExtra, sueldo, anio);
                empleados.setItem(i, emp);
                i++;
            }
            lectorDatos.close();

            System.out.println(" NÓMINA GENERAL ");
            for (int j = 0; j < empleados.getLength(); j++) {
                Empleado emp = (Empleado) empleados.getItem(j);
                System.out.println(emp.toString());
            }

            Empleado mayor = (Empleado) empleados.getItem(0);
            Empleado menor = (Empleado) empleados.getItem(0);

            for (int j = 1; j < empleados.getLength(); j++) {
                Empleado actual = (Empleado) empleados.getItem(j);
                if (actual.getAntiguedad() > mayor.getAntiguedad()) {
                    mayor = actual;
                }
                if (actual.getAntiguedad() < menor.getAntiguedad()) {
                    menor = actual;
                }
            }

            System.out.println(" MAYOR Y MENOR ANTIGÜEDAD ");
            System.out.println("Mayor Antigüedad: " + mayor.getNombreCompleto() + " (" +  mayor.getAntiguedad() + " años)");
            System.out.println("Menor Antigüedad: " + menor.getNombreCompleto() + " (" + menor.getAntiguedad() + " años)");
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo");
        }
    }
}