package controle;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        
        Leite l = new Leite();
        l.setNome("Piracanjuba");
        l.setQuantidade(12);
        l.setValor(12.21);

        Calendar c  = Calendar.getInstance();
       
        Date data2 = c.getTime();
        
        
        LocalDate dataFabricacao = LocalDate.of(2024,7,19);
        LocalDate dataVencimento = LocalDate.of(2024,7,22);

        Arroz arroz = new Arroz();

        System.out.println("Hoje "+dataFabricacao);
        System.out.println("DataVencimento"+dataVencimento);

        System.out.println(arroz.validade(dataVencimento));

        System.out.println("Faltam "+arroz.validade(dataFabricacao,dataVencimento)+" para o vencimento do produto");


        

        

    }
}
