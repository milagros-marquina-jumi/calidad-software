package Datos;

import java.io.*;
import javax.swing.JOptionPane;

public class ArchivoCodigosUsuario {

    VectorCodigos VC = new VectorCodigos();

    public VectorCodigos CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("CodigosUsuarios.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                VC = (VectorCodigos) in.readObject();
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo : " + e.getMessage());
        }
        return VC;
    }

    public void GuardarDatos(VectorCodigos VC) {
        try {
            FileOutputStream fos = new FileOutputStream("CodigosUsuarios.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(VC);
                out.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        }
    }
}
