
package aulapoo;


public class Cliente extends Pessoa {
    private int desc;
    
    public void calculaDesconto(int anoCadastro){
        desc = 2020-anoCadastro;
        System.out.println("Este cliente terá " + desc + "% de desconto em sua compra");
    }    
}
