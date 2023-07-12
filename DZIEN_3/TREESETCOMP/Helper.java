import java.util.Comparator;

public class Helper implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        String firstStr;
        String secondStr;
        firstStr = str1;
        secondStr = str2;
        return secondStr.compareTo(firstStr);
    }
}
