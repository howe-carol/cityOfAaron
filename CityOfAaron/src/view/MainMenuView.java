/*
 * The MainMenuView calss - part of the view layer.
 * Object of this class manages the main menu
 * Author: Carol Howe, Benjamin Wood, Tiffany Romrell
 * Date last modified: June 4 2018
 */

package view;

import java.util.Scanner; //import gameproject.GameProject;
import byui.cit260.CityOfAaron.model.Player;//import model.Player;
import byui.cit260.CityOfAaron.model.Game; // import cityofaaron.CityOfAaron;

/**
 *
 * @author carolhowe
 */
public class MainMenuView {
    Scanner keyboard = new Scanner (System.in);
    private String theMenu;
    private int max;

   
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
    System.out.println(theMenu);
    
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
    System.out.println("\noption must be between 1 and " + max);
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



}
    // The startNewGame method
    // Purpose: create game object and starts the game
    // parameters: none
    // returns: none
    // =====================================================
    public void startNewGame(){
        // Create a new Game object.
        Game theGame = new Game();
        
        // Save a reference to it in the GameProject class.
        CityOfAaron.setCurrentGame(theGame);
        
        // Display the Banner Page.
        System.out.println("\nWelcome to the precious City of Aaron. You are\n"
         + "hereby called to serve as a ruler of the city. You are resposible\n"
         + "for the buying and selling the land. You will also carefully determine\n"
         + "how much wheat to plant each year and how much you will put away to feed "
         + "the citizens of Aaron. Yearly you will pay your tithes on the wheat that was harvest\n"
         + "People will starve and die if you fail to provide enough wheat and your workforce will be dimished.\n"
         + "One last warning! Rats like to eat your wheat!\n");
        
        // create a new Player object
        Player thePlayer = new Player();
        
        // Prompt for and get the user's name.
        String name;
        System.out.println("Please type in your first name: ");
        name = keyboard.next();
        
        // Save the user's name in the Player object
        thePlayer.setPlayerName(name);
        
        // Save a reference to the player object in the Game object.
        theGame.setThePlayer(thePlayer);
        
        // Display a welcome message
        System.out.println("Welcome " + name + "have fun!");
        
        // Display the game menu
        
    }
    
    // The startSavedGame method
    // Purpose: locate game object and starts saved game
    // parameters: none
    // returns: none
    // =====================================================
    public void startExistingGame(){
        System.out.println("\nStart saved game option .");
    }
    // The displayHelpMenuView method
    // Purpose: Display the help menu view
    // parameters: none
    // returns: none
    // =====================================================
    public void displayHelpMenu(){
        System.out.println("\nDisplay the help menu view.");
    }
    // The displaySaveGameView method
    // Purpose: Display list of saved games
    // parameters: none
    // returns: none
    // =====================================================
    public void displaySaveGameView(){
        System.out.println("\nDisplay list of saved games.");
    }

}
