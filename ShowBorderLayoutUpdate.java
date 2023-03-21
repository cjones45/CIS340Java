package GUI;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class ShowBorderLayout extends JFrame {
  public ShowBorderLayout() {
    // Set BorderLayout with horizontal gap 5 and vertical gap 10
    setLayout(new BorderLayout(5, 10));

    // Add buttons to the frame
    JButton jbt = new JButton("East");
    jbt.setBackground(Color.YELLOW);
    add(jbt, BorderLayout.EAST);
    JButton jbt2 = new JButton("West");
    jbt2.setBackground(Color.BLUE);
    add(jbt2, BorderLayout.WEST);
    JButton jbt3 = new JButton("South");
    jbt3.setBackground(Color.GREEN);
    add(jbt3, BorderLayout.SOUTH);
    //add(new JButton("South"), BorderLayout.SOUTH);
   // add(new JButton("West"), BorderLayout.WEST);
    Font newfont = new Font("Comic Sans MS", Font.BOLD,20);
    jbt2.setFont(newfont);
   
    //add(new JButton("North"), BorderLayout.NORTH);
   // add(new JButton("Center"), BorderLayout.CENTER);
    JButton jbtcenter = new JButton("Center");
    jbtcenter.setFont(newfont);
    jbtcenter.setBackground(c);
    add(jbtcenter, BorderLayout.CENTER);
    
    JButton jbtnorth = new JButton("North");
    jbtnorth.setFont(newfont);
    jbtnorth.setBackground(c);
    add(jbtnorth, BorderLayout.NORTH);
  }
  Color c = new Color(161, 52, 235);

  /** Main method */
  public static void main(String[] args) {
    ShowBorderLayout frame = new ShowBorderLayout();
    frame.setTitle("ShowBorderLayout");
    frame.pack();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
