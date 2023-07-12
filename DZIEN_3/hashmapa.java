import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa = new HashMap<>();

        mapa.put("adam",19);
        mapa.put("maria",23);
        mapa.put("ada",21);
        mapa.put("robert",33);
        mapa.put("ela",12);
        mapa.put("olaf",56);
        System.out.println("Rozmiar mapy: " + mapa.size());
        System.out.println("Mapa: " + mapa);

        if(mapa.containsKey("olaf")){
            Integer a  = mapa.get("olaf");
            System.out.println("wartość dla klucza -> olaf: " + a);
        }
        System.out.println(mapa.get("olaf").hashCode());

        HashMap<Integer,String> hm1 = new HashMap<>(12);
        HashMap<Integer,String> hm2 = new HashMap<>(4);

        hm1.put(1,"zielony");
        hm1.put(2,"czarny");
        hm1.put(3,"czerwony");
        hm1.put(4,"niebieski");

        hm2.put(5,"rozmyty");
        hm2.put(6,"gładki");
        hm2.put(7,"prosty");
        hm2.put(8,"szary");
        hm2.put(9,"bury");

        System.out.println("mapowanie dla hm1: " + hm1);
        System.out.println("mapowanie dla hm2: " + hm2);

        hm1.put(3,"biały");
        System.out.println("mapowanie dla hm1: " + hm1);
    }
}
