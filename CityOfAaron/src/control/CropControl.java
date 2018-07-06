/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import byui.cit260.CityOfAaron.model.CropData;
import exceptions.CropException;
import java.util.Random;

// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
 /**
 *
 * @author Benjamin
 */
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and
//  a reference to a CropData object
// Returns: the number of acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned

public class CropControl {
    
    //constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 11;
    
    //random number generator
    private static Random random = new Random();
    // calcLandPrice() method
    // Purpose: Calculate a random land price between 17 and 27 bushels/acre
    // Parameters: none
    // Returns: the land price
    public static int calcLandPrice()
    {
    int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
    return landPrice;
    } 
    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    { 
    //if acresToSell < 0, return -1
        if(acresToSell < 0)
            return -1;
        
    //if acresToSell > acresOwned, return -1
        int acresOwned = cropData.getAcresOwned();
        if (acresToSell > acresOwned)
            return -1;
        
    //acresOwned = acresOwned - acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);
        
    //wheatInStore = wheatInStore + acresToSell * landPrice
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
        cropData.setWheatInStore(wheatInStore);
        
    //return acresOwned    
        return acresOwned;
    }
    
   
        // The feedPeople method 
        // Purpose: To feed people.
        //@param Bushels of wheat wanted to feed people.
        //@param wheat in store
        // @param a reference to a CropData object (wheatInStore)
        //@param a reference to a CropData object (wheatForPeople)
        // @ return the number of bushels left in store.
        //Pre-conditions: Bushels of grain wanted to give people must be positive.
        // and wheat in the wheatStore  <= Bushels of grain wanted to give people 

     public static int feedPeople(int wheatForPeople, CropData cropData){
        
        int wheatInStore = cropData.getWheatInStore(); 
        
        if (wheatForPeople < 0) {
            return -1;
        }
        
        if (wheatForPeople < wheatInStore) {
            wheatInStore -= wheatForPeople; 
            cropData.setWheatInStore(wheatInStore);
            cropData.setWheatForPeople(wheatForPeople);
            return cropData.getWheatInStore();
        }
        
        if (wheatInStore < wheatForPeople) {
            return -1;
        }
        
        return 0;
    }
    
        /**  Author = Benjamin Wood, Lesson 06: Individual Assignment
        *setOffering method
        *Purpose: to set the user’s offerings amount
        *@param percent user's input of percent of offering to give
        *@param cropData total harvest from CropData
        *@return the amount to offer
        *Pre-conditions:  user input must be positive, < zero and > 100.
        * The harvest must be positive *and < zero.
        */

    public static int setOffering(int percent, CropData cropData) {
               
        // precondition percent must be between 0 and 100
        // cropData must be greater than zero
        // if percent is greater than zero, send error of zero
        // if user input fails completly, send error of negative one 
        
        int offering;

        if (percent > 0 && percent < 100 && cropData.getHarvest() > 0) {
            offering = (percent * cropData.getHarvest()) / 100;
            cropData.setOffering(offering);
            
            return offering;
        }
        
        
        if (percent >= 100){
            return 0;
        }
                       
        else{
            return -1;
        }
        
    }
 
       public static int plantCrop (int cropYield, CropData cropData, int acresOwned, int acresPlanted){
        // Author = Tiffany Romrell, Lesson 06: Individual Assignment
        //plantCrop method
 
         if (acresOwned < cropYield){
             return -1;
         }
         
         if (acresPlanted < cropYield){
             return -1;
         }
         
         if (acresOwned < acresPlanted){
             return -1;
         }
         
        acresOwned = cropYield - acresPlanted;
        
        return acresOwned;
    }

    public static void buyLand(int toBuy, int price, CropData cropData) throws CropException{
        
        int acresOwned = cropData.getAcresOwned();
       
        
            // check parameters - do they meet the contract
        if (toBuy < 0) 
            throw new CropException("You must enter a positive number.");
        
        int wheatInStore = cropData.getWheatInStore();
        
        if (wheatInStore < price) {
           // System.out.println("The price of land cannot be greater
           // than ammount of wheat in store. Please choose smaller amount.");
            return -1;
        }
        
        if (toBuy * price > wheatInStore) 
            throw new CropException("There is insufficient wheat to buy this much land.");
        else if (price <= 26 && price >= 18 && toBuy * price < wheatInStore) {
        wheatInStore = wheatInStore - (toBuy * price);
        acresOwned = acresOwned + toBuy;
        
        } else{
            return -1;
        }
        
        return acresOwned;
        
        
    
    }

   
        
}


