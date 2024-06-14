public class Secreatario extends Funcionario{
    private boolean ramalDisponivel;
    private boolean statusReuniao = false;

    public boolean getRamalDisponivel() {
        return ramalDisponivel;
    }

    public void setRamalDisponivel(boolean ramal) {
        this.ramalDisponivel = ramal;
    }

    public boolean getStatusReuniao() {
        return statusReuniao;
    }
    public void setStatusReuniao(boolean statusReuniao) {
        this.statusReuniao = statusReuniao;
    }

    

    public boolean marcarReuniao(boolean GerenteDisponivel){
        if (GerenteDisponivel == true && ramalDisponivel == true) {
            return statusReuniao = true;
        }else{
            return statusReuniao = false;
        } 
    }


}
