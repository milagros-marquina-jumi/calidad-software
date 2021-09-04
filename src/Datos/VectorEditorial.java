package Datos;

import java.io.Serializable;

public class VectorEditorial implements Serializable {

    public Libro[] L = new Libro[11];
    public int TAM = 11;

    public Libro getL(int i) {
        return L[i];
    }

    public void setL(Libro Lib, int i) {
        L[i] = Lib;
    }

    public int getTAM() {
        return TAM;
    }

    public void setTAM(int TAM) {
        this.TAM = TAM;
    }

    public void LLenarDatos() {
        L[0] = new Libro(111, "Calculo", "Arbañil Conte", "Sigma", 2001, 0, 0, 50);
        L[1] = new Libro(222, "Algoritmos Complejos", "Robert Espinoza", "Tecnology", 2019, 0, 0, 30);
        L[2] = new Libro(333, "Estadistica", "Luis Cuya", "Sigma", 2001, 0, 0, 510);
        L[3] = new Libro(444, "Estructura de Datos", "Salinas", "Sigma", 1991, 0, 0, 50);
        L[4] = new Libro(555, "Vectores", "Arbañil Conte", "Sigma", 2011, 0, 0, 30);
        L[5] = new Libro(666, "Diseño Grafico", "Nakamura", "Liong", 2012, 0, 0, 50);
        L[6] = new Libro(777, "Numeros Complejos", "Raul Perez", "Sigma", 2004, 0, 0, 40);
        L[7] = new Libro(888, "Programacion Paralela", "Virginia Pomalaza", "Sigma", 2001, 0, 0, 50);
        L[8] = new Libro(999, "Contabilidad", "Pinto Salavrry", "Economics", 2018, 0, 0, 50);
        L[9] = new Libro(101, "Inteligencia Artificial", "Pedro Maguiña", "System", 2019, 0, 0, 140);
        L[10] = new Libro(102, "Matematica Discreta", "Quinto R.", "Analiticos.SA", 2012, 0, 0, 50);
        System.out.println("SE Cargo la editorial");
    }
}
