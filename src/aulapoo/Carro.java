
package aulapoo;


public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private int tempo;
    private String dono;
    
    public void mostraCaracteristicas(String modelo,String cor, int ano, String dono){
        
        System.out.println( "O modelo do carro é " + modelo + " a cor é "+ cor + " o ano de fabricação é " + ano + " O proprietário é o "+dono);
    }
    
    public void mostraTempoFabricacao(int ano){
        tempo = 2020 - ano;
        System.out.println("Esse carro tem " + tempo + " anos desde a fabricação");
    }
}
