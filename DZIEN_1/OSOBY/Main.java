
public class Main {
    public static void main(String[] args) {

        Osoba os1 = new Osoba("Aneta","Grech","Kraków",33,178.0,66.0);
        os1.printOsoba();
        Osoba os2 = new Osoba("Jan","Kot",56,180.0,99.0);
        os2.printOsoba();
        Osoba os3 = new Osoba();
        os3.printOsoba();

        System.out.println("___________________________________________");

        Student st1 = new Student("Leon","Nowak","Opole",23,173.0,80.0,
                "A 345345","Informatyka","czwarty");
        st1.printOsoba();

        Student st2 = new Student("Nadia","Nowik",22,160.6,53.3,
                "rwe2345435","Ekomomia","trzeci");
        st2.printOsoba();
        
        //Student st3 = new Student();

    }
}
