package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Peta extends Produto {
    private String sabor;


    public double venda(int pacote){
        return pacote * 6.70;
    }

    public double venda(double quilo){
        return quilo * 15.45;
    }

    
    @SuppressWarnings("deprecation")
    @Override
    public String validade(Date fabricacao){
        SimpleDateFormat fs = new SimpleDateFormat("dd/MM/yyyy");
        
        fabricacao.setDate(fabricacao.getDate() + 30);
        
        return fs.format(fabricacao);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    //criar metodos q reveba dt fab data validade 
    //determindar validade fixa e um randomica para a data que foi aberta.
    
    //criar dois produtos que utilizem o metodo de validade com sobescrita, 
    //sendo que o metodo recebera a data da fabricação, data de validade e data
    // de validade apos aberto.

    // o produto sta com a validade dentro do prazo ? 
    //quanto tempo falta para o produto vencer
    // 
}
