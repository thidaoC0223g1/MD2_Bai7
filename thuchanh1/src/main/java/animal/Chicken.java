package animal;

import christ.Christ;

public class Chicken extends Animal implements Christ {
    @Override
    public String makeSound(){
        return "Chicken: cuc cuc cuc ";
    }
    @Override
   public String howToEat(){
        return " boil is best";
    }
}
