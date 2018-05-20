/*
 * the main() class file for the cityOfAaron project.
 * CIT 260
 * Spring 2018
 * Team members: Tiffany Romrell, Carol Howe, Benjamin Wood
 */
package cityofaaron;

import byui.cit260.CityOfAaron.model.ListItem;
import byui.cit260.CityOfAaron.model.CropData;
import byui.cit260.CityOfAaron.model.Location;
import byui.cit260.CityOfAaron.model.Player;


/**
 *
 * @author carolhowe
 */
public class CityOfAaron {

    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Fliststone");
        playerOne.getName();
        
        String playerOneName = playerOne.getName();
      
        
        System.out.println("Name = " + playerOneName );
        
        CropData newCrop = new CropData();
        newCrop.setNewPeople(3);
        newCrop.getNewPeople();
        int newCropData = newCrop.getNewPeople();
        System.out.println("Number of new people is " + newCropData +". Built by Benjamin Wood.");
        
        ListItem total = new ListItem();
        total.setNumber(5);
        total.getNumber();
        int newListItem = total.getNumber();
        System.out.println("The total of this item is " + newListItem +". Built by Tiffany Romrell.");
        
        Location newLocation = new Location();
        newLocation.setDescription(playerOneName);
        newLocation.getDescription();
        System.out.println("The location is:" + newLocation + "Built by Carol Howe");
        
       
        
        
        
        
        
    }
    
}
