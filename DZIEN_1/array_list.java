import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arrli = new ArrayList<>(n);

        for (int i = 1; i <= n; i++)
            arrli.add(4 * i);
        System.out.println(arrli);

        System.out.println("___________________________________________________");
        for(int i=0;i<arrli.size();i++){
            System.out.println(i + " element: " + arrli.get(i));
        }
    }
}
