package chapter5.singleton.classic;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // The static instance variable
    private static ChocolateBoiler uniqueInstance;

    // Private constructor to prevent initialization
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Public method to provide access to the singleton instance
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler with chocolate and milk
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            // Boil the chocolate and milk
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Drain the boiled chocolate
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
