/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamhome;

import byui.cit260.buildYourDreamHome.model.InventoryItems;
import byui.cit260.buildYourDreamHome.model.Player;

/**
 *
 * @author ambiesnell
 */
public class BuildYourDreamHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Aaron Wester");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        InventoryItems menu = new InventoryItems();
        
        menu.setInventoryType("Windows, LightFixtures, Decor, Countertops, Landscape, Cement, Lumber");
        menu.setQuantityInStock(10);
        menu.setRequiredAmount(7);
        
        String menuItems = menu.toString();
        System.out.println(menuItems);
    }
    
}
