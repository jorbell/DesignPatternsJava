package structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle{
    private Color color;

    public Rectangle (Color color){
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY){
        g.setColor(color);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }

}
