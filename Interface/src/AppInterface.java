import automovel.Carro;
import automovel.Veiculo;

class AppInterface {


    //Classe generica do tipo veiculo que ja chama o metodo ligar
    //aguarda um objeto para executar
    public static void ligarMotor(Veiculo veiculo){
        veiculo.ligar();
    }

    
    public static void main(String[] args) {
        //cria-se um objeto corsa do tipo Veiculo
        Veiculo corsa = new Carro();


        //com o objeto criado, setamos o parametro e o metodo ligarMotor
        // executa o metodo ligar() que foi implementado na classe Carro
        // retornando a instrução "Ligando o carro";
        AppInterface.ligarMotor(corsa);
    }
    
}