import Pkg1.Circle;
import Pkg1.Rectangle;
import Pkg1.Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());


        ArrayList<Circle>circles = new ArrayList<Circle>();
        circles.add(new Circle());
        circles.add(new Circle());

        Test.drawShapes(rectangles);
        Test.drawShapes(circles);
    }
}