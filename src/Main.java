import Clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лёва", 150, LocalDate.now(), new Owner());
        System.out.println(leva); // Вывели всю информацию о этом животном
        leva.fly();
        leva.swim();
        leva.toGo();
//        Lion puzo = new Lion("Симба", 250, LocalDate.now(), new Owner());
        Dog mailo = new Dog("Шарик", 40,LocalDate.now(), new Owner());
        System.out.println(mailo); // Вывели всю информацию о этом животном (собаке)
        mailo.fly();
        mailo.toGo();
        mailo.swim();
//        System.out.println(leva.getName()); // просмотрели имя данного животного (Лёва)
//        leva.setWeight(175); // изменили вес данного животного (льва Лёва)
//        System.out.println(leva);
//        System.out.println(puzo);
//        System.out.println(puzo.getType()); // Вывели тип к которому относится данно животное(Lion)
//        System.out.println(mailo.getType()); // Вывели тип к которому относится данно животное(Dog)
//        Lion test = new Lion();
//        System.out.println(test);
//        mailo.liveCycle();
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(puzo);
//        animals.add(mailo);
//        animals.add(leva);
//        System.out.println(animals);

        PolarBear cold = new PolarBear("Снежок", 450, LocalDate.now(), new Owner());
        System.out.println(cold);
        cold.toGo();
        cold.swim();
        cold.fly();
        Shark darkShark = new Shark("Чернышь", 400, LocalDate.now(), new Owner());
        System.out.println(darkShark);
        darkShark.swim();
        darkShark.toGo();
        darkShark.fly();
        Crow crow = new Crow ("Карыч", 1, LocalDate.now(), new Owner());
        System.out.println(crow);
        crow.swim();
        crow.toGo();
        crow.fly();
        Fox fox = new Fox("Патрикеевна", 15, LocalDate.now(), new Owner());
        System.out.println(fox);
        fox.fly();
        fox.swim();
        fox.toGo();

    }
}
