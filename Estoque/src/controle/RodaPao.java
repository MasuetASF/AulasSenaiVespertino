package controle;

public class RodaPao {

    public static void main(String[] args) {
       Pao[] vetorPao = new Pao[3];

        vetorPao[0] = new Pao("Frances");
        vetorPao[1] = new Pao ("Forma");
        vetorPao[2] = new Pao("Queijo");


        for (Pao p : vetorPao){
            System.out.println("tipo de pão: " + p.getTipoPao());
        }

    }
}
