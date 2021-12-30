package iwi.campus02.teiluebungen.lv8.figuren;

import iwi.campus02.teiluebungen.lv8.figuren.Figure;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public double getArea() {
        return (length * width);
    }
}
