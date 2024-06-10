public class App {
    public static void main(String[] args) {
        
        // int inteiro =1;
        // double decimal = 1.2;
        // float flutuante = 1.3f;
        // char unico = 'a';
        // String texto = "texto longo";
        // boolean vOUf = false;
        // byte meuByte = 00110;
        // long numeroGrande = 999999999;


        int numero1 = 10;
        int numero2 = 40;
        double numero3 = 5.5;
        double resultado = numero1 / (numero2 + numero3);

        // System.out.println("A soma dos três números é " + resultado);
        // System.out.printf("%.4f", resultado);

        String nome = "Mateus";
        String sobreNome = "Antônio";

        //System.out.println(nome + " " + sobreNome);


        int idade = 18;

        if (idade == 18) {
            System.out.println("Você tem 18 anos!");
        } 
        
        else if (idade > 18 ) {
            System.out.println("Você tem mais de 18 anos!");
        }else{
            System.out.println("Você é menor de idade!");
        }



    }
}
