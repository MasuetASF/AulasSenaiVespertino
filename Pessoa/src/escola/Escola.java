package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno mateus = new Aluno();
        
        mateus.setNome("Mateus Antônio");
        //System.out.println("O nome do aluno é: "+ mateus.getNome());
        mateus.setIdade(23);
        //System.out.println("A idade do aluno é: " + mateus.getIdade() +" anos.");

       
        System.out.println(mateus.calcularNota(7, 5));
    }
}
