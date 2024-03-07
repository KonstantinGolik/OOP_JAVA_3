package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private String name;
    private List<MedicineComponent> components;
    private int index;

    public Medicine(String name){
        this.name = name;
        this.components = new ArrayList<>();
        this.index = 0;

    }
    public Medicine addComponent(MedicineComponent component){
        components.add(component);
        return this;
    }
    @Override
    public boolean hasNext() {
// return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
// return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Препарат " + name;
    }

    @Override
    public int compareTo(Medicine o) {
        return components.size() - o.components.size();
//        return name.compareTo(o.name);
    }
}