package creational.singleton;

public class AppSingleton {

    public static void main(String[] args) {

        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        firstThread.start();
        secondThread.start();
    }

    static class FirstThread implements Runnable {

        @Override
        public void run() {
            Singleton firstInstance = Singleton.getInstance("First Instance");
            System.out.println(firstInstance.getName());
        }
    }

    static class SecondThread implements Runnable {

        @Override
        public void run() {
            Singleton secondInstance = Singleton.getInstance("Second Instance");
            System.out.println(secondInstance.getName());
        }
    }
}
