package main;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridImageGood extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labels[];
	private Icon icons[];
	
	public GridImageGood(String path, int xAmmount, int yAmmount, ArrayList<Double> averageList, ArrayList<Double> averageListStandard) {
		super(path);
		
		setLayout(new GridLayout(yAmmount + 1, xAmmount + 1, 5, 5));
		
		String pathGood = "C:/Documents and Settings/thullyo.ferreira/Meus documentos/workspace/creating-calc-image-diffs/prototipo/good.jpg";
		String pathNoGood = "C:/Documents and Settings/thullyo.ferreira/Meus documentos/workspace/creating-calc-image-diffs/prototipo/nogood.jpg";
		
		try {
            BufferedImage imagegood = ImageIO.read(new File(pathGood));
            BufferedImage imagenogood = ImageIO.read(new File(pathNoGood));
            
            labels = new JLabel[(xAmmount + 1)*(yAmmount + 1)];
    		icons = new Icon[(xAmmount + 1)*(yAmmount + 1)];
    		
    		int count = 0;
                  
            int quantX = xAmmount + 1;
            int quantY = yAmmount + 1;
            
            int w_f = 800 / quantX;
            int h_f = 600 / quantY;
            
            for (int i = 0; i < quantY; i++) {
            	for (int j = 0; j < quantX; j++) {
            		
            		if (averageList.get(count) <= averageListStandard.get(count))
            			icons[count] = new ImageIcon(imagegood.getScaledInstance(w_f, h_f, Image.SCALE_FAST));
            		else
            			icons[count] = new ImageIcon(imagenogood.getScaledInstance(w_f, h_f, Image.SCALE_FAST));
            		labels[count] = new JLabel(icons[count]);
            		DecimalFormat frmt = new DecimalFormat("0.0000");
            		labels[count].setToolTipText( "Quad. " + (count + 1) + ": " + frmt.format(averageList.get(count))+ "%" );
            		
            		add(labels[count]);
            		
            		count++;
            	}
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }		
	}
}
