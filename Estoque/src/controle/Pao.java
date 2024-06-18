package controle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Pao extends Produto{

    private String tipoPao;

    


    public Pao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
        
        fabricacao.setDate(fabricacao.getDate() + 1);
        
        return fs.format(fabricacao);
    }

    public String validade(LocalDate fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
        
        fabricacao.plusDays(1);
        
        return fs.format(fabricacao);
    }

    //metodos getters e setters
    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    

}
