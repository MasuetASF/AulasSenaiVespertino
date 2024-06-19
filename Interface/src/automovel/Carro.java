package automovel;

public class Carro implements Veiculo, Proprietario{

    //Interface Proprietario
    public String getNome(String nome){
        return nome;
    }
    public String getEndereco(){
        return "Brasilia-DF";
    }
    //end Interface Proprietario

    //interfaces Veiculo
    public String placa(String nome){
        return nome;
    }

    public void ligar(){
        System.out.println("Ligando o carro");
    }
    
    public void desligar(){
        System.out.println("Ligando o carro");
    }
    
    public void parar(){
        System.out.println("Ligando o carro");
    }

    public double velocidadeMaxima(){
        return 0;
    }
    //End interfaces Veiculo
    
    
}
