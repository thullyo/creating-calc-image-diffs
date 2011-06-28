/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

/**
 *
 * @author thullyo.ferreira
 */

public class Colors {
    //private List<Double> brightList = new ArrayList<Double>();
    private double ammountTotal = 0;
    private int countTotal = 0;

    public void setColor(Color color) {
        //this.brightList.add(color.getBrightness());
        this.countTotal++;
        this.ammountTotal += color.getBrightness();
    }
    
    //public Double getColor(int i) {
        //return this.brightList.get(i);
    //}
    
    public double getAmmount() {
        //return this.brightList.size();
        return this.ammountTotal;
    }
    
    public int getCount() {
        //return this.brightList.size();
        return this.countTotal;
    }
    
    public double getAverage() {
        /*double avg = 0;
        
        for (int i=0; i<this.brightList.size(); i++) {
            avg += this.brightList.get(i);
        }
        
        return (avg/this.brightList.size());*/
        return this.ammountTotal/this.countTotal;
    }
}
