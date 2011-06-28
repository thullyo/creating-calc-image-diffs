/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

/**
 *
 * @author thullyo.ferreira
 */
public class Color {
    
    private int r;
    private int g;
    private int b;

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
    
    public double getBrightness() {
        double sum = 0;
        
        sum = this.r + this.g + this.b;
        
        return (sum/3);
    }
        
}
