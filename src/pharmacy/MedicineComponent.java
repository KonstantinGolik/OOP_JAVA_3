package pharmacy;
public abstract class MedicineComponent implements Comparable<MedicineComponent> {
    private String name;
    private float weight;
    private int power;

    public MedicineComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    @Override
    public int compareTo(MedicineComponent o) {
//     return name.compareTo(o.name);                  // сравнение по имени(строки)
       return power - o.power;                         // 3 вар

//     return Integer.compare(this.power, o.power);    // 2 вар
//
//        if (this.power > o.power) {                  // 1 вар
//            return 1;
//        } else if (this.power < o.power) {
//            return -1;
//        } else return 0;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "MedicineComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}
