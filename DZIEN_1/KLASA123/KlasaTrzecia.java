public class KlasaTrzecia extends KlasaDruga implements InterS {
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


    @Override
    public void Opis() {
        System.out.println("To jest implementacja intefeksu InterS w klasie KlasaTrzecia");
    }

    @Override
    public int policz() {
        return 444 + d;
    }

    @Override
    public double wynik(int a, int b) {
        return a/(2+b);
    }
}
