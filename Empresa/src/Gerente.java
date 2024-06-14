public class Gerente extends Secreatario{
    

    public boolean realizarReuniao(boolean gerenteDisponivel, boolean reuniaoMarcada){
        if (gerenteDisponivel == true &&  reuniaoMarcada == true ) {
           return true; 
        }else{
            return false;
        }
    }

}
