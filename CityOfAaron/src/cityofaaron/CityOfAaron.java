/*
 * the main() class file for the cityOfAaron project.
 * CIT 260
 * Spring 2018
 * Team members: Tiffany Romrell, Carol Howe, Benjamin Wood
 */
package cityofaaron;

import byui.cit260.CityOfAaron.model.Player;

/**
 *
 * @author carolhowe
 */
public class CityOfAaron {

    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Fliststone");
        playerOne.getName();
        
        String playerOneName = playerOne.getName();
      
        
        System.out.println("Name = " + playerOneName );
        
    }
    
}
