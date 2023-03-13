import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Collection FrameWork");
        ArrayList<String> Books = new ArrayList<>();
        Books.add("B1");
        Books.add("B2");
        Books.add("B3");
        Books.add("B4");
        System.out.println("Books = " + Books);
        System.out.println("Books.get(3) = " + Books.get(3));
        Books.remove("B3");
        System.out.println("Books = " + Books);
        System.out.println("Books.size() = " + Books.size());
        Books.set(1,"B9");
        System.out.println("Books = " + Books);

    }
}