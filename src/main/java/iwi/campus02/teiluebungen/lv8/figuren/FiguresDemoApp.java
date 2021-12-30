package iwi.campus02.teiluebungen.lv8.figuren;

public class FiguresDemoApp {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle(200, 15);
        Rectangle r3 = new Rectangle(1000, 150);

        Circle c1 = new Circle(15);
        Circle c2 = new Circle(150);
        Circle c3 = new Circle(1200);

        System.out.println("");
        System.out.println("<<< Area >>>");
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r3.getArea());
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());

        System.out.println("");
        System.out.println("<<< Perimeter >>>");
        System.out.println(r1.getPerimeter());
        System.out.println(r2.getPerimeter());
        System.out.println(r3.getPerimeter());
        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());
        System.out.println(c3.getPerimeter());

        FigureManager figures = new FigureManager();
        figures.add(r1);
        figures.add(r2);
        figures.add(r3);
        figures.add(c1);
        figures.add(c2);
        figures.add(c3);

        System.out.println("");
        System.out.println("<<< Figure Manager >>>");
        System.out.println(figures.getMaxPerimeter());
        System.out.println(figures.getAverageSize());
        System.out.println(figures.getAreaBySizeCategories());
    }

}
