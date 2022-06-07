import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel  {
    private int width = 10;
    private int height = 60;

    private int velocity = 10;
    private int x = 0;
    private int y = 500 / 2 - height;

    private String place;


    public Panel(String place) {
        this.place = place;

        if (place == "left") {
            this.x = 10;
        }
        if (place == "right") {
            this.x = 470;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }


    public double[][] getCoords(){
        double[] topLeft =  {x,y};
        double[] topRight =  {x + width,y};
        double[] botRight = {x + width, y + height};
        double[] botLeft = {x, y + height};

        return new double[][]{topLeft,topRight,botRight,botLeft};
    };

    public void keyPress(char ch) {

        System.out.println(place);
        if (place == "left") {
            if (ch == 'a') {
                this.y -= velocity;
            }
            if (ch == 'z') {
                this.y += velocity;
            }
        };


        if (place == "right") {
            if (ch == 'k') {
                this.y -= velocity;
            }
            if (ch == 'm') {
                this.y += velocity;
            }
        };


    }


}
