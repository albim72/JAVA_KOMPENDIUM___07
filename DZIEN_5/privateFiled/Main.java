import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try{
            Student e = new Student("Nadia",22);
            Field privateField = Student.class.getDeclaredField("name");
            privateField.setAccessible(true);
            String name = (String) privateField.get(e);
            System.out.println("Imię studenta: " + name);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
