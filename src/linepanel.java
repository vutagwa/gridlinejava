import java.awt.*;
import javax.swing.*;

public class linepanel extends JPanel {
    static final int SCREENHEIGHT = 450, SCREENWIDTH=450, GRIDSIZE=30;
    linepanel(){
        this.setPreferredSize(new Dimension(SCREENHEIGHT, SCREENWIDTH));
        this.setBackground(Color.blue);
        this.setFocusable(true);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        for(int i=0;i<SCREENHEIGHT/GRIDSIZE;i++){
            g.drawLine(i*GRIDSIZE, 0, i*GRIDSIZE, SCREENHEIGHT);
            g.drawLine(0, i*GRIDSIZE, SCREENWIDTH, i*GRIDSIZE);
        }
    }
}
