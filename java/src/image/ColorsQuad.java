/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.text.DecimalFormat;

/**
 *
 * @author thullyo.ferreira
 */
public class ColorsQuad {
    private Colors quad1 = new Colors();
    private Colors quad2 = new Colors();
    private Colors quad3 = new Colors();
    private Colors quad4 = new Colors();
    private double rateQuad1 = 0;
    private double rateQuad2 = 0;
    private double rateQuad3 = 0;
    private double rateQuad4 = 0;
    private double rateTotal = 0;

    /**
     * @return the quad1
     */
    public Colors getQuad1() {
        return quad1;
    }

    /**
     * @param quad1 the quad1 to set
     */
    public void setQuad1(Colors quad1) {
        this.quad1 = quad1;
        rateQuad1 = (((this.quad1.getAverage())/255)*100);
        updateRateTotal();
    }

    /**
     * @return the quad2
     */
    public Colors getQuad2() {
        return quad2;
    }

    /**
     * @param quad2 the quad2 to set
     */
    public void setQuad2(Colors quad2) {
        this.quad2 = quad2;
        rateQuad2 = (((this.quad2.getAverage())/255)*100);
        updateRateTotal();
    }

    /**
     * @return the quad3
     */
    public Colors getQuad3() {
        return quad3;
    }

    /**
     * @param quad3 the quad3 to set
     */
    public void setQuad3(Colors quad3) {
        this.quad3 = quad3;
        rateQuad3 = (((this.quad3.getAverage())/255)*100);
        updateRateTotal();
    }

    /**
     * @return the quad4
     */
    public Colors getQuad4() {
        return quad4;
    }

    /**
     * @param quad4 the quad4 to set
     */
    public void setQuad4(Colors quad4) {
        this.quad4 = quad4;
        rateQuad4 = (((this.quad4.getAverage())/255)*100);
        updateRateTotal();
    }
    
    public void printRate() {
        DecimalFormat frmt = new DecimalFormat("0.0000");
        System.out.println("#######################################");
        System.out.println("A taxa do Quad1 é: " + frmt.format(((this.quad1.getAverage())/255)*100).replace(".", ",") + "%");
        System.out.println("A taxa do Quad2 é: " + frmt.format(((this.quad2.getAverage())/255)*100).replace(".", ",") + "%");
        System.out.println("A taxa do Quad3 é: " + frmt.format(((this.quad3.getAverage())/255)*100).replace(".", ",") + "%");
        System.out.println("A taxa do Quad4 é: " + frmt.format(((this.quad4.getAverage())/255)*100).replace(".", ",") + "%");
        System.out.println("#######################################");
        double num = 0, den = 0;
        num = this.quad1.getAmmount() + this.quad2.getAmmount() + this.quad3.getAmmount() + this.quad4.getAmmount();
        den = this.quad1.getCount() + this.quad2.getCount() + this.quad3.getCount() + this.quad4.getCount();
        System.out.println("A taxa Total é: " + frmt.format(((num/den)/255)*100).replace(".", ",") + "%");
        System.out.println("#######################################");
    }
    
    public String stringRateOld() {
        String strRate = "";
        
        DecimalFormat frmt = new DecimalFormat("0.0000");
        strRate = "#######################################\n";
        strRate += "A taxa do Quad1 é: " + frmt.format(((this.quad1.getAverage())/255)*100).replace(".", ",") + "%\n";
        strRate += "A taxa do Quad2 é: " + frmt.format(((this.quad2.getAverage())/255)*100).replace(".", ",") + "%\n";
        strRate += "A taxa do Quad3 é: " + frmt.format(((this.quad3.getAverage())/255)*100).replace(".", ",") + "%\n";
        strRate += "A taxa do Quad4 é: " + frmt.format(((this.quad4.getAverage())/255)*100).replace(".", ",") + "%\n";
        strRate += "#######################################\n";
        double num = 0, den = 0;
        num = this.quad1.getAmmount() + this.quad2.getAmmount() + this.quad3.getAmmount() + this.quad4.getAmmount();
        den = this.quad1.getCount() + this.quad2.getCount() + this.quad3.getCount() + this.quad4.getCount();
        strRate += "A taxa Total é: " + frmt.format(((num/den)/255)*100).replace(".", ",") + "%\n";
        strRate += "#######################################\n\n";
        
        return strRate;
    }
    
    public String stringRate() {
        String strRate = "";
        
        DecimalFormat frmt = new DecimalFormat("0.0000");
        strRate = "#######################################\n";
        strRate += "Rate of Brightness of Quad1: " + frmt.format(rateQuad1).replace(".", ",") + "%\n";
        strRate += "Rate of Brightness of Quad2: " + frmt.format(rateQuad2).replace(".", ",") + "%\n";
        strRate += "Rate of Brightness of Quad3: " + frmt.format(rateQuad3).replace(".", ",") + "%\n";
        strRate += "Rate of Brightness of Quad4: " + frmt.format(rateQuad4).replace(".", ",") + "%\n";
        strRate += "#######################################\n";
        strRate += "Total Rate of Brightness: " + frmt.format(rateTotal).replace(".", ",") + "%\n";
        strRate += "#######################################\n\n";
        
        return strRate;
    }
    
    public void updateRateTotal() {
        double num = 0, den = 0;
        num = this.quad1.getAmmount() + this.quad2.getAmmount() + this.quad3.getAmmount() + this.quad4.getAmmount();
        den = this.quad1.getCount() + this.quad2.getCount() + this.quad3.getCount() + this.quad4.getCount();
        
        rateTotal = ((num/den)/255)*100;
    }

    /**
     * @return the rateQuad1
     */
    public double getRateQuad1() {
        return rateQuad1;
    }

    /**
     * @return the rateQuad2
     */
    public double getRateQuad2() {
        return rateQuad2;
    }

    /**
     * @return the rateQuad3
     */
    public double getRateQuad3() {
        return rateQuad3;
    }

    /**
     * @return the rateQuad4
     */
    public double getRateQuad4() {
        return rateQuad4;
    }

    /**
     * @return the rateTotal
     */
    public double getRateTotal() {
        return rateTotal;
    }
}
