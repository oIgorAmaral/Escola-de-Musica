/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucb.estudo.escolamusica;

/**
 *
 * @author igor.ferreira
 */
public class EscolaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando a Orquestra!!!");
        System.out.println("------------------------------------");


        InstrumentoMusical[] banda = new InstrumentoMusical[5];

        banda[0] = new Violao("Violao Eagle", "Madeira", 6);
        banda[1] = new Piano("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new Saxofone("Saxofone Selmer", "Latao", "Alto");
        banda[3] = new Tuba("Tuba Weril", "Metal", 4);
        banda[4] = new Violao("Guitarra Ibanez", "Madeira", 7); 

  
        apresentarBanda(banda);

        System.out.println("------------------------------------");
        System.out.println("A apresentacao terminou com sucesso!!!");
    }


    public static void apresentarBanda(InstrumentoMusical[] banda) {
        for (InstrumentoMusical instrumento : banda) {
            
            if (instrumento != null) {
                System.out.println("=== Apresentando: " + instrumento.getNome() + " ===");
                instrumento.mostrarInformacoes(); 
                instrumento.afinar();
                instrumento.tocar();
                System.out.println(); 
            }
        }
    }
}