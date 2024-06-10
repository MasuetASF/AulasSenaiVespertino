import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        int primeiro = 0, segundo = 0;
        int resultado  = 0;
        double resultadoDivisao;

        
        Scanner entrada = new Scanner(System.in);
             

        int opcao = -1;

        while (opcao != 0) {
            
            System.out.println("Insira um opção ");
            opcao = entrada.nextInt();
            
            if (opcao != 0) {
                System.out.println("Insira o primeiro número: ");
            primeiro = entrada.nextInt();

            System.out.println("Insira o segundo número: ");
            segundo = entrada.nextInt();
            }


            switch (opcao) {
                case 1:
                    //Vamos realizar uma soma    
                    resultado = primeiro + segundo;
                    System.out.printf(" A soma de %d + %d é igual a %d\n",primeiro, segundo, resultado);
                    break;
                case 2:
                    //Vamos realizar uma subtração
                    resultado = primeiro - segundo;
                    System.out.printf(" A subtração de %d + %d é igual a %d\n",primeiro, segundo, resultado);
                    break;
                case 3:
                    //Vamos realizar um multiplicação
                    resultado = primeiro * segundo;
                    System.out.printf(" A multiplicação de %d + %d é igual a %d\n",primeiro, segundo, resultado);
                    break;
                case 4:
                    //Vamos realizar um divisão
                    resultadoDivisao = (double) primeiro / (double) segundo;
                    System.out.println("A divisão de "+primeiro+" / "+segundo+ " é igual a \n" + resultadoDivisao  );
                    break;
                case 5:
                    resultado = (int) Math.pow(primeiro, segundo);
                    System.out.println(resultado);
                    break;   
                case 0:
                    System.out.println("Encerrando");
                    break;
                default:
                    //
                    System.out.println("Erro! Opção inválida\n");
                    break;

            }
        
        }
    
        entrada.close();
    }
}
