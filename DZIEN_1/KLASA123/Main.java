
public class Main {
    public static void main(String[] args) {
        System.out.println("_________ KlasaPierwsza _________");
        KlasaPierwsza kp = new KlasaPierwsza(3,7);
        System.out.println(kp.printAB());

        System.out.println("_________ KlasaDruga _________");
        KlasaDruga kd = new KlasaDruga(4,7,2);
        System.out.println(kd.printAB());
        System.out.println(kd.printABC());
        System.out.println(kd.suma());

        System.out.println("_________ KlasaDruga _________");
        KlasaTrzecia kt = new KlasaTrzecia(2,9,8,3);
        System.out.println(kt.printAB());
        System.out.println(kt.printABC());
        System.out.println(kt.printABCD());
        System.out.println(kt.suma());


        System.out.println("_________ KlasaEkstra _________");
        Ekstra ek = new Ekstra();
        ek.Opis();
        System.out.println(ek.policz());
        System.out.println(ek.wynik(8,3));
        System.out.println(ek.ob(4.5,1.2));

        System.out.println("__________________________________");
        InterS ss = new Ekstra();
        ss.Opis();
        System.out.println(ss.policz());
        System.out.println(ss.wynik(8,3));
        //System.out.println(ss.ob(4.5,1.2));
    }
}
