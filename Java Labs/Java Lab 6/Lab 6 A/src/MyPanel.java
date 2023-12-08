import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MyPanel extends JPanel implements Runnable {
    public MyPanel() {
        this.setBackground(Color.cyan);
        new Thread(this).start();
    }

    @Override
    public void run() {
            while (true){
                this.repaint();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toString() , 100,150);
    }
}
