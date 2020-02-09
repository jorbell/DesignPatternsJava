package structural.flyweight;

import java.awt.Color;
import java.util.HashMap;


public class RectangleFactory{
    private static final HashMap<Color,Rectangle> rectsByColor = new HashMap<Color,Rectangle>();
    public static Rectangle getRectangle(Color color){
        Rectangle rect = (Rectangle)rectsByColor.get(color);

        if(rect == null){
            rect = new Rectangle(color);
            rectsByColor.put(color, rect);
        }
        return rect;


    }
    
}
