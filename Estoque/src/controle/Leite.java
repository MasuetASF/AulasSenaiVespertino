package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Leite extends Produto{

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
        
        fabricacao.setDate(fabricacao.getDate() + 120);
        
        return fs.format(fabricacao);
    }


    @SuppressWarnings("deprecation")
    public String validade(Date dataAbertura, Date dataValidade){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
        dataAbertura.setDate(dataAbertura.getDate() + 3);

        if (dataAbertura.before(dataValidade)) {
            return fs.format(dataAbertura);
        }else 
        return"Produto vencido";

       
    }


    


}
