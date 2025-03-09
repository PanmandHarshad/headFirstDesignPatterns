package chapter5.singleton.threadSafe.doubleChecked;

public class Singleton {
    // The volatile keyword ensures that the instance is visible across different threads.
    private static volatile Singleton uniqueInstance;

    private Singleton() {

    }

    // The double-checked locking pattern ensures that the synchronization is done
    // only the first time the instance is created, improving performance.
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
