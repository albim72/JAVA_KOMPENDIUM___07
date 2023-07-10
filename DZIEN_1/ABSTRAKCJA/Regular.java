public class Regular extends Prototyp {
    int y;
    public Regular(int x, int y) {
        super(x);
        this.y=y;
    }

    @Override
    public double policz() {
        return 1001;
    }

    @Override
    public double policzX() {
        return x*(2-y);
    }
}
