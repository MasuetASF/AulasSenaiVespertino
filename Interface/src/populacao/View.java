package populacao;

public class View {
    public static void main(String[] args) {
        Filho filho = new Filho();
        filho.setIdade(23);
        filho.setNome("Mateus");
        filho.setCorMae("azul");
        filho.setCorPai("castanho");
        filho.setCorPeleMae("preta");
        filho.setCorPelePai("preta");

        //System.out.println("Nome: " + filho.getNome());
        //System.out.println("Idade: " + filho.getIdade());

        //System.out.println("Altura: "+ filho.altura(1.56));
        //System.out.println("Tem barba: " + filho.barba(false));
        //System.out.println("Calvice: " + filho.calvice(filho.altura(1.56)));
        
        //Cor dos olhos: azul, castanho, verde
        System.out.println("Cor dos olhos: " 
        + filho.corOlhos());
        
        //System.out.println("Tipo de cabelo: " + filho.tipoDeCabelo("Crespo"));

        //Cor da pele: parda, preta, branca 
        System.out.println("Cor da pele: "
        + filho.corDaPele());


        //TODO 
        //ESTUDAR SOBRE contains.()
    }
}
