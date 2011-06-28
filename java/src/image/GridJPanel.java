/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author thullyo.ferreira
 */
public class GridJPanel extends JPanel {
    private String _path;
    
    public void GridJPanel(String path) {
        _path = path;
    }
    
    @Override
    protected void paintComponent(Graphics g)     {
        Image img = Toolkit.getDefaultToolkit().getImage(_path);
        
        g.drawImage(img, 0, 0, 800, 600, this);
    }
}
