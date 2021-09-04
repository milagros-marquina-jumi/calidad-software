package Datos;

import Logico.Busquedas;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Usuario implements Serializable {

    public String id;
    public String nombre, apellido, DNI, correo, telefono, contraseña;
    public int numLib;
    final int librosMax = 4;
    public Libro[] L = new Libro[librosMax];

    public Usuario(String id, String nombre, String apellido, String DNI, String correo, String telefono, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.correo = correo;
        this.telefono = telefono;
        this.numLib = 0;
        this.contraseña = "";
        for (int i = 0; i < 4; i++) {
            L[i] = new Libro(0, "", "", "", 0, 0, 0, 0);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumLib() {
        return numLib;
    }

    public void setNumLib(int numLib) {
        this.numLib = numLib;
    }

    public Libro getL(int i) {
        return L[i];
    }

    public void setL(Libro Lib, int i) {
        this.L[i] = Lib;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int EncontrarVacio() {
        int pos = -1;
        for (int i = 0; i < librosMax; i++) {
            if (L[i].getTitulo().equals("")) {
                pos = i;
            }
        }
        System.out.println("Espacio vacio en pos:" + pos);
        return pos;
    }

    public boolean agregarlibroprestado(Libro lib) {
        int p = EncontrarVacio();
        Busquedas B = new Busquedas();
        System.out.println("libro a buscar--->" + lib.getCodigo());
        int pos = B.B_Secuancial_Desordenado(L, lib.getCodigo());
        if (lib.getStock() > 0) {
            if (numLib < 4 && p != -1) {
                System.out.println("EL numero e libros: " + numLib);
                System.out.println("El valor del p es: " + p);
                if (pos == -1) {
                    L[p].setCodigo(lib.getCodigo());
                    L[p].setTitulo(lib.getTitulo());
                    L[p].setAutor(lib.getAutor());
                    L[p].setAnio(lib.getAnio());
                    L[p].setCantidad(lib.getCantidad());
                    L[p].setEditorial(lib.getEditorial());
                    L[p].setFecha_devolucion(lib.getFecha_devolucion());
                    L[p].setFecha_entrega(lib.getFecha_entrega());
                    L[p].setStock(lib.getStock());
                    L[p].setValor(lib.getValor());
                    numLib++;
                    System.out.println("NumLib:" + numLib);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "No puede Tener dos libros iguales en prestamo\n Ingrese otro libro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Alcanzo la capaidad maxima de prestamos, debe devolver libros.\nRevise su perfil de usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El libro no esta en stock...\nNO MOLESTE >:v");
        }
        return false;
    }

    public boolean devolverlibroprestado(String codLibro) {
        int Codigo = Integer.parseInt(codLibro);
        for (int i = 0; i < 4; i++) {
            if (L[i].getCodigo() == Codigo) {
                L[i] = new Libro(0, "", "", "", 0, 0, 0, 0);
                numLib--;
                return true;
            }
        }
        return false;
    }
}
