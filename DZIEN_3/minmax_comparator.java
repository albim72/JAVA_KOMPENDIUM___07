
public class Main {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maksimum z %d, %d, %d wynosi: %d\n\n",13,4,56,maximum(13,4,56));
        System.out.printf("Maksimum z %f, %f, %f wynosi: %f\n\n",4.55,6.8,3.01,maximum(4.55,6.8,3.01));
        System.out.printf("Maksimum z %s, %s, %s wynosi: %s\n\n","gruszka","ananas","kiwi",maximum("gruszka","ananas","kiwi"));
        System.out.printf("Maksimum z %d, %d, %d wynosi: %d\n\n",-2,-4,-11,maximum(-2,-4,-11));
    }
}
