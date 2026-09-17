package mx.unam.aragon.ico.edd.listas;

public class Main {
    public static void main (String[] args) {
        System.out.println(" Práctica de listas enlazadas ");

        Nodo<String> head = new Nodo<>("De", new Nodo<>("Mc"));

        System.out.println(" Estado inicial completo de la lista ");
        imprimirLista(head);

        //Imprimir el dato almacenado en el primer nodo
        System.out.println("\n3. Dato en el primer Nodo:");
        System.out.println(head.getDato());

        //Imprimir el estado completo del nodo en la última posición
        System.out.println("\n4. Estado completo del último nodo:");
        Nodo<String> ultimo = head;
        while (ultimo.getSiguiente() != null) {
            ultimo = ultimo.getSiguiente();
        }
        System.out.println(ultimo.toString());

        //Insertar nuevo nodo Fe entre De y Mc
        System.out.println("\n5. Insertando Fe entre De y Mc");
        Nodo<String> nodoFe = new Nodo<>("Fe", head.getSiguiente());
        head.setSiguiente(nodoFe);

        //Imprimir el nuevo estado de la lista
        System.out.println("Nuevo Estado de la Lista:");
        imprimirLista(head);

        //Insertar nuevo nodo Zz al final de la lista
        System.out.println("\n7. Insetando Zz en el final de la lista");
        Nodo<String> actual = head;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(new Nodo<>("Zz"));

        //Imprime el nuevo estado de la lista
        System.out.println(" Nuevo Estado de la Lista: ");
        imprimirLista(head);

        //Insetar un nuevo nodo "Aa" al inicio de la lista
        System.out.println("\n9. Insertando Aa al inicio de la lista ");
        Nodo<String> nuevaCabeza = new Nodo<>("Aa", head);
        head = nuevaCabeza;

        //Imprimir Estado Final de la Lista
        System.out.println("Estado final de la lista:");
        imprimirLista(head);
    }

    public static void imprimirLista(Nodo<String> cabeza) {
        Nodo<String> actual = cabeza;
        System.out.print("[ ");
        while (actual != null) {
            System.out.println(actual.getDato());
            if (actual.getSiguiente() != null) {
                System.out.print(" --> ");
            }
            actual = actual.getSiguiente();
        }
        System.out.println(" ]");
    }
}