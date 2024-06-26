package manipulandoarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class ManipuladorArquivos {
    /*
        Este método tem como finalidade ler um arquivo, criar um conjunto de vetores com o métoto split()
        para extrair 2 números inteiros e manipulá-los, a fim de criar um arquivo.txt de uma calculadora de multiplicação. 
    */
    public static void leitura(String caminho) throws IOException{
        //FileReader: permite que aplicativos da web leiam de forma assíncrona o conteúdo de arquivos (ou buffers de dados brutos) armazenados no computador do usuário.
        //O novo objeto FileReader recebe o arquivo de texto 
        //A classe de Java BufferedReader lê o texto de um fluxo de símbolos, armazenando os símbolos em buffer para ler caracteres, arrays e strings com eficiência. Passamos o texto q está armazenado em fr

        BufferedReader buff = new BufferedReader(new FileReader(caminho));
        String linha;
        //Criamos uma váriavel auxiliar para utilizarmos o método split().
        String aux[] = new String[3];
        //Como o método split() cria conjuntos de vetores, criando um vetor do tipo inteiro para fazer a conversão (FileReader retorna sempre uma String)
        Vector <Integer> vetor = new Vector<>();
        try {

            while (true) {
                linha = buff.readLine();
                if(linha == null) 
                    break;
                else{
                    aux = linha.split(" ");
                    for(String i: aux)
                        vetor.add(Integer.valueOf(i));
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        escrita("ManipulaArquivo\\src\\manipulandoarquivo\\saida.txt", vetor);

        // System.out.println(vetor);

        buff.close();
    }


    public static void escrita(String caminho, Vector<Integer> vetor) throws IOException{
        int aux;
        Vector <String> saida = new Vector<>();

        for(int i = 0; i < vetor.size(); i+=2){
            aux = vetor.get(i) * vetor.get(i+1);
            saida.add(String.valueOf(vetor.get(i)) + " x " + String.valueOf(vetor.get(i+1)) + " = " + String.valueOf(aux));
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminho,true));
            for(String i: saida)
                writer.append(i + "\n\n");
            writer.close();


    } catch (IOException e) {
        System.err.println(e);
    }
    }
}