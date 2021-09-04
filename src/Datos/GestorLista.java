package Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class GestorLista {

    lista L = new lista();

    public lista CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("Sol.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                L = (lista) in.readObject();
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return L;
    }

    public void GuardarDatos(lista l) {
        try {
            FileOutputStream fos = new FileOutputStream("Sol.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(l);
                out.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void LimpiarArchivo() {
        lista Lis = new lista();
        GuardarDatos(Lis);
    }
}
