package manipulastring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorDeString {
    
    public static void leitura (String caminho){
        FileReader fr;
        try {
            fr = new FileReader(caminho);
            BufferedReader buff = new BufferedReader(fr);
            String linha = "";

            while ( (linha = buff.readLine()) != null) {
                    String[] partes = linha.split(" ");
                    int numero1 = Integer.parseInt(partes[0]);
                    int numero2 = Integer.parseInt(partes[1]);
                    System.out.println(numero1 + " x " + numero2+ " = " + (numero1 * numero2) );
                }
            buff.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }catch(IOException f){
            System.out.println("error reanding from file");
            f.printStackTrace();
        } 
    }

    //criação de um arquivo
    public static void escrita(String caminho) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true));
        String linha = "";
        Scanner entrada = new Scanner(System.in);
        for( int i = 0; i < 10; i++){
            System.out.println("Digite dois numeros com um espaco entre eles. Ex: 1 1");
            linha = entrada.nextLine();
            writer.append(linha + "\n");
        }
            writer.close();
            entrada.close();
        
    }



}
