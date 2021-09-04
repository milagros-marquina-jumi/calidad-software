package Logico;

import Datos.VectorEditorial;
import java.io.*;

public class ArchivoEditorial {

    VectorEditorial VE = new VectorEditorial();

    public VectorEditorial CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("Editorial.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                VE = (VectorEditorial) in.readObject();

                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
        return VE;
    }

    public void GuardarDatos(VectorEditorial VE) {
        try {
            FileOutputStream fos = new FileOutputStream("Editorial.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(VE);
                out.close();
            }
        } catch (IOException e) {
        }
    }
}
