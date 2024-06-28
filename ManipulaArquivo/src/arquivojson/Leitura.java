package arquivojson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

public class ExercicioEscrita {

    public static void main(String[] args) {
        
        // Lista para armazenar objetos JSON de pessoas
        List<JSONObject> listaPessoa = new ArrayList<>();

        try (FileWriter escreve = new FileWriter("ManipulaArquivo/src/arquivojson/saida2.json")) {
            
            // Loop para criar 10 objetos JSON diferentes e adicionar à lista
            for (int i = 0; i < 10; i++) {
                JSONObject pessoaJson = new JSONObject();
                pessoaJson.put("nome", "fulano" + i);
                pessoaJson.put("ultimo nome", "siclano" + i);
                listaPessoa.add(pessoaJson);
            }
            
            // Escrevendo a lista de JSONs no arquivo
            for (JSONObject json : listaPessoa) {
                escreve.write(json.toString());
                escreve.write("\n"); // Incluir uma quebra de linha entre cada objeto, opcional
            }
            
            System.out.println("Arquivo 'saida2.json' criado com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
