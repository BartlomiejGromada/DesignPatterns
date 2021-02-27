package behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class AppIterator {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Giraffe");

        StringIterator stringIterator = new StringIterator();
        stringIterator.setList(stringList);

        print(stringIterator);

        System.out.println("Again print without reset... Empty");
        print(stringIterator);

        System.out.println("\nAgain print with reset...");
        stringIterator.reset();
        print(stringIterator);
        
    }

    private static void print(StringIterator stringIterator) {
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
