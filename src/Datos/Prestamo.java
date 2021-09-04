package Datos;

import java.io.Serializable;

public class Prestamo implements Serializable {

    String codigoU;
    int codigoLibro;
    String usuario;
    String libro;
    String fecha_prestamo;
    String fecha_devolucion;

    public Prestamo(int codigoLibro, String libro, String codigo, String usuario, String fecha_prestamo, String fecha_devolucion) {
        this.codigoU = codigo;
        this.codigoLibro = codigoLibro;
        this.usuario = usuario;
        this.libro = libro;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getCodigo() {
        return codigoU;
    }

    public void setCodigo(String codigo) {
        this.codigoU = codigo;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

}
