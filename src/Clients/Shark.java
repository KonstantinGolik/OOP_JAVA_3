package Clients;

import java.time.LocalDate;

public class Shark extends Animal {
    public Shark(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " Can't ToGo");
    }
    @Override
    public void fly() {
        System.out.println(getType() + " Can't Fly");
    }
}
