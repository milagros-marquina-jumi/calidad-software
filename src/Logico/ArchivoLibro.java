package Logico;

import Datos.VectorLibros;
import java.io.*;

public class ArchivoLibro {

    VectorLibros VL = new VectorLibros();

    public VectorLibros CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("Libros.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                VL = (VectorLibros) in.readObject();
                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
        return VL;
    }

    public void GuardarDatos(VectorLibros VL) {
        try {
            FileOutputStream fos = new FileOutputStream("Libros.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(VL);
                out.close();
            }
        } catch (IOException e) {
        }
    }
}
