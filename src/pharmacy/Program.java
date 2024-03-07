package pharmacy;

import pharmacy.impl.*;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 500, 70);
        Penicilinium penicilinium = new Penicilinium("Penicil", 300, 50);
        Vetbicin vetbicin = new Vetbicin("Vetbicin", 400, 30);
        Amoksicilline amoksicilline = new Amoksicilline("Amoksicilline", 700, 30);
        Alcohol alcohol = new Alcohol(" Alcohol", 400, 80);
//
//        Medicine medicine1 = new Medicine("Первый");
//        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbicin);

        Medicine florject = new Medicine("Florject");
        florject.addComponent(penicilinium).addComponent(alcohol).addComponent(asitr);
        System.out.println(florject);
        Medicine ketoprofen = new Medicine("Ketoprofen");
        System.out.println(ketoprofen);
        ketoprofen.addComponent(alcohol).addComponent(penicilinium).addComponent(asitr).addComponent(amoksicilline);
        Medicine amoksicene = new Medicine("Amoksicene");
        amoksicene.addComponent(penicilinium).addComponent(amoksicilline);
        System.out.println(amoksicene);

        ArrayList<Medicine> med = new ArrayList<>();
        med.add(ketoprofen);
        med.add(amoksicene);
        med.add(florject);
        System.out.println(med);
        Collections.sort(med);
        System.out.println(med);



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
//        medList.add(asitr);
//        medList.add(penicilinium);
//        medList.add(vetbicin);
//        System.out.println(medList);
//        Collections.sort(medList);
//        System.out.println(medList);
//        Collections.sort(medList, Comparator.reverseOrder());  // для сортировки в обратном порядке
//        System.out.println(medList);
//        Collections.sort(medList, (comp1, comp2) -> (int)(comp1.getWeight() - comp2.getWeight())); // через лямнду
//        System.out.println(medList);
    }

}