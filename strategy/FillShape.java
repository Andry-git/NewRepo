
package strategy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.RectangularShape;

public class FillShape implements ColorBehavoir {
    private Color color;
    public FillShape(){}
    public FillShape(Color c){
        color = c;
    }
    
    public void setColor(Color c){
        color = c;
    }

    @Override
    public void draw(Graphics2D g2,RectangularShape shape) {
        Paint paint = g2.getPaint();
        g2.setPaint(color);
        g2.fill(shape);
        g2.setPaint(paint);
    }
    
    @Override
    public FillShape clone(){
        return new FillShape(color);  } }