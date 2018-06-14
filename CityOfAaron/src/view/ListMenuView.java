/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import byui.cit260.CityOfAaron.model.*;
import control.*;




/**
 *
 * @author carolhowe
 */
public class ListMenuView {
    Scanner keyboard = new Scanner (System.in);
    private String MainMenu;
    private int max;
    
// The List Menu view will provide a list of options

    public ListMenuView() {
        listMenu = " CITY OF AARON - LIST MENU\n" +
                   "1. Animals in the storehouse\n" +
                   "2. Tools in the storehouse\n" +
                   "3. Provisions in the storehouse\n" +
                   "4. Authors of this game\n" +
                   "5. Quit\n";
        max = 5;
        
        
  }
    /**
    * The displayMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
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
     }

 
    /**
    * The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer - the option selected
    * @return 
    */
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
// LIST OF ANIMALES
           case 1: 
               listAnimals();
               break;
// LIST OF TOOLS
           case 2: 
               listTools();
               break;
// LIST OF PROVISIONS
           case 3: 
               listProvisions();
               break;
//LIST TEAM
           case 4: 
               listTeam();
               break; 
           case 5:
               System.out.println("Main menu"); 
       }

 public void listAnimals()
    {
     System.out.println("list animals");
    }
 
    public void listTools()
    {  
     System.out.println("list tools");
    }
 
    public void listProvisions()
    {
     System.out.println("list provisions");
    }
 
    public void listTeam()
    {
     System.out.println("list team");
    }

    
}