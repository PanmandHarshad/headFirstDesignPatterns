package chapter7.adapter.ducks.base;

import chapter7.adapter.ducks.base.impl.MallardDuck;
import chapter7.adapter.ducks.base.impl.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
