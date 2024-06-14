public class Vendedor extends Funcionario{
    private double metaMes;
    private double metalAtual;

    public double getMetalAtual() {
        return metalAtual;
    }

    public double getMetaMes() {
        return metaMes;
    }

    public void setMetaMes(double metaMes) {
        this.metaMes = metaMes;
    }
    
    public double realizarVenda(double preco, double quantidade){
        double total = preco * quantidade;
        metalAtual = total;
        return total;
    }

    public double realizarBonificacao(double valorBonificacao){
        if (metalAtual >= metaMes) {
            double NovoSalario =  valorBonificacao + getSalario() ;
            return NovoSalario;
        }
        else{
            return getSalario();
        }
    
    }

}
