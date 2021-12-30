package iwi.campus02.teiluebungen.lv8.strings;

public class UpperCaseConverter {

    public static void main(String[] args) {

        String text = "Wörter starten mit Großbuchstaben";

        System.out.println(text);
        System.out.println(convertToUpperCase(text));


    }

    public static String convertToUpperCase(String text){
        String result = "";

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            if(i == 0 || text.charAt(i - 1) == ' '){
                c = Character.toUpperCase(c);
            }

            result += c;
        }

        return result;
    }
}
