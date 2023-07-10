public class Osoba {
    String imie;
    String nazwisko;
    String miejsowosc;
    Integer wiek;
    Double wzrost;
    Double waga;

    public Osoba(String imie, String nazwisko, String miejsowosc, Integer wiek, Double wzrost, Double waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejsowosc = miejsowosc;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.createOsoba();
    }
    
    
    public Osoba(String imie, String nazwisko, Integer wiek, Double wzrost, Double waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.createOsoba();
    }

    public Osoba() {
        this.createOsoba();
    }
    
    public void printOsoba(){


        System.out.println("Osoba > imię: " + imie + ", nazwisko " + nazwisko + ", miasto: " + miejsowosc);
    }
    
    public void createOsoba(){
        System.out.println("Utworzono nową osobę!!!");
    }
}
    
