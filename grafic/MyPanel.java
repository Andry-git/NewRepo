
package grafic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import javax.swing.JButton;
import javax.swing.JPanel;
import strategy.ColorBehavoir;
import strategy.NoFillShape;


class MyPanel extends JPanel{
    MyShape shape=null;
    Point2D []p;
    public MyPanel(){
        r = new Rectangle2D.Double();
        shape = new MyShape();
        p = new Point2D[2];
        this.addMouseListener(new  MouseAdapter() {
           @Override
            public void mousePressed(MouseEvent arg0) {
                p[0]=arg0.getPoint();
 shape = new MyShape(new Rectangle2D.Double(), (ColorBehavoir) new NoFillShape (Color.GREEN));
            }
        });
        JButton rectangleButton = new JButton("прямоугольник");
        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r=new Rectangle2D.Double();
            }
        });
        JButton ellipseButton = new JButton("эллипс");
        ellipseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r=new Ellipse2D.Double();
            }
        });
        add(rectangleButton);
        add(ellipseButton);
        addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent arg0){
                 p[0] = arg0.getPoint();
 shape = new MyShape(new Rectangle2D.Double(), (ColorBehavoir) new NoFillShape (Color.GREEN));
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent arg0) {
                p[1]=arg0.getPoint();
                r.setFrameFromDiagonal(p[0],p[1]);
                shape.setShape(p);
                repaint();
             }
        });
    }
    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        shape.draw(g2);
    }
    RectangularShape r;
    //Point2D []p;
    
}