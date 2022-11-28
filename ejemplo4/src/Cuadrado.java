public class Cuadrado extends FormaGeometrica {

    private double ladoCuadrado;

    public Cuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    @Override
    public double area() {
        double total = (ladoCuadrado*ladoCuadrado);
        return total;
    }
}