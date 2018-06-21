/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
/**
 ** The MenuView class – base abstract class for all menu views
 * @author Benjamin, Tiffany, and Carol
 * Date last modified: June 2018
 */
public abstract class MenuView implements ViewInterface {
    // the data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in); 

    protected String menu; // this string holds the menu string 
    protected int max; // this int holds the max input value
    
    /** * MenuView Constructor
     * Purpose: Initialize the view object with the menu string
     * Parameters: the menu string and the max value 
     * Returns: none */ 
    public MenuView(String _menu, int _max) 
    { 
        this.menu = _menu; 
        this.max = _max; 
    }
    
    @Override public void displayMenu()
    {
        // execute this loop as long as the selected option is not max
        int menuOption = 0; 
        do
        {

        //Display the menu
        System.out.println(menu);

        //Prompt the user and get the user's input
        menuOption = getMenuOption();

        //Perform the desired action
        doAction(menuOption);

        //Determine and display the next view
    }  
        while (menuOption != max);
    }
    
    @Override public int getMenuOption()
    { 
        int inputValue = 0; 
        do 
        { 
            System.out.format("Please enter an option(1 - %d):", max);
            inputValue = keyboard.nextInt(); 
            if (inputValue < 1 || inputValue > max)
            { 
            System.out.format("Error: input value must be between 1 and %d.", max); 
            } 
        } while (inputValue < 1 || inputValue > max);
        return inputValue; 
    }
}
