package figurasgeometricas;

public class View {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);

        System.out.println(quadrado.getNomeFigura());
        System.out.println("Valor lado: " + quadrado.getLado());
        System.out.println("Valor Perimetro "+quadrado.getPerimetro());
        System.out.println("Valor Area "+quadrado.getArea());

        Circulo circulo = new Circulo();
        circulo.setRaio(6);
        System.out.println(circulo.getNomeFigura());
        System.out.println("Valor Perimetro "+circulo.getPerimetro());
        System.out.println("Valor Area "+circulo.getArea());
        

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(5);
        triangulo.setBase(10);
        triangulo.setLadoA(15);
        triangulo.setLadoB(10);
        triangulo.setLadoC(8);

        System.out.println(triangulo.getNomeFigura());
        System.out.println("Valor Area " +triangulo.getArea());
        System.out.println("Valor Perimetro "+triangulo.getPerimetro());
        
        
        

    }

    
}
