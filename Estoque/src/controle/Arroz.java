package controle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Arroz extends Produto{

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
        
        fabricacao.setDate(fabricacao.getDate() + 1);
        
        return fs.format(fabricacao);
    }
    
    public String validade(LocalDate dataValidade){
        LocalDate now = LocalDate.now();
        boolean isAfter  = now.isBefore(dataValidade);
            if (isAfter) {
                 return "Produto dentro do prazo";
            }else{
                return "Produto vencido";
            }
    }

    public Period validade(LocalDate dataValidade, LocalDate dataAtual){
        Period period1 = Period.between(dataValidade, dataAtual);

        return period1;

    }
    



    
}
