/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.escolamusica;

/**
 *
 * @author igor.aferreira
 */
public class Violao extends InstrumentoMusical {
    private int numeroCordas; 
    
    public Violao(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar() {

        System.out.println("Tocando notas brutas no: " + nome + " com " + numeroCordas + " cordas...");
        System.out.println("Dedilhando uma melodia de METAL!");
    }

    @Override
    public void afinar() {
        super.afinar(); 
        System.out.println("Ajustando a tensao das " + numeroCordas + " cordas.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); 
        System.out.println("Numero de cordas: " + numeroCordas);
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
}