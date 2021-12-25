package iwi.campus02.teiluebungen.lv2;

public class WinterreifenpflichtDemo {

    public static void main(String[] args) {

        int temperatur = 3;
        boolean rutschigeFahrbahn = false;
        System.out.println(winterreifenText(isWinterreifenPflicht(temperatur, rutschigeFahrbahn)));
        temperatur = 5;
        System.out.println(winterreifenText(isWinterreifenPflicht(temperatur, rutschigeFahrbahn)));
        rutschigeFahrbahn = true;
        System.out.println(winterreifenText(isWinterreifenPflicht(temperatur, rutschigeFahrbahn)));
        temperatur = 11;
        System.out.println(winterreifenText(isWinterreifenPflicht(temperatur, rutschigeFahrbahn)));
        temperatur = 4;
        rutschigeFahrbahn = false;
        System.out.println(winterreifenText(isWinterreifenPflicht(temperatur, rutschigeFahrbahn)));
        temperatur = -1;
        System.out.println(winterreifenText(isWinterreifenPflicht(temperatur, rutschigeFahrbahn)));

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn){
        if(temperatur < 4)
            return true;
        else if (temperatur < 10 && rutschigeFahrbahn == true)
            return true;
        else
            return false;
    }

    public static String winterreifenText(boolean isWinterreifenpflicht){
        if (isWinterreifenpflicht == true)
            return "Bitte Winterreifen verwenden!";
        else
            return "Winterreifen sind nicht erforderlich!";
    }

}
