package Datos;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class VectorUsuarios implements Serializable {

    public Usuario U[];
    public int TAM_TABLA = 10;
    public int numU = 0;

    public VectorUsuarios() {
        U = new Usuario[TAM_TABLA];
        for (int i = 0; i < TAM_TABLA; i++) {
            U[i] = new Usuario("", "", "", "", "", "", "");
        }
    }

    public void setCodigoDelUsuario(String codigo, int i) {
        U[i].setId(codigo);
    }

    public String getCodigoDelUsuario(int i) {
        return U[i].getId();
    }

    public void setNombreDelUsuario(String nombre, int i) {
        U[i].setNombre(nombre);
    }

    public String getNombreDelUsuario(int i) {
        return U[i].getNombre();
    }

    public void setApellidoDelUsuario(String apellido, int i) {
        U[i].setApellido(apellido);
    }

    public String getApellidoDelUsuario(int i) {
        return U[i].getApellido();
    }

    public void setDNIdelUsuario(String DNI, int i) {
        U[i].setDNI(DNI);
    }

    public String getDNIDelUsuario(int i) {
        return U[i].getDNI();
    }

    public void setCorreo(String correo, int i) {
        U[i].setCorreo(correo);
    }

    public String getCorreo(int i) {
        return U[i].getCorreo();
    }

    public void setTelefono(String telefono, int i) {
        U[i].setTelefono(telefono);
    }

    public String getTelefono(int i) {
        return U[i].getTelefono();
    }

    public int getTamanioVector() {
        return TAM_TABLA;
    }

    public void AumentarTamanio() {
        TAM_TABLA = TAM_TABLA + 10;
    }

    public int getNumU() {
        return numU;
    }

    public void setNumU(int numU) {
        this.numU = numU;
    }

    public Usuario getU(int i) {
        return U[i];
    }

    public void setContraseñaDelUsuario(String Contraseña, int i) {
        U[i].setContraseña(Contraseña);
    }

    public String getContrseñaDelUsuario(int i) {
        return U[i].getContraseña();
    }

//======================= Hashing================================
    public int hash(String clave) {
        int posicion, f1, f2, numCaracteres;
        f1 = clave.codePointAt(0);
        System.out.println("acii=" + f1);
        numCaracteres = clave.length();
        f2 = Integer.parseInt(clave.substring(numCaracteres - 2, numCaracteres));
        System.out.println("f2=" + f2);
        posicion = (f1 + f2) % 10;
        System.out.println("La clave sera : " + posicion);
        return posicion;
    }

    public boolean Insertar(String codigo, String nombre, String apellido, String DNI, String correo, String telefono, String Contraseña) {
        int pos, pos_sigte;
        pos = hash(codigo);
        if (getCodigoDelUsuario(pos).equals("")) {
            setCodigoDelUsuario(codigo, pos);
            setNombreDelUsuario(nombre, pos);
            setApellidoDelUsuario(apellido, pos);
            setDNIdelUsuario(DNI, pos);
            setCorreo(correo, pos);
            setTelefono(telefono, pos);
            setContraseñaDelUsuario(Contraseña, pos);
            numU++;
            return true;
        } else {
            pos_sigte = pos + 1;
            if (pos_sigte == getTamanioVector()) {
                pos_sigte = 0;
            }
            while (pos_sigte < getTamanioVector() && (getCodigoDelUsuario(pos_sigte).equals("") == false) && pos_sigte != pos) {
                pos_sigte++;
                if (pos_sigte == getTamanioVector()) {
                    pos_sigte = 0;
                }
            }
            System.out.println("Mientras bota un posig:" + pos_sigte);
            if (getCodigoDelUsuario(pos_sigte).equals("")) {
                setCodigoDelUsuario(codigo, pos_sigte);
                setNombreDelUsuario(nombre, pos_sigte);
                setApellidoDelUsuario(apellido, pos_sigte);
                setDNIdelUsuario(DNI, pos_sigte);
                setCorreo(correo, pos_sigte);
                setTelefono(telefono, pos_sigte);
                setContraseñaDelUsuario(Contraseña, pos_sigte);
                numU++;
                return true;
            } else {
                System.out.println("Ya no hay espacio");
                System.out.println("Aumentamos tamaño de vector");
                int Tanterior = getTamanioVector();
                AumentarTamanio();
                System.out.println("Ahor el tamañoes : " + getTamanioVector());
                Usuario temporal[] = new Usuario[getTamanioVector()];
                for (int i = 0; i < getTamanioVector(); i++) {
                    temporal[i] = new Usuario("", "", "", "", "", "", "");
                }
                for (int i = 0; i < Tanterior; i++) {
                    temporal[i] = U[i];
                    System.out.println("copiado");
                }
                pos_sigte = Tanterior;
                System.out.println("Pos Si despes de aumentar:" + pos_sigte);
                temporal[pos_sigte].setId(codigo);
                temporal[pos_sigte].setNombre(nombre);
                temporal[pos_sigte].setApellido(apellido);
                temporal[pos_sigte].setDNI(DNI);
                temporal[pos_sigte].setCorreo(correo);
                temporal[pos_sigte].setTelefono(telefono);
                temporal[pos_sigte].setContraseña(Contraseña);
                numU++;
                U = temporal;
                return true;
            }
        }
    }

    public void Mostrar() {
        System.out.println("El tamaño tabal al mostrar es: " + TAM_TABLA);
        for (int i = 0; i < TAM_TABLA; i++) {
            try {
                System.out.println("-> " + U[i].getNombre());
            } catch (Exception e) {
                e.getClass();
                System.out.println("->");
            }
        }
    }

    public int Buscar(String codigo) {
        int pos, pos_sigte;
        pos = hash(codigo);
        if (getCodigoDelUsuario(pos).equals(codigo)) {
            System.out.println("Encontrado en la pos: " + pos);
            return pos;
        } else {
            pos_sigte = pos + 1;
            while (pos_sigte < getTamanioVector() && (!getCodigoDelUsuario(pos_sigte).equals(""))
                    && pos_sigte != pos && (!getCodigoDelUsuario(pos_sigte).equals(codigo))) {
                pos_sigte++;
                if (pos_sigte == getTamanioVector()) {
                    pos_sigte = 0;
                }
            }
            if ((!getCodigoDelUsuario(pos_sigte).equals(codigo)) || pos_sigte == pos) {
                return -1; //código no existe
            } else {
                System.out.println("Encontrado en la pos: " + pos_sigte);
                return pos_sigte;
            }
        }
    }

    public void Eliminar(String codigo) {
        int p = Buscar(codigo);
        if (p == -1) {
            JOptionPane.showMessageDialog(null, "Codigono no encontrado- No se Puede ELiminar ");
        } else {
            setCodigoDelUsuario("", p);
            setNombreDelUsuario("", p);
            setApellidoDelUsuario("", p);
            setDNIdelUsuario("", p);
            setCorreo("", p);
            setTelefono("", p);
            setContraseñaDelUsuario("", p);
            JOptionPane.showMessageDialog(null, "Elemento eliminado ");
        }
    }

    public int busqueda_secuencial(String codigo) {
        int i = 0;
        int pos = -1;
        boolean encontrado = false;
        while ((i <= TAM_TABLA - 1) && (!encontrado)) {
            if (U[i].getId().equalsIgnoreCase(codigo)) {
                pos = i;
                encontrado = true;
            }
            i++;
        }
        return pos;
    }
}
