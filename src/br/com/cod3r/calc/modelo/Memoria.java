package br.com.cod3r.calc.modelo;

public class Memoria {
    private static final Memoria instancia = new Memoria();
    private String textoAtual = "";
    public Memoria() {

    }
    public static Memoria GetInstancia(){
        return instancia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

}
