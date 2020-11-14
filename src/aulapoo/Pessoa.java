
package aulapoo;



public class Pessoa {
    private String cpf;
    private String nome;
    private int anoNasc;
    private int idade;
    
    public void mostraDados(String nome, String cpf){
        
        System.out.println("O nome da pessoa é " + nome + ", e seu CPF é " + cpf);
    }
    public void mostraIdade(int anoNasc){
        idade = 2020 - anoNasc;
        System.out.println("Sua idade é " + idade);
    }
}
