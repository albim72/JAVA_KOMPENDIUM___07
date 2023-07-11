package marcin.com;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> zawody = new LinkedList<>();

        zawody.add("Boston Marathon");
        zawody.add("London Marathon");
        zawody.add("Maraton Warszawski");
        zawody.add("Tatra Sky Marathon");
        zawody.add("Gorce Ultra-Trail");
        System.out.println(zawody);

        zawody.remove("Gorce Ultra-Trail");
        zawody.remove(0);

        System.out.println(zawody);

        zawody.add("Półmaraton Solidarności");
        zawody.addFirst("Bieg Rzeźnika");
        zawody.addLast("Bieg na Kasprowy");

        System.out.println(zawody);

        zawody.add(2,"Bieg Bizona");
        System.out.println(zawody);

        LinkedList<String> inne = new LinkedList<>();
        inne.add("Bieg rolnika");
        inne.add("BMaraton Krakowski");
        inne.add("Berlin Marathon");

        zawody.addAll(inne);
        System.out.println(zawody);
    }
}
