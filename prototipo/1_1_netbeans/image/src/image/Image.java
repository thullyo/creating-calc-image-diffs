/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

/**
 *
 * @author thullyo.ferreira
 */

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image extends Component {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PixelARGB pixelARGB = new PixelARGB();
        
        String path = "C:/Documents and Settings/thullyo.ferreira/Meus documentos/NetBeansProjects/image/src/jpeg/";
        //String name = "sample.jpg";
        String name = "sampleComper.jpg";
        
        try {
            BufferedImage image = ImageIO.read(new File(path + name));
            
            pixelARGB.marchThroughImage(image);
            
            System.out.println("Imagem " + name + " =>");
            pixelARGB.getQuadr().printRate();
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
