package Clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public void fly() {
        System.out.println(getType() + " Can't Fly");
    }
}
