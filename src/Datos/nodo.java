package Datos;

import java.io.Serializable;

public class nodo implements Serializable {

    public int[] s;
    public nodo siguiente = null;

    // Constructor::
    public nodo(int[] Vector, int tam) {
        s = new int[tam];
        System.arraycopy(Vector, 0, s, 0, s.length);
    }
}
