public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private double altura;
    private double peso;
    
    //métodos construtores
    public Pessoa(String nomePessoa, int idadePessoa, char sexoPessoa,double alturaPessoa, double pesoPessoa ){
        nome = nomePessoa;
        idade = idadePessoa;
        sexo = sexoPessoa;
        altura = alturaPessoa;
        peso = pesoPessoa;

    }

    public String getPessoa(){
        String info = "A pessoa se chama " + nome + ", tem a idade de " + 
                        idade+ " anos, tem "+altura +"m de altura, pesa " +peso +"kg e é do sexo " +sexo+".";
        return info;
    }

    public String correr(){
        return this.nome + " está correndo";
    }

    

}
