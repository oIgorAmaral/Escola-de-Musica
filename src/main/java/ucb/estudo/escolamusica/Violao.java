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
    private int NumeroCordas;
    
    public Violao(String nome, String material) {
        super(nome, material);
        this.NumeroCordas = NumeroCordas;
    }

    @Override
    public void tocar() {
      System.out.println("Tocando notas Brutas no: " + nome + "com" + NumeroCordas + "cordas...");
      System.out.println("Dedilhando uma melodia METAL");
    }
     @Override
    public void afinar() {
        super.afinar();
    System.out.println("Ajustando a tensão das" + NumeroCordas + "cordas.");
    
    }
    
    @Override
    public void MostrarInformacoes(){
        super.MostrarInformacoes();
        System.out.println("Tipo: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Numero de cordas: " + NumeroCordas);
    }

    public int getNumeroCordas() {
        return NumeroCordas;
    }
}
