import java.util.Scanner;

public class Fibonacci {

    public static long fib(int numero){
        int F = 0;
        int ant = 0;
        
        for(int i = 1; i <= numero; i++){
            if (i == 1) {
                F = 1;
                ant = 0;
            }else{
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }

    public static long fibRec(int numero){
        if (numero < 2) {
            return numero;
        }else{
            return fibRec(numero - 1) + fibRec(numero - 2);
        }
    }


    public static long fibTer(int numero){
        return (numero < 2 ? numero : fibTer(numero -1 ) + fibTer(numero - 2) ) ;
    }

    private static int[] vetor = new int[50];
    private static int contador;

    public static long fibVetor(int numero){
        contador = 1;
        return vetRec(numero);
    }

    public static long vetRec(int numero){
        if (numero < 0) {
            return vetor[0];
        }else{
            if (contador < 3) {
                vetor[numero] = contador -1;
                contador ++;
            }else{
                vetor[numero] = vetor [numero + 1] + vetor [numero + 2];
            }
            return vetRec(numero - 1);
        }
    }
        

    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        int opcao = -1;
        int tamanhoVet = 0;
        
        while (opcao != 0) {

        System.out.println("Insira um opcão ");
        System.out.println("1 - Maneira interativa");
        System.out.println("2 - Recursiva 01");
        System.out.println("3 - Recursiva 02 - Operador ternário");
        System.out.println("4 - Recursiva 03 - Vetor");
        System.err.println("0 - Sair");
        opcao = entrada.nextInt();

        if (opcao != 0) {
            System.out.println("Informe o tamanho do Vetor");
            tamanhoVet = entrada.nextInt();
        }
            switch (opcao) {
                case 1:
                    // 0 1 1 2 3 5 8 13 21 34 55 89 144...
                    System.out.println("Calculando de maneira interativa");
                    for(int i = 0; i < tamanhoVet; i++){
                        System.out.println("("+i+"): " + Fibonacci.fib(i) + "\t" );
                    }   
                    break;
                case 2:
                    System.out.println("Recursiva 01");
                    for(int i = 0; i < tamanhoVet; i++){
                        System.out.println("("+i+"): " + Fibonacci.fibRec(i) + "\t" );
                    }
                    break;
                case 3:
                    System.out.println("Recursiva 02 - Operador ternário");
    
                    for(int i = 0; i < tamanhoVet; i++){
                        System.out.println("("+i+"): " + Fibonacci.fibTer(i) + "\t" );
                    }
                    break;
                case 4:
                    System.out.println("Recursiva 03 - Vetor");
                    for(int i = 0; i < tamanhoVet; i++){
                        System.out.println("("+i+"): " + Fibonacci.fibVetor(i) + "\t" );
                    }
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;   
                default:
                    break;
            }//end switch
        }//end while
        
        entrada.close();        

    }//end main
}
