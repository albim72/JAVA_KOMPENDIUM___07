
public class Main {
    public static void main(String[] args) {
       StringBuffer s = new StringBuffer("to jest nowy teskt do wyświetlenia! kilka słow więcej...ważne informacje abc");
       int p = s.length();
       int q = s.capacity();
       System.out.println("długość p: " + p);
       System.out.println("zajętość q: " + q);

       StringBuffer imie = new StringBuffer("Jan");
       StringBuffer nazwisko = new StringBuffer("Nowak");

       imie.append(" Maria ");
        System.out.println(imie);
        imie.append(nazwisko);
        System.out.println(imie);

        StringBuffer miasto = new StringBuffer("KrakówWarszawaŁódźLublin");
        miasto.insert(6,", ");
        miasto.insert(16,", ");
        miasto.insert(22,", ");
        System.out.println(miasto);

        miasto.reverse();
        System.out.println(miasto);

        miasto.deleteCharAt(7);
        miasto.reverse();
        System.out.println(miasto);

        miasto.replace(4,6,"owianka");
        System.out.println(miasto);
    }
}
