import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer sq1 = new StringTokenizer("Jacek Agata Jan Olga Tomek Benek Jacek");
        StringTokenizer sq2 = new StringTokenizer("Jacek Agata Janusz Olga Tomek Benek Jacek");

        while (sq1.hasMoreTokens())
            System.out.println(sq1.nextToken());
        System.out.println("__________________________________");
        while (sq2.hasMoreTokens())
            System.out.println(sq2.nextToken());

        String delim = ", ";
        String imie = "Jacek, Agata, Janusz, Olga, Tomek, Benek, Jacek";

        StringTokenizer podzielImie  = new StringTokenizer(imie,delim);
        int count = podzielImie.countTokens();
        System.out.println("Liczba słów: " + count);

        for(int i=6; i<=count;i++){
            System.out.println("token [" + i + "]: " + podzielImie.nextToken() );
        }

        System.out.println("____________________________________________");

        while (podzielImie.hasMoreTokens())
            System.out.println(podzielImie.nextToken());
    }
}
