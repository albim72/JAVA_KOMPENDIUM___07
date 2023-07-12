import java.util.TreeSet;

class Main{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("G");
        treeSet.add("H");
        treeSet.add("M");
        treeSet.add("22");
        treeSet.add("???");
        treeSet.add("NI");
        treeSet.add("-X-");
        System.out.println("Zbiór przed użyciem komparatora: " + treeSet);


        TreeSet<String> treeSet1 = new TreeSet<>(new Helper());
        treeSet1.add("G");
        treeSet1.add("H");
        treeSet1.add("M");
        treeSet1.add("22");
        treeSet1.add("???");
        treeSet1.add("NI");
        treeSet1.add("-X-");
        System.out.println("Zbiór przed użyciem komparatora: " + treeSet1);
    }
}
