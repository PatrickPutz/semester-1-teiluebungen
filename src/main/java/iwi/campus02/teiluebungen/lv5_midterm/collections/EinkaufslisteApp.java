package iwi.campus02.teiluebungen.lv5_midterm.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class EinkaufslisteApp {

    public static void main(String[] args) {

        ArrayList<Einkauf> einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Milch", 1.79));
        einkaufsliste.add(new Einkauf("Brot", 3.2));
        einkaufsliste.add(new Einkauf("Milch", 1.79));

        System.out.println("Sum(Einkaufsliste) = " + sum(einkaufsliste));

        HashSet<Einkauf> unique = unique(einkaufsliste);
        System.out.println("Unique = " + unique);
        System.out.println("Sum(Unique) = " + sum(unique));

    }

    public static double sum(ArrayList<Einkauf> einkaufsliste){
        double result = 0.0;
        
        for (Einkauf einkauf : einkaufsliste) {
            result += einkauf.getPreis();
        }
        
        return result;
    }

    public static double sum(HashSet<Einkauf> einkaufsliste){
        double result = 0.0;

        for (Einkauf einkauf : einkaufsliste) {
            result += einkauf.getPreis();
        }
        
        return result;
    }

    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufsliste){
        HashSet<Einkauf> result = new HashSet<>();

        result.addAll(einkaufsliste);

        return result;
    }

}
