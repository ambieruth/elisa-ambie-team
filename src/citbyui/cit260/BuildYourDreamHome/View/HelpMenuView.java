/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.BuildYourDreamHome.View;

/**
 *
 * @author ElisaHutchings
 */
class HelpMenuView {
    
    private final String MENU ="\n"
            + "\n--------------------------------------------------------------"
            + "\n| Help Menu                                                  |"
            + "\n--------------------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move from one location to another"
            + "\nC - How to calculate dimensions"
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
