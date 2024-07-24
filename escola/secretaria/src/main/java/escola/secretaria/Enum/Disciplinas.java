package escola.secretaria.Enum;

public enum Disciplinas {
     //enum: enumera uma lista de informações

     MATEMATICA("Matemática"),
     PORTUGUES("Português"),
     HISTORIA("História"),
     GEOGRAFIA("Geografia"),
     ABC("abc"),
     CIENCIAS("Ciências");
 
     private String disciplinas;
 
     private Disciplinas(String disciplinas){
         this.disciplinas = disciplinas;
     }
}
