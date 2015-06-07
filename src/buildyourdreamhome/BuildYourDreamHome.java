/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamhome;

import byui.cit260.buildYourDreamHome.model.InventoryItems;
import byui.cit260.buildYourDreamHome.model.Player;
import citbyui.cit260.BuildYourDreamHome.View.StartProgramView;


/**
 *
 * @author ambiesnell
 */
public class BuildYourDreamHome {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }

    
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        BuildYourDreamHome.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    public static void setPlayer(Player player) {
        BuildYourDreamHome.player = player;  
    }
    
}
