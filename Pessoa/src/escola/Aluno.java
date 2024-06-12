package escola;

public class Aluno {
    
    private String nome;
    private int idade;

    //Método Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String calcularNota(double nota1, double nota2){
        double media = (nota1 + nota2) / 2; 
        if (media >= 6){
            return "Média final: "+ media+"\nAluno aprovado";
        }else{
            return "Média final: "+ media+"\nAluno reprovado";
        }
    }
    
}
