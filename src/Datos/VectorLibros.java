package Datos;

import java.io.Serializable;

public class VectorLibros implements Serializable {

    public Libro L[];
    private int TAM_VECTOR = 100;
    private int numL = 0;

    public VectorLibros() {
        L = new Libro[TAM_VECTOR];
        for (int i = 0; i < TAM_VECTOR; i++) {
            L[i] = new Libro(0, "", "", "", 0, 0, 0, 0);
        }
    }

    public int getTAM_VECTOR() {
        return TAM_VECTOR;
    }

    public void setTAM_VECTOR(int tamaño) {
        this.TAM_VECTOR = tamaño;
    }

    public int getNumL() {
        return numL;
    }

    public void setNumL(int numL) {
        this.numL = numL;
    }

    public void setCodigoDelLibro(int codigo, int i) {
        L[i].setCodigo(codigo);
    }

    public int getCodigoDelLibro(int i) {
        return L[i].getCodigo();
    }

    public void setTituloDelLibro(String titulo, int i) {
        L[i].setTitulo(titulo);
    }

    public String getTituloDelLibro(int i) {
        return L[i].getTitulo();
    }

    public void setAutorDelLibro(String autor, int i) {
        L[i].setAutor(autor);
    }

    public String getAutorDelLibro(int i) {
        return L[i].getAutor();
    }

    public void setEditorialDelLibro(String Editorial, int i) {
        L[i].setEditorial(Editorial);
    }

    public String getEditorialDelLibro(int i) {
        return L[i].getEditorial();
    }

    public void setAñoDelLibro(int anio, int i) {
        L[i].setAnio(anio);
    }

    public int getAñoDelLibro(int i) {
        return L[i].getAnio();
    }

    public void setCantidadDelLibro(int cantidad, int i) {
        L[i].setCantidad(cantidad);
    }

    public int getCantidadDelLibro(int i) {
        return L[i].getCantidad();
    }

    public void setStockDelLibro(int stock, int i) {
        L[i].setStock(stock);
    }

    public int getStockDelLibro(int i) {
        return L[i].getStock();
    }

    public void setValorDelLibro(double valor, int i) {
        L[i].setValor(valor);
    }

    public double getValorDelLibro(int i) {
        return L[i].getValor();
    }

    public void AumentarTamanio() {
        TAM_VECTOR = TAM_VECTOR + 10;
    }

    public Libro getL(int i) {
        return L[i];
    }

    public void setL(Libro libro, int i) {
        L[i] = libro;
    }

    public int busqueda_secuencial(int codigo) {
        int i = 0;
        int pos = -1;
        boolean encontrado = false;
        while ((i <= TAM_VECTOR - 1) && (!encontrado)) {
            if (L[i].getCodigo() == codigo) {
                pos = i;
                encontrado = true;
            }
            i++;
        }
        return pos;
    }
}
