
public class Main {
    public static void main(String[] args) {

        Testowa<Integer> iObj = new Testowa<>(14);
        System.out.println(iObj.getObj());

        Testowa<String> sObj = new Testowa<>("ważna informacja!!!");
        System.out.println(sObj.getObj());

        Testowa<Double> dObj = new Testowa<>(5.785);
        System.out.println(dObj.getObj());
    }
}
