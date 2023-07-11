public class Biegacz extends Osoba{
    Integer nrstartowy;
    String nazwaZawodow;
    Double dlugoscTrasy;

    public Biegacz(String koloroczu, Boolean zdrowe, String imie, String nazwisko, String miasto, Double wzrost, 
                   Double waga, Integer wiek, String plec, Integer nrstartowy, String nazwaZawodow, 
                   Double dlugoscTrasy) {
        super(koloroczu, zdrowe, imie, nazwisko, miasto, wzrost, waga, wiek, plec);
        this.nrstartowy = nrstartowy;
        this.nazwaZawodow = nazwaZawodow;
        this.dlugoscTrasy = dlugoscTrasy;
    }

    @Override
    public double wada() {
        return 0;
    }

    @Override
    public void daneOsoby() {
        System.out.printf("Zawodnik -> imię: %s, nazwisko: %s, numer startowy: %d\n",imie,nazwisko,nrstartowy);
    }

    @Override
    public Double policzBMI() {
        double wzm = wzrost/100;
        return waga/(wzm*wzm);
    }
    
    public double avg_v(double predk){return predk;}
}
