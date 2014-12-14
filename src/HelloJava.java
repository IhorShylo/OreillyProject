import javax.swing.*;

public class HelloJava {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Igor the best!!!");
        frame.add(new HelloComponent());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
