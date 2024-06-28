package ibgecnae;

// https://jar-download.com/artifacts/org.glassfish/javax.json/1.1.4/source-code
// https://servicodados.ibge.gov.br/api/docs/localidades

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;


public class IbgeCnae {
    
    public static void main(String[] args) {
        
        //Criar um objeto generico
        JsonObject jo = Json.createObjectBuilder()
            .add("id", "number")
            .add("nome","nome do distrito ")
            .add("municipio", Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                    .add("id", "number")
                    .add("nome", "string")
                    .add("microrregiao", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                            .add("id", "number")
                            .add("nome", "string")
                            .add("mesorregiao",Json.createArrayBuilder()
                                .add(Json.createObjectBuilder()
                                    .add("id", "number")
                                    .add("nome", "string")
                                    .add("UF", Json.createArrayBuilder()
                                        .add(Json.createObjectBuilder()
                                            .add("id", "number")
                                            .add("nome","string" )
                                            .add("sigla", "string")
                                            .add("regiao", Json.createArrayBuilder()
                                                .add(Json.createObjectBuilder()
                                                .add("id", "number")
                                                .add("nome","string" )
                                                .add("sigla", "string")
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                            .add("regiao imediata", Json.createArrayBuilder()
                                .add(Json.createObjectBuilder()
                                    .add("id", "number")
                                    .add("nome","string" )
                                    .add("regiao-intermediaria", Json.createArrayBuilder()
                                    .add(Json.createObjectBuilder()
                                        .add("id", "number")
                                        .add("nome", "string")
                                        .add("UF", Json.createArrayBuilder()
                                                .add(Json.createObjectBuilder()
                                                    .add("id", "number")
                                                    .add("nome", "string")
                                                    .add("sigla", "string")
                                                    .add("regiao", Json.createArrayBuilder()
                                                        .add(Json.createObjectBuilder()
                                                            .add("id", "number")
                                                            .add("nome", "string")
                                                            .add("sigla", "string")
                                                        )
                                                    )
                                                )
                                            )
                                        )    
                                    )
                                )
                            )
                        )
                    )
                )   
            )
            .build();

            try (FileWriter fileWriter = new FileWriter("ManipulaArquivo\\src\\ibgecnae\\saida3.json")) {
                
                Map<String, Boolean> config = new HashMap<>();
                config.put(JsonGenerator.PRETTY_PRINTING, true);

                JsonWriterFactory writerFactory = Json.createWriterFactory(config);
                JsonWriter jsonWriter = writerFactory.createWriter(fileWriter);

                jsonWriter.writeObject(jo);

                jsonWriter.close();

            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        
        //lendo um array de objetos genericos
        // JsonReader jsr = Json.createReader(new StringReader( 
        //     String.format("[ %s ]", jo ) ) );
            
        //     for ( JsonValue jsv : jsr.readArray() ) {
                
        //         JsonObject jso = jsv.asJsonObject();
        //     System.out.println( "Nome: " + jso.getString( "nome" ) );
        //     System.out.println( "Nome: " + jso.getString( "sobrenome" ) );
                       
            
        // }
    }   
}
