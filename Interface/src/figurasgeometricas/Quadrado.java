package figurasgeometricas;

public class Quadrado implements Figura{
    double lado;

    public String getNomeFigura(){
        return "Quadrado";
    }

    @Override
    public double getArea(){
        double total = lado * lado;
        return total;
    }

    @Override
    public double getPerimetro(){
        double total = lado * 4;
        return total;
    }

    //get e set
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
