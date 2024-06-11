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


    //TODO
    // inverter o vetor
    // public static int inverteVetor (int[] numero){
        
    //     for (int i = 0; i < numero.length; i++) {
    //             System.out.println(numero[i]);
    //         }
    //     System.out.println("Agora a ordem invertida");
    //     for (int j = numero.length - 1; j >= 0; j--) {
    //             System.out.println(numero[j]);
    //     }
    //     return System.out.println(numero[j]);

    // }
        

    public static void main(String[] args) throws Exception {
        // 0 1 1 2 3 5 8 13 21 34 55 89 144...
        System.out.println("Calculando de maneira interativa");

        for(int i = 0; i < 10; i++){
            System.out.println("("+i+"): " + Fibonacci.fib(i) + "\t" );
        }

        System.out.println("Recursiva 01");

        for(int i = 0; i < 10; i++){
            System.out.println("("+i+"): " + Fibonacci.fibRec(i) + "\t" );
        }

        System.out.println("Recursiva 02 - Operador ternário");

        for(int i = 0; i < 10; i++){
            System.out.println("("+i+"): " + Fibonacci.fibTer(i) + "\t" );
        }

        System.out.println("Recursiva 03 - Vetor");

        for(int i = 0; i < 10; i++){
            System.out.println("("+i+"): " + Fibonacci.fibVetor(i) + "\t" );
        }

        System.out.println("Esse é o elementeo na posição 04: " +vetor[2]);


        
        //TODO
        //Criar menu com switch indicando qual tipo de metodo de fibonacci o usuário quer
        
        

    }
}
