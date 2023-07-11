package marcin.com;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<Kolory> set1,set2,set3,set4;
        set1 = EnumSet.of(Kolory.ORANGE,Kolory.BLUE,Kolory.CYAN);
        System.out.println("Zbiór 1: " + set1);

        set2 = EnumSet.of(Kolory.ORANGE,Kolory.RED,Kolory.YELLOW);
        System.out.println("Zbiór 2: " + set2);

        set3 = EnumSet.of(Kolory.GREY);
        System.out.println("Zbiór 3: " + set3);

        set4 = EnumSet.of(Kolory.BLUE,Kolory.RED,Kolory.CYAN);
        System.out.println("Zbiór 4: " + set4);

        EnumSet<Dyscyplina> sport1 = EnumSet.allOf(Dyscyplina.class);
        EnumSet<Dyscyplina> sport2 = EnumSet.allOf(Dyscyplina.class);

        sport2.add(Dyscyplina.SIATKOWKA);
        System.out.println(sport1);
        System.out.println(sport2);

        boolean v2 = sport2.remove(Dyscyplina.SIATKOWKA);
        System.out.println("czy element został usunięty?" + v2);
        System.out.println(sport2);

        sport1.add(Dyscyplina.KOSZYKOWKA);
        System.out.println(sport1);
    }
}

