/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;


/**
 *
 * @author Benjamin Wood, Lesson 08: Individual Assignment
 */
public class HelpMenuView extends MenuView {
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
        super( "\n" +
        "**********************************\n" +
        "* CITY OF AARON: HELP MENU       *\n" + 
        "**********************************\n" +
         " 1 - What are the goals of the game?\n"+
         " 2 - Where is the city of Aaron?\n"+
         " 3 - How do I view the map?\n"+
         " 4 - How do I move to another location?\n"+
         " 5 - How do I display a list of animals,\n"+
         "     provisions and tools in the city storehouse?\n"+
         " 6 - Back to the Main Menu.\n",
        6);
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
