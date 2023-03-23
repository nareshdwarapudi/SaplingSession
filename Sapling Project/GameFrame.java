import javax.swing.*;
import java.awt.*;
public class GameFrame {
    JFrame frame;
    GameFrame()
    {
        frame=new JFrame("Pong Game");
        frame.setLayout(null);
        //Creating panel
        Table table=new Table();
        table.setBounds(100,100,800,200);
        table.setBackground(Color.black);
        //Adding the table to my Frame
        frame.add(table);

        frame.setBounds(200,200,1000,555);
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
