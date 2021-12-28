package iwi.campus02.teiluebungen.lv5_midterm.schleifenundarrays;

public class LottoZahlenApp {

    public static void main(String[] args) {

        int[] generated = generateRandomNumbers(6, 45);

        for(int i = 0; i < generated.length; i++){
            System.out.println(i + ": " + generated[i]);
        }

    }

    public static int[] generateRandomNumbers(int size, int maxNumber){
        int[] result = new int[size];

        for(int i = 0; i < size; i++){
            result[i] = (int) (Math.random() * maxNumber + 1);
        }

        return result;
    }
}
