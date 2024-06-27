package arquivojson;
import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;


import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;




public class Leitura {
   
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, FileNotFoundException, ParseException{

		//Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();

        JSONParser parse = new JSONParser();

        String nome;
        String ultimoNome;
        String cidade;
        String estado;

        try {
            jsonObject = (JSONObject) parse.parse(new FileReader("ManipulaArquivo\\src\\arquivojson\\saida.json"));
            nome = (String) jsonObject.get("nome");
            ultimoNome = (String) jsonObject.get("ultimo nome");
            cidade = (String) jsonObject.get("cidade");
            estado = (String) jsonObject.get("estado");

            System.out.printf("Meu nome completo é %s %s, nasci em %s do estado de %s. ",nome,ultimoNome,cidade,estado);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException f) {
            f.printStackTrace();
        }
        

    }
}
