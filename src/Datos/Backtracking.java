package Datos;

import javax.swing.JOptionPane;

public class Backtracking {

    public int s[];
    public Libro[] v;
    public double tact;
    public double p;
    int numE;
    lista lista = new lista();
    GestorLista archivo = new GestorLista();

    public Backtracking(Libro[] valores, double suma, int n) {
        v = new Libro[n];
        s = new int[n];
        v = valores;
        tact = 0;
        p = suma;
        numE = n;
    }

    public void hallarSubconjunto() {
        int nivel = 0;
        for (int i = 0; i < s.length; i++) {
            s[i] = -1;
        }
        System.out.println("p:" + p);
        do {
            generar(nivel);
            if (solucion(nivel, p)) {
                lista.Ingresar_Al_Final(s, numE);
                archivo.GuardarDatos(lista);
                while (!masHermanos(nivel) && nivel > 0) {
                    nivel = retroceder(nivel);
                }
            } else if (criterio(nivel, p)) {
                nivel++;
            } else {
                while (!masHermanos(nivel) && nivel > 0) {
                    nivel = retroceder(nivel);
                }
            }

        } while (nivel >= 0 && s[nivel] < 1);
    }

    public void generar(int nivel) {
        s[nivel] = s[nivel] + 1;
        if (s[nivel] == 1) {
            tact = tact + v[nivel].getValor();
        }
        System.out.println("tact= " + tact);
    }

    public boolean solucion(int nivel, double p) {
        int n = s.length;
        return (nivel == n - 1 && tact <= p);
    }

    public boolean criterio(int nivel, double p) {
        int n = s.length;
        return (nivel < n - 1 && tact <= p);
    }

    public boolean masHermanos(int nivel) {
        return (s[nivel] < 1);
    }

    public int retroceder(int nivel) {
        tact -= v[nivel].getValor() * s[nivel];
        s[nivel] = -1;
        nivel--;
        return nivel;
    }

    public void mostrarSolucion() {
        lista L = new lista();
        L = archivo.CargarDatos();
        if (L.Vacia()) {
            JOptionPane.showMessageDialog(null, "NO HAY SOLUCIONES");
        } else {
            L.Mostrar(numE, v, p);
        }
        archivo.LimpiarArchivo();
    }
}
