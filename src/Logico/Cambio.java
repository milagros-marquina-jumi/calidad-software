package Logico;

public class Cambio {

    GestorArreglo DatosArchivo = new GestorArreglo();
    public ArregloCantidad A = new ArregloCantidad();

    public void Voraz(int s[], double v[], int cMonedas[], double cambio) {
        double x;
        int i = 0;
        while (!Solucion(s, v, cambio) && i < s.length) {
            x = v[i];
            if (Factible(s, v, cambio, x) && cMonedas[i] != 0) {
                s[i]++;
                cMonedas[i] = cMonedas[i] - 1;
            } else {
                i++;
            }
            A.setCantidad(cMonedas);
        }
        DatosArchivo.GuardarDatos(A);
    }

    public boolean Solucion(int s[], double v[], double cambio) {
        double suma = 0.0;
        for (int i = 0; i < s.length; i++) {
            suma += s[i] * v[i];
        }
        suma = Math.rint(suma * 100) / 100;
        if (suma == cambio) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Factible(int s[], double v[], double cambio, double x) {
        double suma = 0.0;
        for (int i = 0; i < s.length; i++) {
            suma += s[i] * v[i];
        }
        suma = suma + x;
        suma = Math.rint(suma * 100) / 100;
        if (suma <= cambio) {
            return true;
        } else {
            return false;
        }
    }
}
