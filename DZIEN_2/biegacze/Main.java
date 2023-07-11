
public class Main {
    public static void main(String[] args) {

        Biegacz b1 = new Biegacz("piwne",true,"Karol","Kot","Lublin",
                175.4, 80.0,43,"M",453,"Tatra Sky Marathon",45.0);
        System.out.println(b1.informacja());
        b1.daneOsoby();
        System.out.println("współczynnik BMI: " + b1.policzBMI());
        System.out.println("średnia prędkość biegu [min/km]: " + b1.avg_v(8.9));

    }
}
