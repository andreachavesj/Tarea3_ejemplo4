public class Circulo extends FormaGeometrica {

    private double radioCirculo;


    public Circulo(double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }


    @Override
    public double area() {
        double total = 3.14 * (radioCirculo * radioCirculo);
        return total;
    }
}