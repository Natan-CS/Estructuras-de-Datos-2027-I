public class Empleado {
    private int numTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtras;
    private double sueldoBase;
    private int anioDeIngreso;

    public Empleado(int numTrabajador, String nombre, String paterno, String materno, int horasExtras, double sueldoBase, int anioDeIngreso) {
        this.numTrabajador = numTrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtras = horasExtras;
        this.sueldoBase = sueldoBase;
        this.anioDeIngreso = anioDeIngreso;
    }

    public int getAntiguedad() {
        return 2026 - this.anioDeIngreso;
    }

    public double calcularSueldoTotal() {
        double pagoExtra = this.horasExtras * 276.5;
        double prestacion = this.sueldoBase * (this.getAntiguedad() * 0.03);
        return this.sueldoBase + pagoExtra + prestacion;
    }

    public String getNombreCompleto() {
        return nombre + " " + paterno + " " + materno;
    }

    @Override
    public String toString() {
        return "ID: " + numTrabajador + " Nombre: " + getNombreCompleto() + " Antigüedad: " + getAntiguedad() + " Años - Sueldo Total: $ " + calcularSueldoTotal();
    }
}
