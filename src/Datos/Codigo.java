package Datos;

import java.util.Random;

public class Codigo {

    public String GenerarCodigo() {
        Random MiAleatorio = new Random();
        Random numLetra = new Random();
        String Letras = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int posLetra = numLetra.nextInt(Letras.length() - 1);
        char PrimerDigito = Letras.charAt(posLetra);
        System.out.println("PrimeraLetra:" + PrimerDigito);
        int CentroDigitos = 100 + MiAleatorio.nextInt(100);
        String Centro = String.valueOf(CentroDigitos);
        System.out.println("Parte Central:" + Centro);
        int DosUltimosDigitos = 10 + MiAleatorio.nextInt(90);
        String Ultimo = String.valueOf(DosUltimosDigitos);
        System.out.println("Ultimo:" + Ultimo);
        String Codigo = "";
        Codigo = Codigo + PrimerDigito + Centro + Ultimo;
        System.out.println("El Codigo sera: " + Codigo);
        return Codigo;
    }

}
