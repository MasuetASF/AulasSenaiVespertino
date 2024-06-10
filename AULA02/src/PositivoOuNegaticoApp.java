public class PositivoOuNegaticoApp {
    public static void main(String[] args) {
        //Verificação de resultado, multipliquem dois numeros e o resultado será comparado entre positivo e negativo

        int numero1 = 2;
        int numero2 = 2;
        int resultado=0;
        resultado = numero1 * numero2;

        //String positivoOuNegativo = resultado < 0 ? "O número é negativo" : "O número é positvo";

        //System.out.println(positivoOuNegativo);       

        if (resultado < 0 ) {
            System.out.printf("O número %d é negativo", resultado);
        } else if (resultado > 0) {
            System.out.printf("O número %d é positvo", resultado);
        }else{
            System.out.printf("O número %d é neutro", resultado);
        }

    }
}
