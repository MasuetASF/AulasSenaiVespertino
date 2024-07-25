package arquivojson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;''




public class EscritaJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();


		//cria metodo escritor

		FileWriter escreve = null;

		//criação dos campos do arquivo JSON
		//metodo put() = insere os campos
		int i =1;

		jsonObject.put("nome", "Mateus");
		jsonObject.put("ultimo nome", "Ferreira");
		jsonObject.put("Cidade", "Valparaiso de Goias");
		jsonObject.put("Estado", "GO");

		try {

			escreve = new FileWriter("ManipulaArquivo\\src\\arquivojson\\saida.json");

			escreve.write(jsonObject.toString());
			escreve.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(jsonObject);
		

	}

}

