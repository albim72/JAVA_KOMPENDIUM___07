public class Ekstra implements InterS {
    @Override
    public void Opis() {
        System.out.println("niezależna implementacja InterS");
    }

    @Override
    public int policz() {
        return 1909;
    }

    @Override
    public double wynik(int a, int b) {
        return a*b-2;
    }
}
