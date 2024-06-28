package arquivojson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class ExercicioEscrita {

    public static void main(String[] args) {
        
        // Lista para armazenar objetos JSON de pessoas
        List<JSONObject> listaPessoa = new ArrayList<>();

        try (FileWriter escreve = new FileWriter("ManipulaArquivo/src/arquivojson/saida2.json")) {
            
            // Loop para criar objetos JSON diferentes e adicionar à lista
            for (int i = 0; i < 100; i++) {
                JSONObject pessoaJson = new JSONObject();
                pessoaJson.put("nome", "fulano" + i);
                pessoaJson.put("ultimo nome", "siclano" + i);
                listaPessoa.add(pessoaJson);
            }
            
            JSONObject pessoasJson = new JSONObject();
            pessoasJson.put("Dados", listaPessoa);
            List<JSONObject> arrayPessoas = new ArrayList<>();
            arrayPessoas.add(pessoasJson);
            
            // Escrevendo a lista de JSONs no arquivo
            for (JSONObject json : arrayPessoas) {
                escreve.write(json.toString());
                //escreve.write("\n"); // Incluir uma quebra de linha entre cada objeto, opcional
            }
                       
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
