package DecoratorDesignPattern;

public class ProshutoPizza extends ToppingDecorator{

    public ProshutoPizza(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Proshuto");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Proshuto";
    }

    public double getCost(){
        return tempPizza.getCost() + 1.00;
    }






}
