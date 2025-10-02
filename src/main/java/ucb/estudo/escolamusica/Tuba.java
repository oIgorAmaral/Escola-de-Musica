/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.escolamusica;

/**
 *
 * @author igor.aferreira
 */
public class Tuba extends InstrumentoMusical {
    private int numeroDePistoes;

    public Tuba(String nome, String material, int numeroDePistoes) {
        super(nome, material);
        this.numeroDePistoes = numeroDePistoes;
    }

    
    @Override
    public void tocar() {
        System.out.println("Tocando sons graves e potentes na: " + nome + " com " + numeroDePistoes + " pistoes...");
        System.out.println("Marcando o ritmo da orquestra!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Lubrificando e ajustando os " + numeroDePistoes + " pistoes.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Numero de pistoes: " + numeroDePistoes);
    }

    public int getNumeroDePistoes() {
        return numeroDePistoes;
    }
}