package Logico;

import java.io.*;

import javax.swing.JOptionPane;

public class GestorArreglo {

    ArregloCantidad V = new ArregloCantidad();

    public ArregloCantidad CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("Monedas.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                V = (ArregloCantidad) in.readObject();
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return V;
    }

    public void GuardarDatos(ArregloCantidad V) {
        try {
            FileOutputStream fos = new FileOutputStream("Monedas.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(V);
                out.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
