package chapter5.singleton.threadSafe.eager;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are same");
        }
    }
}
