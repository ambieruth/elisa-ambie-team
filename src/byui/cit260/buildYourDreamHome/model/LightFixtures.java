/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamHome.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ElisaHutchings
 */
public class LightFixtures implements Serializable{
    
    //class instance variables
    private String color;

    public LightFixtures() {
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "LightFixtures{" + "color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.color);
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
        final LightFixtures other = (LightFixtures) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    
}
