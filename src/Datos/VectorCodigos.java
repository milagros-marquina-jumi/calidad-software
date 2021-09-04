package Datos;

import java.io.Serializable;

public class VectorCodigos implements Serializable {

    public String Codigos[];
    private int NumElementos;
    public int TAM = 10;

    public VectorCodigos() {
        Codigos = new String[TAM];
        NumElementos = 0;
    }

    public String getCodigos(int i) {
        return Codigos[i];
    }

    public void setCodigos(String Cod, int i) {
        this.Codigos[i] = Cod;
    }

    public int getNumElementos() {
        return NumElementos;
    }

    public void setNumElementos(int NumElementos) {
        this.NumElementos = NumElementos;
    }

    public int getTAM() {
        return TAM;
    }

    public void setTAM(int TAM) {
        this.TAM = TAM;
    }

    public void AumentarEspacio() {
        TAM = TAM + 2;
    }

    public void Insertar(String codigo) {
        if (NumElementos == TAM) {
            System.out.println("El tam es :" + TAM);
            int Tanterior = TAM;
            AumentarEspacio();
            System.out.println("Nuevo tamaño es: " + TAM);
            String Temporal[] = new String[TAM];
            for (int i = 0; i < TAM; i++) {
                Temporal[i] = new String();
            }
            System.arraycopy(Codigos, 0, Temporal, 0, Tanterior);
            Codigos = Temporal;
            Codigos[Tanterior] = codigo;
            NumElementos++;
        } else {
            Codigos[NumElementos] = codigo;
            NumElementos++;
        }
    }
}
