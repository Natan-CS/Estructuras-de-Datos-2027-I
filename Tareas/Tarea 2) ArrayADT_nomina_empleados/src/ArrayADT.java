public class ArrayADT {
    private Object[] datos;
    private int tamanio;

    public ArrayADT(int tamanio) {
        this.tamanio = tamanio;
        this.datos = new Object[tamanio];
    }

    public int getLength() {
        return this.tamanio;
    }

    public void setItem(int indice, Object elemento) {
        if (indice >= 0 && indice < this.tamanio) {
            this.datos[indice] = elemento;
        }
    }

    public Object getItem(int indice) {
        if (indice >= 0 && indice < this.tamanio) {
            return this.datos[indice];
        }
        return null;
    }
}
