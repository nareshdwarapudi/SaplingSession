import javax.swing.*;
import java.awt.*;

public class Table extends JPanel {

    int x=0;
    int y=0;
    int speedx=2;

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.white);
        g.fillOval(0,0,100,100);

        if (x<0){
            speedx=speedx;
        }else if(x>800)
        {
            speedx=speedx;
        }
        x+=speedx;
        repaint();
    }

}
