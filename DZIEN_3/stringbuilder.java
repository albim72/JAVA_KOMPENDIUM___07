
public class Main {
    public static void main(String[] args) {
       StringBuilder str01 = new StringBuilder();
       str01.append("szkolenie z zakresu programowania w języku Java");
       System.out.println("informacja str01: " + str01);

       StringBuilder znaki = new StringBuilder("AAVVBNDGHJSSSGRCHJ");
       System.out.println("znaki: " + znaki);

       StringBuilder wart = new StringBuilder(233);
       System.out.println(wart);
       System.out.println(wart.capacity());

       StringBuilder str02 = new StringBuilder(str01.toString());
        System.out.println("drugi tekst: " + str02);
        StringBuilder str03 = str01.reverse();
        System.out.println("trzeci tekst: " + str03);

        StringBuilder str04 = new StringBuilder(str01.reverse());
        System.out.println(str04);

        System.out.println(str03 == str01);
        System.out.println(str03 == str04);
    }
}
