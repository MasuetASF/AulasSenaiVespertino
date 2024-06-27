package manipulastring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class ManipuladorDeString {
    

    /*
        Este método tem como finalidade ler um arquivo, criar um conjunto de vetores com o métoto split()
        para extrair 2 números inteiros e manipulá-los, a fim de criar um arquivo.txt de uma calculadora de multiplicação. 
    */

    public static void leitura (String caminho) throws IOException{
        //FileReader: permite que aplicativos da web leiam de forma assíncrona o conteúdo de arquivos (ou buffers de dados brutos) armazenados no computador do usuário.
        FileReader fr;


            //Como o método split() cria conjuntos de vetores, criando um vetor do tipo inteiro para fazer a conversão (FileReader retorna sempre uma String)
            Vector<Integer> vetor = new Vector<>();

            //Criamos uma váriavel auxiliar para utilizarmos o método split().
            String[] auxiliar = new String[3];

            
            //O novo objeto FileReader recebe o arquivo de texto 
            fr = new FileReader(caminho);

            //A classe de Java BufferedReader lê o texto de um fluxo de símbolos, armazenando os símbolos em buffer para ler caracteres, arrays e strings com eficiência. Passamos o texto q está armazenado em fr
            BufferedReader buff = new BufferedReader(fr);
            String linha = "";

            //Aqui criamos um While para que ele leia todo o texto até chegar ao fim do arquivo de texto, onde o fim retorna ao null
            //O método readLine() é usado para ler uma linha de texto por vez. O fim de uma linha deve ser entendido por '\n' ou '\r' ou EOF
            while ( (linha = buff.readLine()) != null) {
                auxiliar = linha.split(" ");
                    //Conversão do vetor de String para Integer
                    for( String i : auxiliar){
                        vetor.add(Integer.valueOf(i));
                    }
                }
            
            buff.close();
            
            //Criamos uma variável para indicar onde será armazenado a operação realizada pelo método escrita()
            String saida = "ManipulaArquivo\\src\\manipulastring\\saida.txt";
            
            //passamos o parametro 
            escrita(saida);
    }


    //criação de um arquivo
    //Este método tem como finalidade criar um arquivo de texto, onde é passado como parametro, o diretório de um arquivo de texto
    public static void escrita(String caminho) throws IOException{
        
        //Varivel auxiliar para receber e armazenar as operações
        int aux;


        Vector<String> saida = new Vector<>();
        
        for( int i = 1, j = 100; i <= 100; i++, j--){
            aux = i * j;
            
            saida.add(String.valueOf(i) + " x " + String.valueOf(j) + " = " + String.valueOf(aux));
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));
            for(String i: saida){
                writer.append( i +"\n");
            }
            writer.close();
        } catch (Exception e) {
            
        }
    } 

}
