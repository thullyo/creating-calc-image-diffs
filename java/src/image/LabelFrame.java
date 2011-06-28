/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.BasicStroke;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.geom.Line2D;

/**
 *
 * @author thullyo.ferreira
 */
public class LabelFrame extends JFrame {
    
    private JLabel lbl1;
    private Icon img;
    private GridJPanel gjp;
    
    public LabelFrame(String path, String imgName) {
        super(imgName);
        //setLayout(new FlowLayout());
        try {
            BufferedImage image = ImageIO.read(new File(path));
        
        
            //img = new ImageIcon(path);
            img = new ImageIcon(image.getScaledInstance(800, 600, image.SCALE_DEFAULT));

            lbl1 = new JLabel(img);
            lbl1.setToolTipText("This is the image choosen");
            
            //gjp = new GridJPanel(path);
            
            //add(gjp);

            add(lbl1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
