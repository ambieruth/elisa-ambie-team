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
public class MainMenuView {
    
    
    private final String MENU ="\n"
            + "\n--------------------------------------------------------------"
            + "\n| Main Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nN - New game"
            + "\nG - Load saved game"
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
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() <1) { //blank value entered
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            
            break;
        }
        
        return selection; //return the name
    }

    private void doAction(char selection) {
        
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
        
        // create a new game
        int value = GameControl.createNewGame(BuildYourDreamHome.getPlayer());
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


    
    }
    

