/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.JApplet;

/**
 *
 * @author thullyo.ferreira
 */
public class ImageApplet extends JApplet {
    private Image img;
    
    public void init() {
        try {
            URL test = new URL("file:///C:/Documents%20and%20Settings/thullyo.ferreira/Meus%20documentos/NetBeansProjects/image/src/image/sample.jpg");
            img = getImage(test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
