/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.escolamusica;

/**
 *
 * @author igor.aferreira
 */
public class Piano extends InstrumentoMusical {
    private int numeroDeTeclas;

    public Piano(String nome, String material, int numeroDeTeclas) {
        super(nome, material);
        this.numeroDeTeclas = numeroDeTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma sonata no: " + nome + " com suas " + numeroDeTeclas + " teclas...");
        System.out.println("Executando uma peça classica.");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Verificando a tensao das cordas para as " + numeroDeTeclas + " teclas.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Numero de teclas: " + numeroDeTeclas);
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }
}