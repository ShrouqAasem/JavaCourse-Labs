import javax.swing.*;
import java.awt.*;

public class MarqueeString extends JPanel implements Runnable {

    private String text;
    private int dimensionX;
    private int dimensionY;

    public MarqueeString(String text) {
        this.text = text;
        this.setBackground(Color.cyan);
        this.dimensionX = 10;
        this.dimensionY = 150;
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(text,dimensionX,dimensionY);
    }

    @Override
    public void run() {
            while(true){
                this.repaint();
                dimensionX = dimensionX + 20;
                if(dimensionX > this.getWidth()){
                    dimensionX = 0;
                }
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
    }
}
