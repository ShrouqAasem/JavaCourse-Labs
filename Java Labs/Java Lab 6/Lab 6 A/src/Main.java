import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        MyPanel panel = new MyPanel();
        MarqueeString marquee = new MarqueeString("Hello JAVA");
        BouncingBall ball = new BouncingBall();

        //frame.setContentPane(panel);
        //frame.setContentPane(marquee);
        frame.setContentPane(ball);


        frame.setTitle("Lab 6 Tasks");
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}