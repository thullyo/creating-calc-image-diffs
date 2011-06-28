package main;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String path = "C:/Documents and Settings/thullyo.ferreira/Meus documentos/workspace/creating-calc-image-diffs/prototipo/";
        String nameStandard = "sample.jpg";
        String name = "sampleComper.jpg";
        
        int xAmm = 1;
        int yAmm = 1;
        
        try {
            BufferedImage image = ImageIO.read(new File(path + name));
            
            Analyzer pictAnalyzer = new Analyzer(image, xAmm, yAmm);
            
            BufferedImage imageStandard = ImageIO.read(new File(path + nameStandard));
            
            Analyzer pictAnalyzerStandard = new Analyzer(imageStandard, xAmm, yAmm);
            
            for (int i = 0; i < pictAnalyzer.getList().size(); i++)
            	System.out.println("valor: " + pictAnalyzer.getList().get(i));
            
            GridImage labelFrame = new GridImage(image, name, xAmm, yAmm, pictAnalyzer.getList());
            labelFrame.setSize(800, 600);                        
            labelFrame.setVisible(true);
            
            GridImageGood labelFrameGood = new GridImageGood(name, xAmm, yAmm, pictAnalyzer.getList(), pictAnalyzerStandard.getList());
            labelFrameGood.setSize(800, 600);                        
            labelFrameGood.setVisible(true);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
	}

}
