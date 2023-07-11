
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Klon k = new Klon(101,"Projekt 54365544");
        Klon m = (Klon) k.clone();

        System.out.println(k.i);
        System.out.println(m.i);

        k.i = 780;
        System.out.println(k.i);
        System.out.println(m.i);

    }
}
