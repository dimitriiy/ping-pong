import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {
    private JFrame frame;
    Timer timer = new Timer(20, this);
    Panel leftPanel = new Panel("left");
    Panel rightPanel = new Panel("right");
    LineField lineField = new LineField();

    Ball ball;

    public GamePanel(JFrame frame) {
        this.frame = frame;
        this.setBackground(Color.BLACK);
        this.setSize(frame.getWidth(), frame.getHeight());
        this.ball = new Ball();
        timer.start();
    }


    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();

        leftPanel.keyPress(key);
        rightPanel.keyPress(key);

        System.out.println(key);

    }



    public void move() {
        ball.move();

        Dimension dimension = getSize();

        double[][] coordinates = ball.getCoords();

        if (Utils.isCollision(ball.getCoords(), leftPanel.getCoords()) || Utils.isCollision(ball.getCoords(), rightPanel.getCoords())) {
            ball.dx *= -1;
        }

        if (coordinates[1][0] >= dimension.width || coordinates[0][0] <= 0) {
            ball.dx *= -1;
        }

        if (coordinates[3][1] >= dimension.height || coordinates[0][1] <= 0) {
            ball.dy *= -1;
        }

    }

    ;

    @Override
    public void paint(Graphics g) {
        Dimension dimension = this.getSize();
        move();

        lineField.paint(g);
        ball.paint(g);
        leftPanel.paint(g);
        rightPanel.paint(g);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }
}
