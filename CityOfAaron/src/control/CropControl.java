/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import byui.cit260.CityOfAaron.model.CropData;
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

    public static int feedPeople (int bushels, int wheatForPeople, CropData cropData, int wheatInStore )
    {
        // if bushels < 0, return -1
        // if bushels > wheatInstore, return -1
        // wheatForPeople = wheatInStore - bushels
        // return wheatForPeople
        
        if(bushels < 0){
            return -1;
        }
        
       
        int weathInStore = cropData.getWheatInStore();
         if (bushels > wheatInStore){
            return -1;
        }
         
         
        wheatForPeople = wheatInStore -= bushels;
        
        return wheatInStore;
    }
}
