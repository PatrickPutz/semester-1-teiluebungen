package iwi.campus02.teiluebungen.lv2;

public class TurmDemo {

    public static void main(String[] args) {

        turmRechnen(2);
        turmRechnen(3);
        turmRechnen(15);
        turmRechnen(-4);

    }

    public static void turmRechnen(int number){
        int count = 2;
        while(count < 10){
            System.out.println(number + " * " + count + " = " + (number * count));
            number = number * count;
            count++;
        }
        count--;
        while(count > 1){
            System.out.println(number + " / " + count + " = " + (number / count));
            number = number / count;
            count--;
        }
    }

}
