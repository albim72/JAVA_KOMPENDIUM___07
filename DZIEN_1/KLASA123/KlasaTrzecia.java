public class KlasaTrzecia extends KlasaDruga {
    int d;
    public KlasaTrzecia(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }
    public String printABCD(){return "wartość a: " + a + ", wartość b: " + b +
            " , wartość c: " + c +  ", wartość d: " + d;}

    @Override
    public int suma() {
        return super.suma() + d;
    }
    
    
}
