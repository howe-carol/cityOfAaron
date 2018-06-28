/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import byui.cit260.CityOfAaron.model.CropData;
import byui.cit260.CityOfAaron.model.Game;
import byui.cit260.CityOfAaron.model.ListItem;
import byui.cit260.CityOfAaron.model.Location;
import byui.cit260.CityOfAaron.model.Map;
import byui.cit260.CityOfAaron.model.Player;
import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import control.CropControl;

/**
 *
 * @author Benjamin Wood, Carol Howe, Tiffany Romrell
 */
public class GameControl {
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;

    // reference to a Game object
    private static Game theGame;
    
    
    
    public static void createNewGame(String name)
    {
        // Created the game object. Save it in the main driver file
        theGame = new Game();
        CityOfAaron.setCurrentGame(theGame);
        
        // create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setPlayerName(name);
        theGame.setPlayer(thePlayer);
        
        // create the CropData object
        public static void createCropDataObject()
        {
            CropData theCrops = new CropData();
            theCrops.setYears(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000);

            // Save the cropData in the Game object
            theGame.setCropData(theCrops);
        }

        
        // create the list of animals
        //@author Tiffany
        public static void createAnimalList()
        {
            ArrayList<ListItem> animals = new ArrayList<ListItem>();
            animals.add(new ListItem("cows", 12));
            animals.add(new ListItem("horses", 3));
            animals.add(new ListItem("pigs", 7));
            animals.add(new ListItem("goats", 4));
        
            // Save the animals in the game
            theGame.setAnimals(animals);
        }
        
        // create the list of tools
        //create the list of provisions
        
        // create the Locations and the Map object
        
        /**
        * The createMap method
        * Purpose: creates the location objects and the map
        * Parameters: none
        * Returns: none
        */
        public static void createMap()
        {
            // create the Map object,
            // refer to the Map constructor
            Map theMap = new Map(MAX_ROW, MAX_COL);
            
            // create a string that will go in the Location objects
            // that contain the river
            String river = "You are on the River. The river is the source\n" +
                            "of life for our city. The river marks the eastern\n " +
                            "boundary of the city - it is wilderness to the East.\n";
            // create a new Location object
            Location loc = new Location();

            // use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
            
            // set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 4, loc);
            }
            
            
            
            // define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            theMap.setLocation(0, 2, loc);
            
            
            
            // define the string for a Wheat Field location
            String wheatField = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a Wheat Field location with a hint
            loc = new Location();
            loc.setDescription(wheatField + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("|||");
            theMap.setLocation(0, 1, loc);
            
            
            
            // define the string for a granary/storehouse location
            String granary = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a granary/storehouse location with a hint
            loc = new Location();
            loc.setDescription(granary + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("+++");
            theMap.setLocation(0, 3, loc);
            
            
            
            // define the string for a village location
            String village = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a village location with a hint
            loc = new Location();
            loc.setDescription(village + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("^^^");
            theMap.setLocation(1, 2, loc);
            
            
            
            // define the string for a ruler's court location
            String court = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a ruler's court location with a hint
            loc = new Location();
            loc.setDescription(court + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("###");
            theMap.setLocation(1, 3, loc);
                
            
            
            // define the string for a undeveloped land location
            String undeveloped = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a ruler's court location with a hint
            loc = new Location();
            loc.setDescription(undeveloped + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("___");
            theMap.setLocation(0, 0, loc);
            
            
            
            // define the string for a desert location
            String desert = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a desert location with a hint
            loc = new Location();
            loc.setDescription(desert + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("_!_");
            theMap.setLocation(3, 0, loc);
            
            
            
            // define the string for a lamanites land location
            String lamanites = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a lamanites land location with a hint
            loc = new Location();
            loc.setDescription(lamanites + “\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("%%%");
            theMap.setLocation(4, 2, loc);
            
            theGame.setMap(theMap);
            
            displayMap();
        }

    private static void displayMap() {
        
    }
        

        
        
}


