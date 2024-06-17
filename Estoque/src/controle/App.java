package controle;

import java.util.Date;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        
        Leite l = new Leite();
        l.setNome("Piracanjuba");
        l.setQuantidade(12);
        l.setValor(12.21);

        Calendar c  = Calendar.getInstance();
        Date data = c.getTime();

        System.out.println(data);
        System.out.println(l.validade(data)); 




    }
}
