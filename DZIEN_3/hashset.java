import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(11);
        lista1.add(21);
        lista1.add(51);
        lista1.add(49);
        lista1.add(49);

        lista2.add(45);
        lista2.add(48);
        lista2.add(49);
        set.add(lista1);
        set.add(lista2);

        System.out.println(set.size());
        System.out.println(set);

        HashSet<Integer> zlisty = new HashSet<>(lista1);
        System.out.println(zlisty);
        Set<Boolean> opcja = new HashSet<Boolean>();
        opcja.add(true);
        opcja.add(false);
        opcja.add(true);
        System.out.println(opcja);
        }
    }
