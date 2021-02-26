package structural.adapter;

public class Programmer implements Human{
    @Override
    public void saySomething() {
        System.out.println("I'm programmer. Nice to meet you.");
    }
}