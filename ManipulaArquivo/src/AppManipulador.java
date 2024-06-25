public class AppManipulador {
    public static void main(String[] args) throws Exception {
        String caminho = "ManipulaArquivo\\src\\teste.txt";    
    
        ManipuladorArquivos.escrita(caminho);
        ManipuladorArquivos.leitura(caminho);

    }
}
