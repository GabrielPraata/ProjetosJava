public class Retangulo {
    public double l;
    public double a;

    public double area() {
        return l * a;
    }

    public double perimetro() {
        return 2 * (a * l);
    }

    public double diagonal() {
        return Math.sqrt(l * l + a * a);
    }

}
