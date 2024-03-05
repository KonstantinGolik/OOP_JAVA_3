package pharmacy;

import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinium;
import pharmacy.impl.Vetbicid;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 70);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);

//        for (MedicineComponent companent : medicine1) {
//
////        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (med.hasNext()) {
//            System.out.println(med.next());
//        }
//        for (MedicineComponent component : medicine1 ){
//            System.out.println(component);
//        }
        medList.add(asitr);
        medList.add(penicilinium);
        medList.add(vetbic);
        System.out.println(medList);
        Collections.sort(medList);
        System.out.println(medList);
        Collections.sort(medList, Comparator.reverseOrder());  // для сортировки в обратном порядке
        System.out.println(medList);
        Collections.sort(medList, (comp1, comp2) -> (int)(comp1.getWeight() - comp2.getWeight())); // через лямнду
        System.out.println(medList);
    }

}