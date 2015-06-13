/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.BuildYourDreamHome.View;

import byui.cit260.buildYourDreamHome.model.Player;
import byui.cit460.BuildYourDreamHome.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author ambiesnell
 */
public class StartProgramView {
    
    public StartProgramView(){ 
    }
    
    public void startProgram(){
        //Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        if (playersName == null) //user wants to quit
            return; //exit the game
        
        // Create and save the player object
        Player player = GameControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the Main menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n***********************************************");
        
        System.out.println("*                                                  *"
                + "\n* This is the game Build Your Dream Home. In this game    *"
                + "\n* you will designs and gather materials to create your    *"
                + "\n* dream home.                                             *");
        
        System.out.println("*                                                  *"
                + "\n* As a designer and a builder you will be to first        *"
                + "\n* need to make a plan and determine the number of         *"
                + "\n* bedrooms, bathroom and bonus rooms. Then by             *"
                + "\n* determining the size of your home you will then         *"
                + "\n* calculate the amount of supplies needed to begin        *"
                + "\n* constructing your home.                                 *");
        
        System.out.println("*                                                  *"
                + "\n* Good luck and have fun building.                        *"
                + "\n*                                                         *");
        
        System.out.println("****************************************************");
    }

    public String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two character in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return playersName; // return the name
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n===============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("===================================================");
    }
    
}
