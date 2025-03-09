package chapter5.singleton.enums;

/**
 * Limitations:
 * No inheritance (you can't extend other classes).
 * Limited ability to implement multiple interfaces (though you can implement one).
 * Cannot be instantiated more than once (which could be a downside for certain use cases).
 * May not fit well with complex initialization logic or re-initialization needs.
 * Serialization handling may be too restrictive in certain advanced cases.
 */
public enum Singleton {
    UNIQUE_INSTANCE;

    public void getDescription() {
        System.out.println("I'm a thread safe Singleton!");
    }
}

