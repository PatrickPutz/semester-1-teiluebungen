package iwi.campus02.teiluebungen.lv8.strings;

public class CSVParser {

    private String csvline;

    public CSVParser(String csvline) {
        this.csvline = csvline;
    }

    public int countComma(){
        int counter = 0;

        for(int i = 0; i < csvline.length(); i++){
            if(csvline.charAt(i) == ','){
                counter++;
            }
        }

        return counter;
    }

    public String[] parse(){
        String[] result = new String[countComma() + 1];
        String text = "";
        int count = 0;

        for(int i = 0; i < csvline.length(); i++){
            if(csvline.charAt(i) != ','){
                char c = csvline.charAt(i);
                text += c;
            }
            else{
                result[count] = text;
                count++;
                text = "";
            }
        }
        result[countComma()] = text;

        return result;
    }
}
