public class Veiculo {
    
    private String nome;
    private String modelo;
    private int quantidadeDePneus;
    private boolean status;
    private int velocidade; 

    public boolean ligar(int status){
        return this.status = true;
    }

    public boolean desligar(boolean status){
        return false;
    }

    public int acelerar(int velocidade){
        return this.velocidade += velocidade;
    }

    public int frear(int velocidadeAtual){
        if (velocidadeAtual < velocidade) {
           return velocidade -= velocidadeAtual;
        }else{
            return velocidade = 0;
        }
       
    }

    public int parar(){
        return velocidade = 0;
    }


    
    
    
    //Método Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQuantidadeDePneus() {
        return quantidadeDePneus;
    }
    public void setQuantidadeDePneus(int quantidadeDePneus) {
        this.quantidadeDePneus = quantidadeDePneus;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
}
