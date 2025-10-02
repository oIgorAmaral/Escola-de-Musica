/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.escolamusica;


public class Saxofone extends InstrumentoMusical {

    public Saxofone(String nome, String material) {
        super(nome, material);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o saxofone: Melodia suave de jazz...");
    }

    @Override
    public void Afinar() {
        System.out.println("Ajustando a palheta do " + nome + "...");
    }

    @Override
    public void MostrarInformacoes() {
        System.out.println("--- Informações do Saxofone ---");
        super.MostrarInformacoes();
    }
}