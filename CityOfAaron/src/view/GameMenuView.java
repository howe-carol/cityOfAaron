/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import byui.cit260.CityOfAaron.model.*;
import cityofaaron.CityOfAaron;
import static control.GameControl.theGame;
import java.util.Scanner;

/**
 *
 * @author Tiffany Romrell
 */
public class GameMenuView extends MenuView {
    
        Scanner keyboard = new Scanner (System.in);
        private String menu;
        private int max;
    

        public GameMenuView() {
            super( "\n" +
            "**********************************\n" +
            "*   What would you like to do?   *\n" + 
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - View Current Location\n" +
            " 4 - Move to a new location\n" +
            " 5 - Manage the Crops\n" +
            " 6 - Return to the Main menu\n",
            6);
        }
        
        
        
        @Override public void doAction(int option)
        {
            switch (option)
            {
                case 1: // create and start a new game
                    viewTheMap();
                    break;
                case 2: // get and start a saved game
                    viewOrPrintAList();
                    break;
                case 3: // view current location
                    viewCurrentLocation();
                    break;
                case 4: // get help menu
                    moveNewLocation();
                    break;
                case 5: // save game
                    manageTheCrops();
                    break; 
                case 6: // return to main menu
                    break;
            }
        }

         public void viewTheMap() {
        GameControl theGameControl = new GameControl();
        theGameControl.displayMap();
        
    }
         /**
        *The viewList() method
        * Purpose: Creates a ViewListobject and calls its
        * displayMenuView( ) method
        * Parameters: none
        * Returns: none
        */
        public void viewOrPrintAList() {
            ListMenuView menu = new ListMenuView();
            menu.displayMenu();
        }
        
        /*
        * viewCurrentLocation()
        * moveNewLocation()
        * Author:  Benjamin Wood, Individual Assignment, Lesson 13
        * Purpose:  display to user the current location of player and allow for
        *           user to move to a new location.  Display location description
        *           after Player has moved, or wants to verify current location
        * Parameter:  none
        * Returns:  none
        */
        public void viewCurrentLocation(){
            // Call Map Row and Column Position
            Player player = theGame.getThePlayer();
            int rowPosition = player.getRowPosition();
            int colPosition = player.getColPosition();
            
            //  Prompt user to move to a location on map if they are still at (0,0)
            if(rowPosition <= 0 || colPosition <=0){
                System.out.format("\nYou are not on the Map.  You must move to a new location on the Map.\n");
            
            //  While Map coordinates are valid, display location description               
            } while (rowPosition > 0 && colPosition > 0){
            Game theGame = cityofaaron.CityOfAaron.getTheGame();
            String locDescription = theGame.getTheMap().getLocation(rowPosition, colPosition).getDescription();
            System.out.println("\n" + locDescription);
            
            //  break out of the loop
            break;
            }
        }
        public void moveNewLocation() {
            //  set two variables to pass to GameControl.setPlayerPosition
            int newRow, newCol;
            
            //  prompt user to select new Map coordinates to move the Player
            System.out.println("\nSelect new Map coordinates.\n");
            
            //  prompt user to enter x-coordinate of new map location
            System.out.print("\nEnter the x-coordinate: ");
            //  send user entry to getNextInt() to validate coordinate on map
            newCol = getNextInt(8) - 1;
            // prompt user to enter y-coordinate of new map location
            System.out.print("\nEnter the y-coordinate: ");
            //  send user entry to getNextInt() to validate coordinate on map
            newRow = getNextInt(8) - 1;
            
            //  pass both row and column varialbes to setPlayerPosition()
            control.GameControl.setPlayerPosition(newRow, newCol);
            
            //  start call for Map location description
            Game theGame = cityofaaron.CityOfAaron.getTheGame();
            String locDescription = theGame.getTheMap().getLocation(newRow, newCol).getDescription();
            //  output to user the Map location description
            System.out.println("\n" + locDescription);
        }
        
        public int getNextInt(int coorInt){
            int inputValue = 0;
            do {
              inputValue = keyboard.nextInt();
              if(inputValue < 1 || inputValue > coorInt){
                  System.out.format("\nOops, you must enter a number from 1 to " + coorInt + ". Please try again: ");
              }
            } while(inputValue < 1 || inputValue > coorInt);

            return inputValue;
        }
        
        public void manageTheCrops() {
           
         CropView cropData = new CropView();
         cropData.runCropsView();
             
        }
   
}



