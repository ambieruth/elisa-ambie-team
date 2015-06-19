/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.BuildYourDreamHome.View;

import buildyourdreamhome.BuildYourDreamHome;
import byui.cit460.BuildYourDreamHome.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author ambiesnell
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super( "\n"
            + "\n--------------------------------------------------------------"
            + "\n| Main Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nN - New game"
            + "\nG - Load saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n--------------------------------------------------------------");
    }
    
    public boolean doAction(char selection) {
        
        switch (selection) {
            case 'N': //create and start a new game
                this.startNewGame();
                break;
            case 'G': //get and start an existing game
                this.startExistingGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
                this.saveGame();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void startNewGame (){
        
        int value;
        value = GameControl.createNewGame(BuildYourDreamHome.getPlayer());
        if (value<0) {
            System.out.println("ERROR - Failed to create new game");
        }
        
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
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.displayMenu();
    }

    @Override
    public void dispaly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    }
    

