/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.CityOfAaron.model.Game;
import java.util.Scanner;
import byui.cit260.CityOfAaron.model.Player;



/**
 *
 * @author Benjamin
 */
public class HelpMenuView {
    Scanner keyboard = new Scanner (System.in);
    private String helpMenu;
    private int max;
    
   /**
     * The displayHelpMenuView method
     * Purpose: displays the help menu, gets user's input, and does the 
     * selected action.
     * parameters:none
     * Returns: none
     */
    
    public HelpMenuView()
    {
        helpMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: HELP MENU       *\n" + 
        "**********************************\n" +
         " 1 - What are the goals of the game?\n"+
         " 2 - Where is the city of Aaron?\n"+
         " 3 - How do I view the map?\n"+
         " 4 - How do I move to another location?\n"+
         " 5 - How do I display a list of animals,\n"+
         "     provisions and tools in the city storehouse?\n"+
         " 6 - Back to the Main Menu.\n";
        max = 6;
    }
    public void displayMenuView()
    {
        int helpMenuOption; 
        do
    {

        //Display the menu
        System.out.println(helpMenu);

        //Prompt the user and get the user's input
        helpMenuOption = getHelpMenuOption();

        //Perform the desired action
        doAction(helpMenuOption);

        //Determine and display the next view
    }  
        while (helpMenuOption != max);
    }
     /**
    * The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer - the option selected */
    // ===================================
    public int getHelpMenuOption()
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
        System.out.println("\nOption must be between 1 and " + max);
    }
    // loop back to the top if input was not valid 
        } while(userInput < 1 || userInput > max);
    // return the value input by the user
        return userInput;
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
            case 1: // view goals of the game
                viewGoals();
                break;
            case 2: // view location of the city of Aaron
                viewLocation();
                break;
            case 3: // view map help
                viewMapHelp();
                break;
            case 4: // view move help
                viewMoveHelp();
                break;
            case 5: // view contents in storehouse
                viewStorehouse();
            case 6:  // back to main menu
                break;
        }
    }
    // if the option is 1, call viewGoals( )
    // if the option is 2, call viewLocation( )
    // if the option is 3, call viewMapHelp( )
    // if the option is 4, call viewMoveHelp( )
    // if the option is 5, call viewStorehouse( )
    // if the option is 6, call MainMenuVew( )
    public void viewGoals(){
        System.out.println("The Game goals are...");
    }
               
    public void viewLocation(){
        System.out.println("The City of Aaron is located...");
    }
           
    public void viewMapHelp(){
        System.out.println("Here is some help with the map...");
    }
              
    public void viewMoveHelp(){
        System.out.println("Need help moving...");
    }
               
    public void viewStorehouse(){
        System.out.println("list of animals, provisions, and tools...");
    }

}
