
public class Main {

    public static <E> void printArray(E[] inputArray){
        for (E element:inputArray){
            System.out.printf("-> %s ",element);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,4,7,9,11,45,67,5,16,189};
        Double[] dblArray = {3.3,18.9,11.23,7.8,1.32,5.34,18.9,4.6};
        Character[] charArray = {'G','A','M','L'};

        System.out.println("tablica intArray zawiera: ");
        printArray(intArray);

        System.out.println("tablica dblArray zawiera: ");
        printArray(dblArray);

        System.out.println("tablica chrArray zawiera: ");
        printArray(charArray);
    }
}
