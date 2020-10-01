
package strategy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.RectangularShape;

public class NoFillShape {
    private Paint color;

    public NoFillShape(Color GREEN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void draw(Graphics2D g2, RectangularShape shape) {
        Paint paint = g2.getPaint();
        g2.setPaint(color);
        g2.draw(shape);
        g2.setPaint(paint);
    }
}
