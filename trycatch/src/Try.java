public class Try {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[3];

        try {
            System.err.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
         }

        try {
            for(int i = 0; i < 4; i++){
                vetor[i] = i;
                System.out.println(vetor[i]);
            }
        } catch (IndexOutOfBoundsException e) {
           System.out.println(e);
        }
        catch(ArithmeticException f){
            System.out.println("Erro aritmetico");
        }
        finally{
            System.out.println("Final segundo try.");
        }    
    }
}
