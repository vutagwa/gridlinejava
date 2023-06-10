import java.awt.*;
import javax.swing.*;

public class lineframe extends JFrame {
    lineframe(){
        this.add(new linepanel());
        this.setTitle("Grid lines");
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
}
