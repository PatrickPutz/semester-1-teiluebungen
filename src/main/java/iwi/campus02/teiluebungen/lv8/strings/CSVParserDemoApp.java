package iwi.campus02.teiluebungen.lv8.strings;

public class CSVParserDemoApp {

    public static void main(String[] args) {

        CSVParser p1 = new CSVParser("spalte1,spalte2,spalte3");

        System.out.println(p1.countComma());
        String[] parsed = p1.parse();
        for (String s : parsed) {
            System.out.println(s);
        }

        System.out.println("");
        CSVParser p2 = new CSVParser("spalte1,spalte2,spalte3,spalte4,spalte5,spalte6,spalte7");
        System.out.println(p2.countComma());
        parsed = p2.parse();
        for (String s : parsed) {
            System.out.println(s);
        }

    }

}
