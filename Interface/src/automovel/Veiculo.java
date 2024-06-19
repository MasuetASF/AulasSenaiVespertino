package automovel;

public interface Veiculo {
    public String placa(String nome);
    public double velocidadeMaxima();
    public void ligar();
    public void desligar();
    public void parar();
    default void buzinar(){
        System.out.println("Buzina");
    }
    
}