package Logico;

import java.io.Serializable;

public class ArregloCantidad implements Serializable {

    int Cantidad[] = new int[8];

    public ArregloCantidad() {
        for (int i = 0; i < 8; i++) {
            Cantidad[i] = 0;
        }
    }

    public int[] getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int[] Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getElemento(int i) {
        return Cantidad[i];
    }

    public void setElement(int valor, int pos) {
        Cantidad[pos] = valor;
    }

}
