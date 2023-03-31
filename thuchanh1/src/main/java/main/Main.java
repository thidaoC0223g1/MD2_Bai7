package main;

import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import christ.Christ;
import fruits.Fruit;
import fruits.Orange;
import fruits.Apple;


public class Main {
    public static void main(String[] args) {
        Animal[] dv1 = new Animal[2];
        dv1[0] = new Tiger();
        dv1[1] = new Chicken();
        for (Animal dv : dv1) {
            System.out.println(dv.makeSound());
            if (dv instanceof Chicken) {
                Christ christ = (Chicken) dv;
                System.out.println(christ.howToEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit y : fruits) {
            System.out.println(y.howToEat());
        }
    }
}
