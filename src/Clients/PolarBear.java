package Clients;

import java.time.LocalDate;

public class PolarBear extends Animal {
    public PolarBear(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public void fly() {
        System.out.println(getType() + " Can't Fly");
    }
}
