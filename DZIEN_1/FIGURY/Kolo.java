public class Kolo extends Figura{
    public Kolo(double a) {
        super(a);
    }

    @Override
    public double PoliczPole() {
        return Math.PI*a*a;
    }
}
