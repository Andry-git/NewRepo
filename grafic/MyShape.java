
package grafic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import strategy.ColorBehavoir;
import strategy.NoFillShape;


public class MyShape {
    ColorBehavoir colorBehavior;
    RectangularShape shape;
    MyShape(){shape=null;}
    MyShape(RectangularShape shape,ColorBehavoir colorBehavior){
        this.shape = shape;
        this.colorBehavior = colorBehavior;
    }

    MyShape(RectangularShape shape){
        this.shape = shape;
        colorBehavior = (ColorBehavoir) new NoFillShape (Color.BLACK);
    }

    void draw(Graphics2D g2){
        if(shape!=null)
        colorBehavior.draw(g2,shape);
    }

    void setShape(Point2D []p){
        shape.setFrameFromDiagonal(p[0],p[1]);
    }

     void setColorBehavior(ColorBehavoir b){
         colorBehavior = b;
     }
}
