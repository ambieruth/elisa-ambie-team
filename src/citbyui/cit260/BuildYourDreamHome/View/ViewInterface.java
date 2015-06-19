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
public interface ViewInterface {
    
    public void dispaly ();
    public String getInput ();
    
    @Override
    public boolean doAction (Object obj){
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
    }
    
}
