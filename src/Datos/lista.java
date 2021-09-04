package Datos;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class lista implements Serializable {

    public nodo inicio;
    public nodo fin;

    public lista() {
        inicio = null;
        fin = null;
    }

    public boolean Vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Ingresar_Al_Final(int[] n, int numE) {
        if (!Vacia()) {
            fin.siguiente = new nodo(n, numE);
            fin = fin.siguiente;
        } else {
            inicio = fin = new nodo(n, numE);
        }
    }

    public void Mostrar(int numE, Libro[] valores, double suma) {
        String Msj2 = "Las Soluciones Backtracking son: \n ";
        String Msj3 = "Los Libros que puedes comprar, cuya suma es menor a " + suma + " son:\n";
        System.out.println("Las soluciones backtracking son:");
        nodo recorre = inicio;
        while (recorre != null) {
            Msj2 = Msj2 + "{";
            for (int i = 0; i < numE; i++) {
                System.out.print("[" + recorre.s[i] + "]-->");
                if (i != numE - 1) {
                    Msj2 = Msj2 + " " + recorre.s[i] + ",";
                } else {
                    Msj2 = Msj2 + " " + recorre.s[i] + "}\n";
                }
                if (recorre.s[i] == 1) {
                    Msj3 = Msj3 + "" + valores[i].getCodigo() + "| " + valores[i].getTitulo() + "| " + valores[i].getAutor() + "| " + valores[i].getValor() + "\n";
                }
            }
            Msj3 = Msj3 + "---------------------------------------------------------------------------------\n";
            System.out.println("");
            recorre = recorre.siguiente;
        }
        System.out.println("");
        JOptionPane.showMessageDialog(null, Msj2);
        JOptionPane.showMessageDialog(null, Msj3);
    }
}
