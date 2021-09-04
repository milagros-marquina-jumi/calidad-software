package Datos;

import java.io.*;

public class ArchivoUsuarios {

    VectorUsuarios V = new VectorUsuarios();

    public VectorUsuarios CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("Usuarios.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                V = (VectorUsuarios) in.readObject();
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
        return V;
    }

    public void GuardarDatos(VectorUsuarios V) {
        try {
            FileOutputStream fos = new FileOutputStream("Usuarios.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(V);
                out.close();
            }
        } catch (IOException e) {
        }
    }
}
