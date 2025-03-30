package chapter8.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        System.out.println("Making tea...");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("Making coffee...");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
