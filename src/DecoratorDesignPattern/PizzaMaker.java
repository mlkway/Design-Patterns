package DecoratorDesignPattern;

public class PizzaMaker {
    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        Pizza proshutoPizza = new ProshutoPizza(new PlainPizza());



        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Ingredients: " + proshutoPizza.getDescription());
        System.out.println("Price " + basicPizza.getCost());
        System.out.println("Price " + proshutoPizza.getCost());


    }
}
