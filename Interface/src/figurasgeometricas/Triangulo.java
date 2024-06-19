package figurasgeometricas;

public class Triangulo implements Figura{
    double base;
    double altura;
    double ladoA;
    double ladoB;
    double ladoC;
    
    
    public String getNomeFigura(){
        return "Triângulo";
        
    }
    
    public double getPerimetro(){
        double perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
    
    
    public double getArea(){
        return base * altura;
        
    }
    


    //getters e setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

}