package escola.secretaria.Enum;

public enum Disciplinas {
     //enum: enumera uma lista de informações

     MATEMATICA("Matematica"),
     PORTUGUES("Português"),
     HISTORIA("História"),
     GEOGRAFIA("Geografia"),
     CIENCIAS("Ciências");
 
     private String disciplinas;
 
     private Disciplinas(String disciplinas){
         this.disciplinas = disciplinas;
     }
}
