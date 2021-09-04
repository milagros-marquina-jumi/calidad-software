package Logico;

import Datos.Libro;
import Datos.Prestamo;

public class Ordenamientos {

    public void burbuja(Libro A[]) {
        Libro temp;
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length - i; j++) {
                if (A[j].getCodigo() > A[j + 1].getCodigo()) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public void BurbujaSeñal(Libro A[]) {
        Libro aux;
        int i = 0;
        boolean band = false;
        while (i < A.length - 1 && band == false) {
            band = true;
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j].getCodigo() > A[j + 1].getCodigo()) {
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                    band = false;
                }
            }
            i++;
        }
    }

    public void SeleccionDirecta(Libro A[]) {
        Libro menor, tmp;
        int pos;
        for (int i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j].getCodigo() < menor.getCodigo()) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public void InsercionDirecta(Libro A[]) {
        Libro aux;
        for (int p = 1; p < A.length; p++) {
            aux = A[p];
            int j = p - 1;
            while (j >= 0 && aux.getCodigo() < A[j].getCodigo()) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    public void InsercionDirecta_Prestamos(Prestamo A[]) {
        Prestamo aux;
        for (int p = 1; p < A.length; p++) {
            aux = A[p];
            int j = p - 1;
            while (j >= 0 && aux.getCodigoLibro() < A[j].getCodigoLibro()) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    public void shell(Libro A[]) {
        Libro aux;
        int salto, i;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < A.length; i++) {
                    if (A[i - salto].getCodigo() > A[i].getCodigo()) {
                        aux = A[i];
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }

    public void MergeSort(Libro A[]) {
        MergeSortAux(A, 0, A.length - 1);
    }

    private void MergeSortAux(Libro A[], int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (inicio + fin) / 2;
            MergeSortAux(A, inicio, mitad);
            MergeSortAux(A, mitad + 1, fin);
            Fusion(A, inicio, mitad, fin);
        }
    }

    private void Fusion(Libro A[], int inicio, int mitad, int fin) {
        int n1 = mitad - inicio + 1, n2 = fin - mitad;
        Libro arrayIzq[] = new Libro[n1];
        Libro arrayDer[] = new Libro[n2];
        for (int i = 0; i < n1; i++) {
            arrayIzq[i] = A[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            arrayDer[j] = A[mitad + j + 1];
        }
        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (arrayIzq[i].getCodigo() <= arrayDer[j].getCodigo()) {
                A[k] = arrayIzq[i];
                i++;
            } else {
                A[k] = arrayDer[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            A[k] = arrayIzq[i];
            i++;
            k++;
        }
        while (j < n2) {
            A[k] = arrayDer[j];
            j++;
            k++;
        }
    }

    public void HeapSort(Libro A[]) {
        int size = A.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(A, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            Libro x = A[0];
            A[0] = A[i];
            A[i] = x;
            heapify(A, i, 0);
        }
    }

    private void heapify(Libro A[], int heapSize, int i) {
        int largest = i;
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;
        if (leftChildIdx < heapSize && A[leftChildIdx].getCodigo() > A[largest].getCodigo()) {
            largest = leftChildIdx;
        }
        if (rightChildIdx < heapSize && A[rightChildIdx].getCodigo() > A[largest].getCodigo()) {
            largest = rightChildIdx;
        }
        if (largest != i) {
            Libro swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;
            heapify(A, heapSize, largest);
        }
    }

    public void QuickSort(Libro A[]) {
        QuickSortAux(A, 0, A.length - 1);
    }

    private void QuickSortAux(Libro A[], int izq, int der) {
        int i = izq, j = der;
        Libro pivote = A[izq], aux;
        while (i < j) {
            while (A[i].getCodigo() <= pivote.getCodigo() && i < j) {
                i++;
            }
            while (A[j].getCodigo() > pivote.getCodigo()) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            QuickSortAux(A, izq, j - 1);
        }
        if (j + 1 < der) {
            QuickSortAux(A, j + 1, der);
        }
    }
}
