
package grafic;

import javax.swing.JFrame;


class MyFrame extends JFrame{
MyFrame(){
    MyPanel panel =new MyPanel();
    add(panel);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500, 500);
    setVisible(true);
}

}