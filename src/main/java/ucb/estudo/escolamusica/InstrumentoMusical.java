/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.escolamusica;

/**
 *
 * @author igor.aferreira
 */
public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;
    
    public InstrumentoMusical(String nome, String material){
        this.nome = nome;
        this.material = material;
            }
        public abstract void tocar();
        
        public void afinar(){
            System.out.println("Afinado o " + nome + "...");
        }
        
    public void MostrarInformacoes(){
        System.out.println("Instrumento " + nome + "...");
        System.out.println("Material: " + material);
        
        
    }
    public String getNome(){
            return nome;
        }
    public String getMaterial(){
        return material;
    }
}
