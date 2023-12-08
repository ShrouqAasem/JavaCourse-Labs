import javax.swing.*;
import java.awt.*;

public class BouncingBall extends JPanel implements Runnable {

    private int dimensionX;
    private int dimensionY;
    private int ballDiameter;
    private int dx ;
    private int dy ;

    public BouncingBall(){
        this.setBackground(Color.cyan);
        this.dimensionX=0;
        this.dimensionY =0;
        this.ballDiameter = 40;
        this.dx = 10;
        this.dy = 10;
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(dimensionX,dimensionY,ballDiameter,ballDiameter);
    }

    @Override
    public void run() {
        while(true){
            this.repaint();
            dimensionX = dimensionX + dx;
            dimensionY = dimensionY + dy;
            if(dimensionX < 0){
                dimensionX = 0;
                dx = -dx;
            }
            if(dimensionX + ballDiameter >= this.getWidth()){
                dimensionX = this.getWidth() - ballDiameter;
                dx= -dx;
            }
            if(dimensionY < 0){
                dimensionY = 0;
                dy = -dy;
            }
            if(dimensionY + ballDiameter >= this.getHeight()){
                dimensionY = this.getHeight() - ballDiameter;
                dy = -dy;
            }
            try{
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
