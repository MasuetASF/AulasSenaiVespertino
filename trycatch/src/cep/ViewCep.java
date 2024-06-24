package cep;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class ViewCep {
    public static void main(String[] args) {
    
        String padrao = "##.###-###";
        String cep = "12345678";
        //telefone e cpf cep

        System.out.println(FormartaCep(cep, padrao));
    }

    public static String FormartaCep(String cep, String padrao){
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter(padrao);
            mascara.setValueContainsLiteralCharacters(false);
            return mascara.valueToString(cep);
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


}

    // public static String FormartaCep(String cep) throws CepInvalido{
    //     if (cep.length() < 8) {
    //         throw  new CepInvalido("A quantidade de caracteres é menor de 8");
    //     }else if (cep.length() > 8) {
    //         throw  new CepInvalido("A quantidade de caracteres é maior de 8");
    //     }
    //     else{
    //         return "12.345-678";
    //     }
    // }


    // try {
    //     String cep = FormartaCep("12345678");
    //     System.out.println(cep);
        
    // } catch (CepInvalido e) {
    //     System.err.println(e.getMessage());
    // } 