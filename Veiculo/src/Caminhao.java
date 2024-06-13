public class Caminhao extends Veiculo{
    private int eixos;
    private boolean cacamba;

    public boolean levantarCacamba (boolean statusCacamba){
        if(cacamba == true){
            return cacamba = statusCacamba;
        }else{
            return cacamba = false;
        }
    }


    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }


    public boolean isCacamba() {
        return cacamba;
    }

    public boolean getCacamba() {
        return cacamba;
    }

    public void setCacamba(boolean cacamba) {
        this.cacamba = cacamba;
    }
    

    
}
