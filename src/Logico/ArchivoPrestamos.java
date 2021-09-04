package Logico;

import Datos.VectorPrestamos;
import java.io.*;

public class ArchivoPrestamos {

    VectorPrestamos VP = new VectorPrestamos();

    public VectorPrestamos CargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("Prestamos.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null) {
                VP = (VectorPrestamos) in.readObject();

                in.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
        return VP;
    }

    public void GuardarDatos(VectorPrestamos VP) {
        try {
            FileOutputStream fos = new FileOutputStream("Prestamos.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if (out != null) {
                out.writeObject(VP);
                out.close();
            }
        } catch (IOException e) {
        }
    }
}
