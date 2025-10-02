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
        System.out.println("Tocando sons graves e potentes na: " + nome + " com " + numeroDePistoes + " pistões...");
        System.out.println("Marcando o ritmo da orquestra!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Lubrificando e ajustando os " + numeroDePistoes + " pistões.");
    }

    @Override
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Tipo: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Número de pistões: " + numeroDePistoes);
    }

    public int getNumeroDePistoes() {
        return numeroDePistoes;
    }
}