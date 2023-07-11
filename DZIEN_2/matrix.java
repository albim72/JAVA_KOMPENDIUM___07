
public class Main {
    public static void main(String[] args) {

        int rows = 4;
        int cols = 4;

        int[][] array = new int[rows][cols];

        int value = 1;
        for (int j=0;j<rows;j++){
            for (int k=0;k<cols;k++){
                array[j][k] = value;
                value ++;
            }
        }

        System.out.println("Macierz -> 2 wyniary");
        for (int j=0;j<rows;j++){
            for (int k=0;k<cols;k++){
                System.out.println(array[j][k] + " ");
            }
            System.out.println("_____________________________");
        }
    }
}
