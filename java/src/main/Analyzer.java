package main;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Analyzer {
	private PixelARGB pixelARGB;
	
	public Analyzer(BufferedImage image, int xAmmount, int yAmmount) {

		pixelARGB = new PixelARGB(xAmmount, yAmmount);
		pixelARGB.marchThroughImage(image);

	}
	
	public ArrayList<Double> getList() {
    	return pixelARGB.getList();
    }
}
