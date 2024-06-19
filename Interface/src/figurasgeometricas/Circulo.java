package figurasgeometricas;

public class Circulo implements Figura{
    double raio;

    public String getNomeFigura(){
        return "Circulo";
    }

    public double getArea(){
        double area = Math.PI * Math.pow(raio, 2) ;
        return area;
    }

    public double getPerimetro(){
        double perimetro = Math.PI * 2 * raio;
        return perimetro;
    }


    //get e set
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
