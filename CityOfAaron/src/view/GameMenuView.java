/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import byui.cit260.CityOfAaron.model.*;
import cityofaaron.CityOfAaron;
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
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Return to the Main menu\n",
            5);
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

         public void viewTheMap() {
        GameControl theGameControl = new GameControl();
        theGameControl.displayMap();
        
    }

        public void viewOrPrintAList() {
            ListMenuView menu = new ListMenuView();
            menu.displayMenu();
        }

        public void moveToANewLocation() {
            
        }

        public void manageTheCrops() {
           
         CropView cropData = new CropView();
         cropData.runCropsView();
             
        }
   
}



