package iwi.campus02.teiluebungen.lv8.figuren;

import iwi.campus02.teiluebungen.lv8.figuren.Figure;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    private ArrayList<Figure> figures;

    public FigureManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure f){
        figures.add(f);
    }

    public double getMaxPerimeter(){
        double result = 0.0;

        for (Figure figure : figures) {
            if(figure.getPerimeter() > result){
                result = figure.getPerimeter();
            }
        }

        return result;
    }

    public double getAverageSize(){
        double area = 0.0;
        int count = 0;

        for (Figure figure : figures) {
            area += figure.getArea();
            count++;
        }

        return (area / count);
    }

    public HashMap<String, Double> getAreaBySizeCategories(){
        double klein = 0.0;
        double mittel = 0.0;
        double gross = 0.0;

        for (Figure figure : figures) {
            if(figure.getArea() < 1000){
                klein += figure.getArea();
            }
            else if(figure.getArea() < 5000){
                mittel += figure.getArea();
            }
            else{
                gross += figure.getArea();
            }
        }

        HashMap<String, Double> result = new HashMap<>();
        result.put("Klein", klein);
        result.put("Mittel", mittel);
        result.put("Groß", gross);

        return result;
    }

}
