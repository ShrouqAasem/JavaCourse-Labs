package Pkg1;

import java.util.ArrayList;

public class Test{
    public static void drawShapes(ArrayList< ? extends Shape>shapes){
        for (Shape shape : shapes){
            shape.draw();
        }
    }
}
