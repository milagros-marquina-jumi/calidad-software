package Logico;

import Datos.Libro;
import Datos.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public final class Sistema {

    private static Libro[] p;
    private static int nElementos;

    private ArrayList<Usuario> usuario;

    private File fil;

    public static Libro[] getP() {
        return p;
    }

    public Sistema() {
        nElementos = 0;
        p = asignarMemoria(nElementos);
        this.usuario = new ArrayList<>();

    }

    public void addUser(Usuario u) {
        this.usuario.add(u);
    }

    public void escribir(String sNombreArchivo, ArrayList arreglo) {
        try {
            fil = new File(sNombreArchivo);
            if (!fil.exists()) {
                fil.createNewFile();
            } else {
                ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(sNombreArchivo));
                escritor.writeObject(arreglo);
                escritor.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList leer(String sNombreArchivo) {
        ArrayList arreglo = new ArrayList();
        try {
            fil = new File(sNombreArchivo);
            if (!fil.exists()) {
                fil.createNewFile();
            }
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo));
            arreglo = (ArrayList) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
        }
        return arreglo;
    }

    public Usuario buscarPersona(String nombre) {
        int capturador = busquedaBR_usuarios(0, usuario.size() - 1, nombre);
        if (capturador != 0) {
            return usuario.get(capturador);
        } else {
            return null;
        }
    }

    private int busquedaBR_usuarios(int menor, int mayor, String clave) {
        int media = (mayor + menor) / 2;
        String valorMeio = usuario.get(media).getNombre();
        if (menor > mayor) {
            return -1;
        } else if (valorMeio.compareTo(clave) == 0) {
            return media;
        } else if (valorMeio.compareTo(clave) < 0) {
            return busquedaBR_usuarios(media + 1, mayor, clave);
        } else {
            return busquedaBR_usuarios(menor, media - 1, clave);
        }
    }

    public boolean actualizarUsuario(Usuario u) {
        int i = 0;
        int capturador = 0;
        boolean flag = false;
        for (Usuario us : this.usuario) {
            if (us.getNombre().equalsIgnoreCase(u.getNombre())) {
                capturador = i;
                flag = true;
            }
            i++;
        }
        this.usuario.remove(capturador);
        if (flag) {
            this.usuario.add(u);
            return flag;
        } else {
            return flag;
        }
    }

    public void ordenar_alfabeticamente() {
        sort_por_fusion(0, usuario.size() - 1);
    }

    private void sort_por_fusion(int izq, int der) {
        int centro;
        if (izq < der) {
            centro = (izq + der) / 2;
            sort_por_fusion(izq, centro);
            sort_por_fusion(centro + 1, der);
            fusion(izq, centro + 1, der);
        }
    }

    @SuppressWarnings("empty-statement")
    private void fusion(int izq, int centro, int der) {
        ArrayList B = new ArrayList();
        int final_izq, nroelem, tmp;
        final_izq = centro - 1;
        tmp = izq;
        nroelem = der - izq + 1;
        while ((izq <= final_izq) && (centro <= der)) {
            if (usuario.get(izq).getNombre().compareTo(usuario.get(centro).getNombre()) < 0) {
                B.set(tmp, usuario.get(izq));

                izq++;
            } else {
                B.set(tmp, usuario.get(centro));
                centro++;
            }
            tmp++;
        }
        while (izq <= final_izq) {
            B.set(tmp, usuario.get(izq)); //aqui compara 
            tmp++;
            izq++;
        }
        while (centro <= der) {
            B.set(tmp, usuario.get(centro));; //aqui compara 
            tmp++;
            centro++;
        }
        for (int i = 1; i <= nroelem; i++) {
            usuario.set(tmp, (Usuario) B.get(der)); //aqui compara 
            der--;
        }
    }

    public boolean verifPassword(char[] j1, char[] j2) {
        boolean valor = true;
        int puntero = 0;
        if (j1.length != j2.length) {
            valor = false;
        } else {
            while ((valor) && (puntero < j1.length)) {
                if (j1[puntero] != j2[puntero]) {
                    valor = false;
                }
                puntero++;
            }
        }
        return valor;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    private static Libro[] asignarMemoria(int nElementos) {
        try {
            return new Libro[nElementos];
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
            return p;
        }
    }

    private static void unElementoMás(Libro[] listaActual) {
        nElementos = listaActual.length;
        p = asignarMemoria(nElementos + 1);
        System.arraycopy(listaActual, 0, p, 0, nElementos);
        nElementos++;
    }

    private void unElementoMenos(Libro[] listaActual) {
        if (listaActual.length == 0) {
            return;
        }
        int k = 0;
        nElementos = listaActual.length;
        p = asignarMemoria(nElementos - 1);
        for (int i = 0; i < nElementos; i++) {
            if (listaActual[i] != null) {
                p[k++] = listaActual[i];
            }
        }
        nElementos--;
    }

    private static void ponerValorEn(int i, Libro objeto) {
        if (i >= 0 && i < nElementos) {
            p[i] = objeto;
        } else {
            System.out.println("Índice fuera de límites");
        }
    }

    public Libro valorEn(int i) {
        if (i >= 0 && i < nElementos) {
            return p[i];
        } else {
            System.out.println("Índice fuera de límites");
            return null;
        }
    }

    public void Limpiesa(JPanel panel) {
        for (int i = 0; panel.getComponents().length > i; i++) {
            if (panel.getComponents()[i] instanceof JTextField) {
                ((JTextField) panel.getComponents()[i]).setText("");
            } else if (panel.getComponents()[i] instanceof JPasswordField) {
                ((JPasswordField) panel.getComponents()[i]).setText("");
            }
        }
    }
}
