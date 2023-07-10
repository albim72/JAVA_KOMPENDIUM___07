public class Users implements InterA, InterB{
    
    int rok = 2090;
    @Override
    public void sekcja() {
        System.out.println("Wrokshop I: Sieci neuronowe!");
    }

    @Override
    public String info() {

        return "Rejestracja -> konfernecja - AI złożone algorytmy!";
    }

    @Override
    public double wartosc(int x) {
        return 2*x;
    }

    @Override
    public double multi(int x, double y) {
        return x*y;
    }

    @Override
    public void opis(int x, double y) {
        System.out.println("wynik działania: "+ multi(x,y));
    }

    @Override
    public String user(String imie, String nazwisko) {
        return String.format("Uczestnik konferencji: %s %s, opłata wniesiona.",imie,nazwisko);
    }
}
