package chapter5.singleton.enums;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.UNIQUE_INSTANCE;
        Singleton singleton2 = Singleton.UNIQUE_INSTANCE;

        if (singleton1 == singleton2) {
            System.out.println("Both instances are same");
        }

        singleton1.getDescription();  // Outputs: Hello from Singleton Enum!
    }
}
