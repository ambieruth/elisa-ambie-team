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
public class House implements Serializable{
    
    //class instance variables
    private String description;
    private double width;
    private double length;
    private double height;
    private double numberOfBedrooms;
    private double numberOfBathrooms;
    private double sqFtOfRooms;

    public House() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(double numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public double getSqFtOfRooms() {
        return sqFtOfRooms;
    }

    public void setSqFtOfRooms(double sqFtOfRooms) {
        this.sqFtOfRooms = sqFtOfRooms;
    }

    @Override
    public String toString() {
        return "House{" + "description=" + description + ", width=" + width + ", length=" + length + ", height=" + height + ", numberOfBedrooms=" + numberOfBedrooms + ", numberOfBathrooms=" + numberOfBathrooms + ", sqFtOfRooms=" + sqFtOfRooms + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.numberOfBedrooms) ^ (Double.doubleToLongBits(this.numberOfBedrooms) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.numberOfBathrooms) ^ (Double.doubleToLongBits(this.numberOfBathrooms) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.sqFtOfRooms) ^ (Double.doubleToLongBits(this.sqFtOfRooms) >>> 32));
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
        final House other = (House) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfBedrooms) != Double.doubleToLongBits(other.numberOfBedrooms)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfBathrooms) != Double.doubleToLongBits(other.numberOfBathrooms)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sqFtOfRooms) != Double.doubleToLongBits(other.sqFtOfRooms)) {
            return false;
        }
        return true;
    }
    
    
    
}
