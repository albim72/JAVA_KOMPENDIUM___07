package marcin.com;

import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {
        EnumMap<Dni,String> kalendarium = new EnumMap<>(Dni.class);
        kalendarium.put(Dni.PONIEDZIALEK,"początek tygodnia...");
        kalendarium.put(Dni.WTOREK,"ciąg dalszy...");
        kalendarium.put(Dni.SRODA,"środek tygodnia...");
        kalendarium.put(Dni.CZWARTEK,"pracowity...");
        kalendarium.put(Dni.PIATEK,"koniec tygodnia...");
        kalendarium.put(Dni.SOBOTA,"odpoczynek...");
        kalendarium.put(Dni.NIEDZIELA,"trochę ruchu...");

        System.out.println(kalendarium);

        System.out.println(Dni.PIATEK);
        System.out.println(kalendarium.get(Dni.PIATEK));
        System.out.println(kalendarium.keySet());
    }
}
