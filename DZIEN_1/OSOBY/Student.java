public class Student extends Osoba{
    String nrAalbumu;
    String kierunek;
    String semestr;

    public Student(String imie, String nazwisko, String miejsowosc, Integer wiek, Double wzrost, Double waga, String nrAalbumu, String kierunek, String semestr) {
        super(imie, nazwisko, miejsowosc, wiek, wzrost, waga);
        this.nrAalbumu = nrAalbumu;
        this.kierunek = kierunek;
        this.semestr = semestr;
    }

    public Student(String imie, String nazwisko, Integer wiek, Double wzrost, Double waga, String nrAalbumu, String kierunek, String semestr) {
        super(imie, nazwisko, wiek, wzrost, waga);
        this.nrAalbumu = nrAalbumu;
        this.kierunek = kierunek;
        this.semestr = semestr;
    }

    @Override
    public void printOsoba() {
        super.printOsoba();
        System.out.println("Dane studenta: nr albumu " + nrAalbumu + ", kierunek: " + kierunek);
    }
}
