import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Pint-pong");
        frame.setSize(500,500);

        GamePanel gamePanel = new GamePanel(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.setVisible(true);



        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);

                gamePanel.keyPressed(e);
                System.out.println(e.getKeyChar());
            }
        });

    }
}