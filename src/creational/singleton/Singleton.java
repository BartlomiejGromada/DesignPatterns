package creational.singleton;

public final class Singleton {

    private static volatile Singleton instance;
    private String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        Singleton result = instance;

        if (result != null)
            return result;

        synchronized (Singleton.class) {
            if (instance == null)
                instance = new Singleton(name);

            return instance;
        }
    }

    public String getName() {
        return name;
    }
}
