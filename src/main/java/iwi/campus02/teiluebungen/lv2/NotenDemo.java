package iwi.campus02.teiluebungen.lv2;

public class NotenDemo {

    public static void main(String[] args) {
        int punkte = -1;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
        punkte = 102;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
        punkte = 90;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
        punkte = 89;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
        punkte = 77;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
        punkte = 51;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
        punkte = 50;
        System.out.println("Punkte: " + punkte + "/100, Note: " + getNotentext(punkte));
    }

    public static String getNotentext(int punkte){
        if ((punkte < 0) || (punkte > 100))
            return "Ungültige Punktzahl";
        else if (punkte >= 90)
            return "Sehr Gut";
        else if (punkte >= 78)
            return "Gut";
        else if (punkte >= 65)
            return "Befriedigend";
        else if (punkte >= 51)
            return "Genügend";
        else
            return "Ungenügend";
    }

}
