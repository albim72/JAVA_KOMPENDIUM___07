package marcin.com;

import java.util.AbstractList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractList<String> absLista = new ArrayList<>();
        absLista.add("Marcin");
        absLista.add("Ewa");
        absLista.add("Jacek");
        absLista.add("Kraków");
        absLista.add("222444555");
        absLista.add("67.8");

        System.out.println("lista abstrakcyjna: " + absLista);
        absLista.remove(2);
        System.out.println("lista abstrakcyjna: " + absLista);

        AbstractList<Integer> mwar = new ArrayList<>();
        mwar.add(2);
        mwar.add(11);
        mwar.add(4);
        mwar.add(89);

        System.out.println(mwar);
//        int ind = mwar.indexOf(2);
//        System.out.println(ind);
//        mwar.remove(ind);
        mwar.remove((Integer)2);
        System.out.println(mwar);

    }
}
