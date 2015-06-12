/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.BuildYourDreamHome.View;

import buildyourdreamhome.BuildYourDreamHome;
import byui.cit460.BuildYourDreamHome.control.GameControl;

/**
 *
 * @author ambiesnell
 */
public class MainMenuView {
    
    
    private final String MENU ="\n"
            + "\n--------------------------------------------------------------"
            + "\n| Main Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n--------------------------------------------------------------";
    
    

    public void displayMenu() {
        
        char selection = ' ';
        do {
            
           System.out.println(MENU); // display the main menu
           
           String input = this.getInput(); // get the user's selection
           selection = input.charAt(0); // get first character of string
           
           this.doAction(selection); // do action based on selection
        } while (selection != 'E'); // a selection is not "Exit"
    }

    private String getInput() {
        return null;
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void startNewGame (){
        GameControl.createNewGame(BuildYourDreamHome.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called***");
    }
    
    private void saveGame() {
        System.out.println("*** startExistingGame function called***");
    }
    
    private void displayHelpMenu() {
        System.out.println("***displayHelpMenu function called***");
    }


    
    }
    

