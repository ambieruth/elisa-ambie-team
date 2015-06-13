/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.BuildYourDreamHome.View;

/**
 *
 * @author ambiesnell
 */
public class GameMenuView {
    
     private final String MENU ="\n"
            + "\n--------------------------------------------------------------"
            + "\n| Game Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nA - Status of your Dream House"
            + "\nH - Hardware Store"
            + "\nN - Nursery"
            + "\nD - Interior Decor Store"
            + "\nI - Inventory"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n--------------------------------------------------------------";
    

    void displayMenu() {
        char selection = ' ';
        do {
            
           System.out.println(MENU); // display the main menu
           
           String input = this.getInput(); // get the user's selection
           selection = input.charAt(0); // get first character of string
           
           this.doAction(selection); // do action based on selection
        } while (selection != 'Q'); // a selection is not "Quit"
    }

    private String getInput() {
        return null;
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
