import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by User on 11.12.2014.
 */
public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ihor the best 2");
        HelloComponent2 newobj = new HelloComponent2("EEE");
        frame.add(newobj);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
class HelloComponent2 extends JComponent
implements MouseMotionListener {
    String theMessage;
    int messageX = 125, messageY = 95; //Координаты сообщения
    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }
    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY);
    }
    public void mouseDragged(MouseEvent e){
        //Сохранить координаты мыши и нарисовать сообщение.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e){

    }
}
