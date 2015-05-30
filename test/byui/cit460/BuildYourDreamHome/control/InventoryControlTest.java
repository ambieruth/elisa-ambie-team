/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit460.BuildYourDreamHome.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ElisaHutchings
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcLumberSize method, of class InventoryControl.
     */
    @Test
    public void testCalcLumberSize() {
        System.out.println("calcLumberSize");
        
        /**************************
         * Test case #1
         *************************/
        System.out.println("\\+Test case #1");
        
        //input values for test case 1
        double height = 5;
        double width = .5;
        double length = 10;
        
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        double expResult =25; //expected output returned value
        
        //call function to run test
        double result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
    
         /**************************
         * Test case #2
         *************************/
        System.out.println("\\+Test case #2");
        
        //input values for test case 2
        height = -1;
        width = 1;
        length = 4;
        
        expResult =-1; //expected output returned value
       
        //call function to run test
        result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
           
        
                 /**************************
         * Test case #3
         *************************/
        System.out.println("\\+Test case #3");
        
        //input values for test case 3
        height = 4;
        width = -1;
        length = 4;
        
        expResult =-1; //expected output returned value
       
        //call function to run test
        result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
                 /**************************
         * Test case #4
         *************************/
        System.out.println("\\+Test case #4");
        
        //input values for test case 4
        height = 4;
        width = 5;
        length = -2;
                
        expResult =-1; //expected output returned value
       
        //call function to run test
        result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        
                 /**************************
         * Test case #5
         *************************/
        System.out.println("\\+Test case #5");
        
        //input values for test case 5
        height = 3;
        width = 1;
        length = 4;
        
        expResult =12; //expected output returned value
       
        //call function to run test
        result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        
                 /**************************
         * Test case #6
         *************************/
        System.out.println("\\+Test case #6");
        
        //input values for test case 6
       height = 4;
       width = 2;
       length = 1;
        
       expResult =8; //expected output returned value
       
        //call function to run test
       result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
                
                 /**************************
         * Test case #7
         *************************/
        System.out.println("\\+Test case #7");
        
        //input values for test case 7
        height = 4;
        width = 1;
        length = 1;
        
        expResult =4; //expected output returned value
       
        //call function to run test
        result = instance.calcLumberSize(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
           }

    /**
     * Test of calcGrassAmount method, of class InventoryControl.
     */
    @Test
    public void testCalcGrassAmount() {
        System.out.println("calcGrassAmount");
        
        System.out.println("\\+Test case #1");
        
         //input values for test case 1
        double width = 8450;
        double length = 10642;
        
        double expResult = 89924900; //expected output returned value
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\\+Test case #2");
        
         //input values for test case 2
        width = -1;
        length = 14362;
        
        expResult = -1; //expected output returned value
        //create instance of InventoryControl class
        
        //call function to run test
        result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\\+Test case #3");
        
         //input values for test case 3
        width = 17574;
        length = 1024;
        
        expResult = 17995776; //expected output returned value
        //create instance of InventoryControl class
        
        //call function to run test
        result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\\+Test case #4");
        
         //input values for test case 4
        width = 4567;
        length = 75354;
        
        expResult = 344141718; //expected output returned value
        //create instance of InventoryControl class
        
        //call function to run test
        result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\\+Test case #5");
        
         //input values for test case 5
        width = 10654;
        length = 10539.5;
        
        expResult = 112287833; //expected output returned value
        //create instance of InventoryControl class
        
        //call function to run test
        result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\\+Test case #6");
        
         //input values for test case 6
        width = 25787;
        length = 148.75;
        
        expResult = 3835816.25; //expected output returned value
        //create instance of InventoryControl class
        
        //call function to run test
        result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         System.out.println("\\+Test case #7");
        
         //input values for test case 7
        width = 16989;
        length = 7362;
        
        expResult = 125073018; //expected output returned value
        //create instance of InventoryControl class
        
        //call function to run test
        result = instance.calcGrassAmount(width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
        
    
}
