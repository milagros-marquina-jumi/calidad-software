package Datos;

import java.io.Serializable;

public class VectorPrestamos implements Serializable {

    public Prestamo P[];
    private int TAM_VECTOR_PREST = 10;
    private int numP = 0;

    public VectorPrestamos() {
        P = new Prestamo[TAM_VECTOR_PREST];
        for (int i = 0; i < TAM_VECTOR_PREST; i++) {
            P[i] = new Prestamo(0, "", "", "", "", "");
        }
    }

    public int getTAM_VECTOR_PREST() {
        return TAM_VECTOR_PREST;
    }

    public void setTAM_VECTOR_PREST(int TAM_VECTOR_PREST) {
        this.TAM_VECTOR_PREST = TAM_VECTOR_PREST;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public void AumentarTamanio() {
        TAM_VECTOR_PREST = TAM_VECTOR_PREST + 10;
    }

    public void setCodigoLibroPrest(int codigo, int i) {
        P[i].setCodigoLibro(codigo);
    }

    public int getCodigoLibroPrest(int i) {
        return P[i].getCodigoLibro();
    }

    public void setCodigoDeUsuarioPrest(String codigo, int i) {
        P[i].setCodigo(codigo);
    }

    public String getCodigoDeUsuarioPrest(int i) {
        return P[i].getCodigo();
    }

    public void setnombreUsuarioPrest(String nombre, int i) {
        P[i].setUsuario(nombre);
    }

    public String getnombreUsuarioPrest(int i) {
        return P[i].getUsuario();
    }

    public void setLibroPrest(String libro, int i) {
        P[i].setLibro(libro);
    }

    public String getLibroPrest(int i) {
        return P[i].getLibro();
    }

    public void setfechaprestamoPrest(String fecha_prestamo, int i) {
        P[i].setFecha_prestamo(fecha_prestamo);
    }

    public String getfechaprestamoPrest(int i) {
        return P[i].getFecha_prestamo();
    }

    public void setfechadevolucionPrest(String fecha_devolucion, int i) {
        P[i].setFecha_devolucion(fecha_devolucion);
    }

    public String getfechadevolucionPrest(int i) {
        return P[i].getFecha_devolucion();
    }

    public Prestamo getP(int i) {
        return P[i];
    }

    public void setP(Prestamo prestamo, int i) {
        P[i] = prestamo;
    }

    public void insertarPrestamo(Prestamo prestamo) {
        if (numP < TAM_VECTOR_PREST) {
            P[numP] = prestamo;
            numP++;
        } else {
            System.out.println("Aumentamos tamaño de vector");
            int Tanterior = TAM_VECTOR_PREST;
            AumentarTamanio();
            System.out.println("Ahora el tamaño es : " + TAM_VECTOR_PREST);
            Prestamo[] temporal = new Prestamo[TAM_VECTOR_PREST];
            for (int i = 0; i < TAM_VECTOR_PREST; i++) {
                temporal[i] = new Prestamo(0, "", "", "", "", "");
            }
            for (int i = 0; i < Tanterior; i++) {
                temporal[i] = P[i];
                System.out.println("copiado");
            }
            int pos_sigte = Tanterior;
            System.out.println("Pos Si despes de aumentar:" + pos_sigte);
            temporal[pos_sigte].setCodigoLibro(prestamo.codigoLibro);
            temporal[pos_sigte].setLibro(prestamo.libro);
            temporal[pos_sigte].setCodigo(prestamo.codigoU);
            temporal[pos_sigte].setUsuario(prestamo.usuario);
            temporal[pos_sigte].setFecha_prestamo(prestamo.fecha_prestamo);
            temporal[pos_sigte].setFecha_devolucion(prestamo.fecha_devolucion);
            numP++;
            P = temporal;
        }
    }

    public int busqueda_secuencial_PorCodigoLibro(int codigo) {
        int i = 0;
        int pos = -1;
        boolean encontrado = false;
        while ((i <= TAM_VECTOR_PREST - 1) && (!encontrado)) {
            if (P[i].getCodigoLibro() == codigo) {
                pos = i;
                encontrado = true;
            }
            i++;
        }
        return pos;
    }

    public void eliminar_prestamo(String cod_usuario, String titulo) {
        int i = 0;
        while (i <= TAM_VECTOR_PREST - 1) {
            if (P[i].getCodigo().equalsIgnoreCase(cod_usuario) && P[i].getLibro().equalsIgnoreCase(titulo)) {
                P[i] = new Prestamo(0, "", "", "", "", "");
                numP--;
            }
            i++;
        }
    }
}
