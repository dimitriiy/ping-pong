import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel implements Movable {

    public double dx =1;
    public double dy =1;

    public double velocity = 2;
    public double x;
    public double y;
    public int radius = 10;

    public Ball() {

    }


    public double[][] getCoords(){
        double[] topLeft =  {x,y};
        double[] topRight =  {x + radius,y};
        double[] botRight = {x + radius, y + radius};
        double[] botLeft = {x, y + radius};

        return new double[][]{topLeft,topRight,botRight,botLeft};
    };

    public void move(){
        this.x += this.velocity * this.dx;
        this.y += this.velocity * this.dy;
    };



    @Override
    public void paint(Graphics g) {
        move();
        g.setColor(Color.WHITE);
        g.fillOval((int)x,(int)y,radius,radius);
    }
}
