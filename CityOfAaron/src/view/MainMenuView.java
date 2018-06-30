/*
 * The MainMenuView calss - part of the view layer.
 * Object of this class manages the main menu
 * Author: Carol Howe, Benjamin Wood, Tiffany Romrell
 * Date last modified: June 4 2018
 */

package view;

import byui.cit260.CityOfAaron.model.*;
import java.util.Scanner; 
import control.*;

/**
 *
 * @author carolhowe
 */
public class MainMenuView extends MenuView {
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
  super("\n" +
        "**********************************\n" +
        "* CITY OF AARON: MAIN GAME MENU *\n" + 
        "**********************************\n" +
        " 1 - Start new game\n" +
        " 2 - Get and start a saved game\n" +
        " 3 - Get help on playing the game\n" +
        " 4 - Save game\n" +
        " 5 - Quit\n",
        5);
    }
    



   /**
   *The doAction method
   * Purpose: performs the selected action 
   * Parameters: none
   * Returns: none
   */
   // ===================================
   @Override public void doAction(int option)
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
               System.out.println("Glad to help... have fun!"); 
       }
   }
   // if the option is 1, call startNewGame( )
   // if the option is 2, call startExistingGame( )
   // if the option is 3, call displayHelpMenu( )
   // if the option is 4, call displaySaveGame( )
   // if the option is 5, display a goodbye message




    // The startNewGame method
    // Purpose: create game object and starts the game
    // parameters: none
    // returns: none
    // =====================================================
    public void startNewGame()
    {
        // Display the Banner Page.
        System.out.println("\n" +
         "************************************************\n" +
         "* Welcome to the precious City of Aaron. You   *\n" +
         "* are hereby called to serve as a ruler of the *\n" +
         "* city. You are resposible for the buying and  *\n" +
         "* selling of the land. You will also carefully *\n" +
         "* determine how much wheat to plant each year  *\n" +
         "* and how much you will put away to feed the   *\n" +
         "* citizens of Aaron. Yearly you will pay your  *\n" +
         "* tithes and offerings on the wheat that was   *\n" +
         "* harvested--just be grateful there's no taxes.*\n" +
         "*                                              *\n" +
         "* Also, people will starve and die if you fail *\n" +
         "* to provide enough wheat, and your workforce  *\n" +
         "* will be dimished.                            *\n" +
         "*                                              *\n" +
         "*          *****One last WARNING!*****         *\n" +
         "*          Rats like to eat your wheat!        *\n" +
         "************************************************\n");
        
        // Prompt for and get the user's name.
        String name;
        System.out.println("Please type in your first name: ");
        name = keyboard.next();
        
        // Display a welcome message
        System.out.println("Welcome " + name + ", have fun!");
        
        // call the createNewGame( ) method. Pass the name as a parameter
        GameControl.createNewGame(name);
        
        // Display the game menu
        GameMenuView menu = new GameMenuView();
        menu.displayMenu();
        

        
        /*
        // Create a CropData object,
        CropData cropData = new CropData();
        // initialize it
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000);
        // save a reference to it in the Game
        theGame.setCropData(cropData); 
        */
    }
    
    // The startSavedGame method
    // Purpose: locate game object and starts saved game
    // parameters: none
    // returns: none
    // =====================================================
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option .");
    }
    // The displayHelpMenuView method
    // Purpose: Display the help menu view
    // parameters: none
    // returns: none
    // =====================================================
    public static void displayHelpMenuView()
    {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        //System.out.println("\nDisplay the help menu view.");
    }
    // The displaySaveGameView method
    // Purpose: Display list of saved games
    // parameters: none
    // returns: none
    // =====================================================
    public void displaySaveGameView()
    {
        GameMenuView menu = new GameMenuView();
        menu.displayMenu();
        //System.out.println("\nDisplay the game menu view.");
    }
        
}
