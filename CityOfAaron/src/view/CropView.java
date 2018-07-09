/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.CityOfAaron.model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import exceptions.CropException;
import java.io.PrintStream;
/**
 *
 * @author Benjamin
 */
public class CropView {
    
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();
 
    /**
    * The buyLandView method
    * Purpose: interface with the user input for buying land
    * Parameters: none
    * Returns: none
    */

    public static void buyLandView()
    {
      // Get the cost of land for this round.
        int price = CropControl.calcLandPrice();
      // Prompt the user to enter the number of acres to buy
      System.out.format("Land is selling for %d bushels per acre.%n",price);

      int toBuy;
      boolean paramsNotOkay;
      do
          {
          paramsNotOkay = false;
          // Get the user’s input and save it.
          System.out.print("\nHow many acres of land do you wish to buy? ");
          toBuy = keyboard.nextInt();
          try
          {
          CropControl.buyLand(toBuy, price, cropData);
          }
          catch(CropException e)
          {
          System.out.println("I am sorry master, I cannot do this.");
          System.out.println(e.getMessage());
          paramsNotOkay = true;
          }
          } while(paramsNotOkay);
    }

    /**
   *
   * @author Benjamin Wood, Lesson 08: Individual Assignment
   */
    public static void sellLandView() {
    int toSell = 0;
    int enoughLand = 0;
    int soldAcres = 0;
    
    // Ask the user “How many acres of new land do you want sell”?
    System.out.print("\nHow many acres of new land do you want to sell? ");
    // User enters a value
    
    toSell = keyboard.nextInt();
    // Make sure the value is positive. If it is not, show a message and ask the user to enter the value again.
    if (toSell <= 0) {
        System.out.print("\nPlease type a positive number.");
        // Make sure that the player has this much land to sell. If not, show a message and ask the player to enter the value again.
        } else if (cropData.getAcresOwned() > enoughLand){
                
                     System.out.print("\nYou don't have enough land.  Please select a small amount.");
        // Subtract the number of acres sold from the acres owned.
        } else {
            soldAcres = cropData.getAcresOwned() - toSell;
            // Add the wheat from the sale to the wheat in storage.
            int WheatInStore = cropData.getWheatInStore() + soldAcres;
            cropData.setWheatInStore(WheatInStore);
        }
    
  }
    
    public static void setOfferingView(){
        int percent;
        
        boolean paramsNotOkay;
        do{
            paramsNotOkay = false;
            //  prompt user to enter the percent of harvest for offerings
            System.out.print("\nWhat Percentage(0-100%) of your harvest do you want to give as offerings? ");
            //  save user input
            percent = keyboard.nextInt();
            try {
            //  call setOffering()
            CropControl.setOffering(percent, cropData);
            } catch(CropException e)
            {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
            }
            } while(paramsNotOkay);
    }
  
    public static void plantCropsView()
    {
        /**
        *
        * @author Tiffany Romrell
        */
        
        int cropYield;
        int acresOwned = 0;
        int acresPlanted = 0;
        
        boolean paramsNotOkay;
        do{
            paramsNotOkay = false;
            //  prompt user to enter the amount of crops that they would like to plant
            System.out.print("\nHow many crops would you like to plant? ");
            //  save user input
            cropYield = keyboard.nextInt();
            try {
            //  call plantCrop()
            CropControl.plantCrop(cropYield, acresOwned, acresPlanted, cropData);
            } 
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
            
            } while(paramsNotOkay);
        
    }
    
    public static void feedPeopleView() {
            
// GET WHEAT IN STORE
        int wheat = cropData.getWheatInStore();
        
// SHOW WHEAT IN STORE TO USER
        System.out.format("There are %d bushels of wheat in store.%n", wheat); 
//HOW MUCH WHEAT TO FEED THE PEOPLE
        System.out.print("How much wheat would you like to give to the people?");
//OBTAIN INPUT
        int wheatForPeople = keyboard.nextInt(); 
//GIVE WHEAT TO PEOPLE.
        CropControl.feedPeople(wheatForPeople, cropData); 
        
}
    /**
    * The runCropsView method()
    * Purpose: runs the City of Aaron game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView()
    {
    // call the buyLandView( ) method
    buyLandView( );
    sellLandView();
    setOfferingView();
    plantCropsView();
    // add calls to the other crop view methods
    // as they are written
    }
    
}
    
    
    
    