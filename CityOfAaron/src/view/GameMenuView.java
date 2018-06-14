/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class GameMenuView {
    
        Scanner keyboard = new Scanner (System.in);
        private String gameMenu;
        private int max;
    

        public GameMenuView() {
            gameMenu = "\n" +
            "**********************************\n" +
            "*   What would you like to do?   *\n" + 
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Return to the Main menu\n";
            max = 5;
        }

        public void displayMenuView()
    {
        int gameMenuOption; 
        do
    {

        //Display the menu
        System.out.println(gameMenu);

        //Prompt the user and get the user's input
        gameMenuOption = getGameMenuOption();

        //Perform the desired action
        doAction(gameMenuOption);

        //Determine and display the next view
    }  
        while (gameMenuOption != max);
    }
        
        public int getGameMenuOption()
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
        
        
        
        public void doAction(int gameOption)
{
    switch (gameOption)
    {
        case 1: // create and start a new game
            viewTheMap();
            break;
        case 2: // get and start a saved game
            viewOrPrintAList();
            break;
        case 3: // get help menu
            moveToANewLocation();
            break;
        case 4: // save game
            manageTheCrops();
            break; 
        case 5: // return to main menu
            break;
    }
}

        private void viewTheMap() {
            
        }

        private void viewOrPrintAList() {
            
        }

        private void moveToANewLocation() {
            
        }

        private void manageTheCrops() {
           
         CropView cropData = new CropView();
         cropData.runCropsView();
             
        }
   
}
