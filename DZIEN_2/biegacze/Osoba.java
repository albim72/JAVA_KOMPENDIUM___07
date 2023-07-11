public abstract class Osoba extends Oczy{
    protected String imie;
    protected String nazwisko;
    protected String miasto;
    protected Double wzrost;
    protected Double waga;
    protected Integer wiek;
    protected String plec;

    public Osoba(String koloroczu, Boolean zdrowe, String imie, String nazwisko, String miasto, 
                 Double wzrost, Double waga, Integer wiek, String plec) {
        super(koloroczu, zdrowe);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wzrost = wzrost;
        this.waga = waga;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String informacja(){return "osoba utworzona na podstawie modelu abstrakcyjnego: Osoba";}
    public abstract void daneOsoby();
    public abstract Double policzBMI();
}
