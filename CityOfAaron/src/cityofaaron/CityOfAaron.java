/*
 * the main() class file for the cityOfAaron project.
 * CIT 260
 * Spring 2018
 * Team members: Tiffany Romrell, Carol Howe, Benjamin Wood
 */
package cityofaaron;
import view.*;
import byui.cit260.CityOfAaron.model.*;
import java.io.PrintWriter;


/**
 *
 * @author carolhowe
 */
public class CityOfAaron {
    
    private static Game theGame = null;
    public static PrintWriter outFile = null;
    
    public static PrintWriter getOutFile(){
        return outFile;
    }
    public static void setOutFile (PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }
    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }
    // private static Game theGame;
    
    public static void main(String[] args) 
    {
        /*
        int value1;
        String value2;
        System.out.println("Enter a number: ");
        value1 = input.nextInt();
        
        //dummy nextLine() read \n character left in the stream
        input.nextLine();
        
        System.out.println("Enter a string value: ");
        value2 = input.nextLine();
        System.out.println(value1);
        System.out.println(value2);
        */
        
        
        MainMenuView mmv = new MainMenuView(); 
        mmv.displayMenu();
        
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
        newLocation.getDescription();
        newLocation.getSymbol();
        System.out.println("The location is:" + newLocation + "Built by Carol Howe");
       
             
           
    }
    private static void displayMap() {
        displayMap();
        
    }
    

    public static void setCurrentGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }
    
}
