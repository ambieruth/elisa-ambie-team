/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit460.BuildYourDreamHome.control;

/**
 *
 * @author ElisaHutchings
 */
public class InventoryControl {

    public double calcLumberSize(double height, double width, double length) {

    if (height < 0) {
        return -1;
    }
    
    if (width <0) {
        return -1;
    }
    
    if (length < 0) {
        return -1;
    }
    
    double dimension = length * width * height;
    
    return dimension;
    }
    
    public double calcCementAmount (double weight){
            
            if (weight < 1000) {
        return -1;
    }
            return weight;
    }     

    public double calcGrassAmount (double width, double length) {
        
    if (width <0) {
        return -1;
    }
    
    if (length < 0) {
        return -1;
    }
    
    double dimension ;
        dimension = length * width;
    
    return dimension;
    }
    
    public calcCountertops (double width, double length, double height) {
        if  (width < 0){
            return -1;
        }
        
        if (length < 0){
            return -1;
        }
        
        if (height <0){
            return -1;
        }
        
        double dimension;
        dimension = length * width * height;
        
        return dimension;
        
        }
        
    public double calcWindowSize (double width, double length) {
        
    if (width <0) {
        return -1;
    }
    
    if (length < 0) {
        return -1;
    }
    
    double dimension ;
        dimension = length * width;
    
    return dimension;
    }
}

