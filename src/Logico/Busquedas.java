package Logico;

import Datos.Libro;
import Datos.Prestamo;

public class Busquedas {

    public int B_Secuancial_Desordenado(Libro A[], int n) {
        int i = 0;
        int pos = -1;
        boolean encontrado = false;
        while (i < A.length && encontrado == false) {
            if (A[i].getCodigo() == n) {
                pos = i;
                encontrado = true;
            }
            i++;
        }
        System.out.println("La Pos para prestamo::::::: " + pos);
        return pos;
    }

    public int B_Secuencial_Ordenado(Libro A[], int n) {
        int i = 0;
        int pos = -1;
        boolean encontrado = false;
        Libro aux[] = A;
        while (i < aux.length && encontrado == false && aux[i].getCodigo() <= n) {
            if (aux[i].getCodigo() == n) {
                pos = i;
                encontrado = true;
            }
            i++;
        }
        return pos;
    }

    public int B_Binaria_Iterativa(Libro A[], int dato) {
        Ordenamientos O = new Ordenamientos();
        int n = A.length;
        int centro, inf = 0, sup = n - 1;
        Libro aux[] = A;
        O.QuickSort(aux);
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (aux[centro].getCodigo() == dato) {
                return centro;
            } else {
                if (dato < aux[centro].getCodigo()) {
                    sup = centro - 1;
                } else {
                    inf = centro + 1;
                }
            }
        }
        return -1;
    }

    public int B_Binaria_Iterativa_ParaPrestamos(Prestamo A[], int dato) {
        Ordenamientos O = new Ordenamientos();
        int n = A.length;
        int centro, inf = 0, sup = n - 1;
        Prestamo aux[] = A;
        O.InsercionDirecta_Prestamos(A);
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (aux[centro].getCodigoLibro() == dato) {
                return centro;
            } else {
                if (dato < aux[centro].getCodigoLibro()) {
                    sup = centro - 1;
                } else {
                    inf = centro + 1;
                }
            }
        }
        return -1;
    }

    public int B_Binaria_Recursiva(Libro[] A, int n) {
        Libro aux[] = A;
        return B_Binaria_R(aux, 0, aux.length - 1, n);
    }

    private int B_Binaria_R(Libro[] array, int menor, int mayor, int n) {
        if (menor > mayor) {
            return -1;
        } else {
            int medio = (mayor + menor) / 2;
            if (array[medio].getCodigo() == n) {
                return medio;
            } else {
                if (array[medio].getCodigo() < n) {
                    return B_Binaria_R(array, medio + 1, mayor, n);
                } else {
                    return B_Binaria_R(array, menor, medio - 1, n);
                }
            }
        }
    }
}
