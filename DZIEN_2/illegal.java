
public class Main {

    static void fun() throws IllegalAccessException
    {
        System.out.println("wnętrze funkcji FUN()");
        throw new IllegalAccessException("Informacja abc!");
    }
    public static void main(String[] args) {
       try{
           fun();
       }catch(IllegalAccessException e){
//           throw new RuntimeException(e);
           System.out.println(e.getMessage());
       }
    }
}
