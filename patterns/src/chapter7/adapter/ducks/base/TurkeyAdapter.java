package chapter7.adapter.ducks.base;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble(); // Convert gobble() to quack()
    }

    @Override
    public void fly() {
        // Turkeys fly in short bursts, so we make it fly multiple times
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
