package chapter5.singleton.threadSafe.eager;

public class Singleton {
    // Create the instance eagerly
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
