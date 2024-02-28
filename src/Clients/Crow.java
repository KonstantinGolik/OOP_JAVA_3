package Clients;

import java.time.LocalDate;
public class Crow extends Animal{
    public Crow (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public void swim() {
        System.out.println(getType() + " Can't Swim");
    }
}
