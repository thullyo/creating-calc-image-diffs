/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.image.BufferedImage;

/**
 *
 * @author thullyo.ferreira
 */
public class PixelARGB {
    private ColorsQuad quadr = new ColorsQuad();
    
    private Color printPixelARGB(int pixel) {
        int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
        
        Color color = new Color();
        
        color.setR(red);
        color.setG(green);
        color.setB(blue);
        
        return color;
    }
    
    public String marchThroughImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        String strReturn = "";
        strReturn = "width, height: " + w + ", " + h + "\n";
        
        Colors quad1 = new Colors();
        Colors quad2 = new Colors();
        Colors quad3 = new Colors();
        Colors quad4 = new Colors();
        
        int aux = w/2;
        int aux1 = h/2;

        for (int y = 0; y < h; y++) {
          for (int x = 0; x < w; x++) {
            int pixel = image.getRGB(x, y);
            
            Color color = new Color();
            
            color = printPixelARGB(pixel);            
            
            if(x<aux && y<aux1){
                //quad 1
                quad1.setColor(color);
            } else if(x>=aux && y<aux1) {
                //quad 2
                quad2.setColor(color);
            } else if(x<aux && y>=aux1) {
                //quad 3
                quad3.setColor(color);
            } else {
                //quad 4
                quad4.setColor(color);
            }
          }
        }
        
        this.quadr.setQuad1(quad1);
        this.quadr.setQuad2(quad2);
        this.quadr.setQuad3(quad3);
        this.quadr.setQuad4(quad4);
        
        return strReturn;
    }

    /**
     * @return the quadr
     */
    public ColorsQuad getQuadr() {
        return quadr;
    }
}
