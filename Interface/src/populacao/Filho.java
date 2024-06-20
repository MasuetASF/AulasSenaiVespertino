package populacao;

public class Filho implements Pai, Mae {

    public String nome;
    public int idade;
    public String corPeleMae;
    public String corPelePai;
    public String corMae;
    public String corPai;

    //get e set
    public String getCorPeleMae() {
        return corPeleMae;
    }

    public void setCorPeleMae(String corPeleMae) {
        this.corPeleMae = corPeleMae;
    }

    public String getCorPelePai() {
        return corPelePai;
    }

    public void setCorPelePai(String corPelePai) {
        this.corPelePai = corPelePai;
    }

    public String getCorMae() {
        return corMae;
    }

    public void setCorMae(String corMae) {
        this.corMae = corMae;
    }

    public String getCorPai() {
        return corPai;
    }

    public void setCorPai(String corPai) {
        this.corPai = corPai;
    }
        
    public String getNome() {
            return nome;
        }

    public void setNome(String nome) {
            this.nome = nome;
        }

    public int getIdade() {
            return idade;
        }

    public void setIdade(int idade) {
            this.idade = idade;
        }
    //end get e set

    @Override
    public double altura(double altura) {
        return altura * Math.PI / 3;
    }

    @Override
    public boolean barba(boolean tem) {
        return tem;
    }

    @Override
    public boolean calvice(double alt) {
        if (alt > 1.50) {
            return true;
        } else{
            return false;
        }   
    }

    //mae
    @Override
    public String corDaPele() {
        if (corPeleMae.equalsIgnoreCase("parda") && corPelePai.equalsIgnoreCase("parda")){
            return "parda";
        }else if(corPeleMae.equalsIgnoreCase("parda") && corPelePai.equalsIgnoreCase("preta")){
            return "preta";
        }else if(corPeleMae.equalsIgnoreCase("parda") && corPelePai.equalsIgnoreCase("branca")){
            return "parda";
        }
        else if(corPeleMae.equalsIgnoreCase("preta") && corPelePai.equalsIgnoreCase("preta")){
            return "preta";
        }
        else if(corPeleMae.equalsIgnoreCase("preta") && corPelePai.equalsIgnoreCase("branca")){
            return "parda";
        }else if(corPeleMae.equalsIgnoreCase("preta") && corPelePai.equalsIgnoreCase("parda")){
            return "parda";
        }else if(corPeleMae.equalsIgnoreCase("branca") && corPelePai.equalsIgnoreCase("branca")){
            return "branco";
        }else if(corPeleMae.equalsIgnoreCase("branca") && corPelePai.equalsIgnoreCase("preta")){
            return "parda";
        }else if(corPeleMae.equalsIgnoreCase("branca") && corPelePai.equalsIgnoreCase("parda")){
            return "braca";
        }
        else{
            return "amarelo";
        }
    }

    @Override
    public String corOlhos() {
        if (corMae.equalsIgnoreCase("castanho") && corPai.equalsIgnoreCase("castanho")){
            return "castanho";
        }else if(corMae.equalsIgnoreCase("castanho") && corPai.equalsIgnoreCase("azul")){
            return "verde";
        }
        else if(corMae.equalsIgnoreCase("castanho") && corPai.equalsIgnoreCase("verde")){
            return "verde";
        }
        else if(corMae.equalsIgnoreCase("azul") && corPai.equalsIgnoreCase("castanho")){
            return "verde";
        }else if(corMae.equalsIgnoreCase("azul") && corPai.equalsIgnoreCase("azul")){
            return "azul";
        }else if(corMae.equalsIgnoreCase("azul") && corPai.equalsIgnoreCase("verde")){
            return "verde";
        }else if(corMae.equalsIgnoreCase("verde") && corPai.equalsIgnoreCase("castanho")){
            return "verde";
        }else if(corMae.equalsIgnoreCase("verde") && corPai.equalsIgnoreCase("azul")){
            return "azul";
        }else if(corMae.equalsIgnoreCase("verde") && corPai.equalsIgnoreCase("verde")){
            return "azul";
        }
        else{
            return "preto";
        }
    }

    @Override
    public String tipoDeCabelo(String tipoCabeloMae, String tipoCabeloPai) {
        if (tipoCabeloMae.equalsIgnoreCase("liso") && tipoCabeloPai.equalsIgnoreCase("liso")){
            return "liso";
        }else if(tipoCabeloMae.equalsIgnoreCase("liso") && tipoCabeloPai.equalsIgnoreCase("ondulado")){
            return "ondulado";
        }
        else if(tipoCabeloMae.equalsIgnoreCase("liso") && tipoCabeloPai.equalsIgnoreCase("crespo")){
            return "ondulado";
        }
        else if(tipoCabeloMae.equalsIgnoreCase("ondulado") && tipoCabeloPai.equalsIgnoreCase("ondulado")){
            return "ondulado";
        }else if(tipoCabeloMae.equalsIgnoreCase("ondulado") && tipoCabeloPai.equalsIgnoreCase("liso")){
            return "ondulado";
        }else if(tipoCabeloMae.equalsIgnoreCase("ondulado") && tipoCabeloPai.equalsIgnoreCase("crespo")){
            return "crespo";
        }else if(tipoCabeloMae.equalsIgnoreCase("crespo") && tipoCabeloPai.equalsIgnoreCase("crespo")){
            return "crespo";
        }else if(tipoCabeloMae.equalsIgnoreCase("crespo") && tipoCabeloPai.equalsIgnoreCase("liso")){
            return "ondulado";
        }else if(tipoCabeloMae.equalsIgnoreCase("crespo") && tipoCabeloPai.equalsIgnoreCase("ondulado")){
            return "crespo";
        }
        else{
            return "careca";
        }

    }


}