package arquivojson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class ExercicioEscrita {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        //cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();

        //chama a lib FileWiter para escrever
        FileWriter escreve = null;

        try {
            
        for(int i=0; i < 10; i++){

            jsonObject.put("nome", "fulano"+i);
            jsonObject.put("ultimo nome", "siclano"+i);
            //https://pt.stackoverflow.com/questions/259720/jsonarray-adicionando-e-sobreescrevendo
            //http://www.java2s.com/Code/Jar/j/json-simple.htm
            //
            escreve = new FileWriter("ManipulaArquivo\\src\\arquivojson\\saida2.json");
            escreve.write(jsonObject.toString());
            }
         escreve.close();   
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
