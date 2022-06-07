import javax.swing.*;
import java.awt.*;

public class LineField extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawLine(250 - 1,0,250 - 1,500);
    }
}
