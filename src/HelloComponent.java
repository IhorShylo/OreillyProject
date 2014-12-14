import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 10.12.2014.
 */
public class HelloComponent extends JComponent {
    public void paintComponent (Graphics g){
        g.drawString("U are the most beautiful guy, I've ever seen!", 30, 95);
    }
}
