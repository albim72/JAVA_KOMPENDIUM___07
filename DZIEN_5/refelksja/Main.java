import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Check c = new Check();
        c.printData();

        Method m = Check.class.getDeclaredMethod("privateMethod");
        m.setAccessible(true);
        m.invoke(c);

    }
}
