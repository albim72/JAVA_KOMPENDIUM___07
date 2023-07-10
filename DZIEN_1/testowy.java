import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("to jest pierwszy program w języku Java");
        System.out.println("sout -> skrót do System.out.println");

        int a = 7;
        System.out.println(a);
        double b = 13.76;
        System.out.println(b);
        double c = b/a;
        System.out.println(c);

        int v = 8;
        double k = (double) v/a;
        System.out.println(k);

        boolean g = true;
        //System.out.println(g*2);

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą  ax: ");
        int ax = in.nextInt();

        System.out.println("3*ax = " + ax*3);

        System.out.println("Podaj liczbę całkowitą  bx: ");
        int bx = in.nextInt();

        int potega = (int)Math.pow(3*ax,bx+2);

        System.out.println(potega);

        }
    }
