/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit460.BuildYourDreamHome.control;

import buildyourdreamhome.BuildYourDreamHome;
import byui.cit260.buildYourDreamHome.model.Player;

/**
 *
 * @author ElisaHutchings
 */
public class GameControl {
    
    public static void createNewGame (Player player){
        System.out.println("\n*** createNewGame stub function called ***");
    }
public static Player createPlayer(String name) {
if (name == null){
    return null;
    
}
Player player=new Player();
player.setName(name);

BuildYourDreamHome.setPlayer(player);  

return player;
}

 
}