package manipulastring;

public class AppManipuladorString {
    public static void main(String[] args) throws Exception {
   String caminho = "ManipulaArquivo\\src\\teste.txt";    
    ManipuladorDeString.escrita(caminho);
    ManipuladorDeString.leitura(caminho);
    
    }     
}
