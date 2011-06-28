package main;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridImage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labels[];
	private Icon icons[];
	
	public GridImage(BufferedImage image, String path, int xAmmount, int yAmmount, ArrayList<Double> averageList) {
		super(path);
		
		setLayout(new GridLayout(yAmmount + 1, xAmmount + 1, 5, 5));
		
		labels = new JLabel[(xAmmount + 1)*(yAmmount + 1)];
		icons = new Icon[(xAmmount + 1)*(yAmmount + 1)];
		
		int count = 0;
		
		int w = image.getWidth();
        int h = image.getHeight();
              
        int quantX = xAmmount + 1;
        int quantY = yAmmount + 1;
        
        int aux_x = w / quantX;
        int aux_y = h / quantY;
        
        int w_f = 800 / quantX;
        int h_f = 600 / quantY;
        
        int for_init1 = 0;
        int for_init2 = 0;
        
        for (int i = 0; i < quantY; i++) {
        	for (int j = 0; j < quantX; j++) {
        		for_init1 = i * aux_y;
        		for_init2 = j * aux_x;
        		
        		icons[count] = new ImageIcon(image.getSubimage(for_init2, for_init1, aux_x, aux_y).getScaledInstance(w_f, h_f, Image.SCALE_FAST));
        		labels[count] = new JLabel(icons[count]);
        		DecimalFormat frmt = new DecimalFormat("0.0000");
        		labels[count].setToolTipText( "Quad. " + (count + 1) + ": " + frmt.format(averageList.get(count))+ "%" );
        		
        		add(labels[count]);
        		
        		count++;
        	}
        }
	}
}
