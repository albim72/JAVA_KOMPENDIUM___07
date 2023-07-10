
public class Main {
    public static void main(String[] args) {
        System.out.println("____________ Pole Prostokąta ______________");

        Prostokat pr  = new Prostokat(4.6,8.8);
        System.out.println("pole prostokoąta = "  + pr.PoliczPole() + " cm2");

        System.out.println("____________ Pole Trójkąta ______________");
        Trojkat tr = new Trojkat(6.6,8.9);
        System.out.println("pole trójkąta = "  + tr.PoliczPole() + " cm2");

        System.out.println("____________ Pole Trapeza ______________");
        Trapez trp = new Trapez(8.2,6.1,5.8);
        System.out.println("pole trapezu = "  + trp.PoliczPole() + " cm2");

        System.out.println("____________ Pole Koła ______________");
        Kolo kl = new Kolo(5.5);
        System.out.println("pole koła = "  + kl.PoliczPole() + " cm2");

    }
}
