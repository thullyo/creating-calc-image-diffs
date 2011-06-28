package main;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author thullyo.ferreira
 */
public class PixelARGB {
	private int _xAmmount, _yAmmount;
	private ArrayList<Double> brightnessList = new ArrayList<Double>();
	
	public PixelARGB(int xAmmount, int yAmmount) {
		_xAmmount = xAmmount;
		_yAmmount = yAmmount;
	}
    
    private double printPixelARGB(int pixel) {
        //int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;
        
        double sum = 0;
        
        sum = red + green + blue;
        
        return (sum / 3);
    }
    
    public void marchThroughImage(BufferedImage image) {
        int w = image.getWidth();
        int h = image.getHeight();
        
        int count = 0, countTotal = 0;
        double average = 0, averageTotal = 0;
        
        int quantX = _xAmmount + 1;
        int quantY = _yAmmount + 1;
        
        int aux_x = w / quantX;
        int aux_y = h / quantY;
        
        int for_init1 = 0, for_end1 = 0;
        int for_init2 = 0, for_end2 = 0;
        
        for (int i = 0; i < quantY; i++) {
        	for (int j = 0; j < quantX; j++) {
        		count = 0;
        		average = 0;
        		for_init1 = i * aux_y;
        		for_init2 = j * aux_x;
        		for_end1 = for_init1 + aux_y;
        		for_end2 = for_init2 + aux_x;
        		
        		for (int y = for_init1; y < for_end1; y++) {
        			for (int x = for_init2; x < for_end2; x++) {
        	            int pixel = image.getRGB(x, y);
        	            
        	            average += printPixelARGB(pixel);
        	            count++;
        	          }
        	        }
        		averageTotal += average;
        		countTotal += count;
        		brightnessList.add(((average / count)/255)*100);
        	}
        }
        if ( (_xAmmount + _yAmmount) != 0 )
        	brightnessList.add(((averageTotal / countTotal)/255)*100);
    }
    
    public ArrayList<Double> getList() {
    	return brightnessList;
    }
}
