/*
 * The MainMenuView calss - part of the view layer.
 * Object of this class manages the main menu
 * Author: Carol Howe, Benjamin Wood, Tiffany Romrell
 * Date last modified: June 4 2018
 */
package view;

import java.util.Scanner;
import gameproject.GameProject;
import model.Player;
import cityofaaron.CityOfAaron;
/**
 *
 * @author carolhowe
 */
public class MainMenuView {
    private String theMenu;
    private int max;

    Scanner keyboard = new Scanner (System.in);
    /**
     * The displayMenuView method
     * Purpose: displays the menu, gets user's input, and does the 
     * selected action.
     * parameters:none
     * Returns: none
     */
    public MainMenuView() 
    {
        theMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: MAIN GAME MENU *\n" + 
        "**********************************\n" +
        " 1 - Start new game\n" +
        " 2 - Get and start a saved game\n" +
        " 3 - Get help on playing the game\n" +
        " 4 - Save game\n" +
        " 5 - Quit\n";
        max = 5;
    }
public void displayMenuView()
{
    int menuOption; 
    do
{

    //Display the menu
    System.out.println(mainMenu);
    
    //Prompt the user and get the user's input
    menuOption = getMenuOption();
    
    //Perform the desired action
    doAction(menuOption);
    
    //Determine and display the next view
}  
    while (menuOption != max);
}
 /**
* The getMenuOption method
* Purpose: gets the user's input
* Parameters: none
* Returns: integer - the option selected */
// ===================================
public int getMenuOption()
{
int userInput;

// begin loop
do
{
// get user input from the keyboard
    userInput = keyboard.nextInt();
// if it is not a valid value, output an error message
    if (userInput < 1 || userInput > max)
{
    System.out.println(“Option must be between 1 and " + max);
}
// loop back to the top if input was not valid 
    } while(userInput < 1 || userInput > max);
// return the value input by the user
    return userInput;
}

}

/**
*The doAction method
* Purpose: performs the selected action 
* Parameters: none
* Returns: none
*/
// ===================================
public void doAction(int option)
{
    switch (option)
    {
        case 1: // create and start a new game
            startNewGame();
            break;
        case 2: // get and start a saved game
            startSavedGame();
            break;
        case 3: // get help menu
            displayHelpMenuView();
            break;
        case 4: // save game
            displaySaveGameView();
            break; 
        case 5:
            System.out.println("Thanks for playing ... goodbye."); 
    }
}
// if the option is 1, call startNewGame( )
// if the option is 2, call startExistingGame( ) // if the option is 3, call displayHelpMenu( )
// if the option is 4, call displaySaveGame( )
// if the option is 5, display a goodbye message



/**
* The startNewGame method
* Purpose: creates game object and starts the game * Parameters: none
* Returns: none
*/
// ===================================
   public void startNewGame()
    {
    System.out.println("Start new game option selected."); 
    }

 public void startSavedGame()
    {
    System.out.println("Start saved game option selected."); 
    }
 public void displayHelpMenuView()
    {
    System.out.println("Do you need help?"); 
    }
 public void displaySaveGameView()
    {
    System.out.println("Save game selected."); 
    }
