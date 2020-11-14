
package aulapoo;


public class Principal {
    
    
    
    public static void main(String[] args) {
        
        Pessoa pes = new Pessoa();
        pes.mostraDados("Raul" , "229.232.321-70");
        pes.mostraIdade(1980);
        Cliente cli = new Cliente();
        cli.calculaDesconto(2002);
        Carro car = new Carro();
        car.mostraCaracteristicas("Fiesta", "branco", 1999, "Diego");
        car.mostraTempoFabricacao(1999);
    }
    
}
