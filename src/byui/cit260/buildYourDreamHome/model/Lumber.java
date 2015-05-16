/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamHome.model;

import java.io.Serializable;

/**
 *
 * @author ElisaHutchings
 */
public class Lumber implements Serializable{
    
    //class instance variables
    private double dimensions;

    public Lumber() {
    }
    
    

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Lumber{" + "dimensions=" + dimensions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.dimensions) ^ (Double.doubleToLongBits(this.dimensions) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lumber other = (Lumber) obj;
        if (Double.doubleToLongBits(this.dimensions) != Double.doubleToLongBits(other.dimensions)) {
            return false;
        }
        return true;
    }
    
    
    
}
