package iwi.campus02.teiluebungen.lv8.figuren;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * radius * 3.141);
    }

    @Override
    public double getArea() {
        return (radius * radius * 3.141);
    }
}
