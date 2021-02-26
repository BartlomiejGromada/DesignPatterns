package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AppAdapter {

    public static void main(String[] args) {
        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Cat());
        mammals.add(new HumanToMammalAdapter(new Programmer()));

        mammals.forEach(Mammal::printInfo);
    }
}