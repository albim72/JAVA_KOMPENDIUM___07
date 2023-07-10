public class KlasaDruga extends KlasaPierwsza {
    int c;
    public KlasaDruga(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public String printABC(){return "wartość a: " + a + ", wartość b: " + b + " , wartość c: " + c;}

    public int suma(){return a+b+c;}
}
