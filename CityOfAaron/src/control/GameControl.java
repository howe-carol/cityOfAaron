/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import byui.cit260.CityOfAaron.model.*;
import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import view.GameMenuView;
import view.MapKeyView;



/**
 *
 * @author Benjamin Wood, Carol Howe, Tiffany Romrell
 */
public class GameControl {
    // size of the Locations array
    private static final int MAX_ROW = 8;
    private static final int MAX_COL = 8;

    // reference to a Game object
    public static Game theGame;
    
    
    
    public static void createNewGame(String name)
    {
        // Created the game object. Save it in the main driver file
        theGame = new Game();
        CityOfAaron.setTheGame(theGame);
        
        // create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setName(name);
        theGame.setThePlayer(thePlayer);
        createCropDataObject();
        createMap();
        createAnimalList();
        createToolList();
        //createProvisionList();
        //createTeamList();
    }
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
            animals.add(new ListItem("Cattle", 12));
            animals.add(new ListItem("Donkeys", 3));
            animals.add(new ListItem("Sheep", 7));
            animals.add(new ListItem("Goats", 4));
        
            // Save the animals in the game
            theGame.setAnimals(animals);
        }
        
        public void displayAnimalList() {
            System.out.println("***********************************\n"+
                               "* This is a list of your animals: *\n"+
                               "***********************************");
        for (ListItem animal : theGame.getAnimals()) {
            System.out.println(animal.getName() + ": " + animal.getNumber());
        }
        }
        
        // save a report of animals to file
        //@author Tiffany Romrell: Individual Lesson 12
        public static void saveAnimalReport(String outputLocation){
            ArrayList<ListItem> animals = theGame.getAnimals();
            
            //create BufferedReader object for input file
            try (PrintWriter out = new PrintWriter(outputLocation)) {
                
                //print title and column headings
                out.println("\n\n          Animal Report          ");
                out.printf("%n%-10s%10s", "  Animal  ", "  Quantity  ");
                out.printf("%n%-10s%10s", "        ", "            ");
                
                //print the animal and quantiy of each type
                for (ListItem item : animals){
                    out.printf("%n%-10s%10d", item.getName(), item.getNumber());
                }
            
            //throw exception if there is an error during process
            } catch (Exception e) {
                System.out.println("Oops, there was an error.");
            }
        }
        
 
        
        
        // create the list of tools
        //@author Benjamin
        public static void createToolList()
        {
            ArrayList<ListItem> tools = new ArrayList<ListItem>();
            tools.add(new ListItem("Hammer", 1));
            tools.add(new ListItem("Axe", 1));
            tools.add(new ListItem("Knife", 3));
            tools.add(new ListItem("Shovel", 1));
        
            // Save the animals in the game
            theGame.setTools(tools);
        }
        public void displayToolList() {
            System.out.println("********************************\n"+
                               "*This is a list of your tools: *\n"+
                               "********************************");
        for (ListItem tool: theGame.getTools()) {
        System.out.println(tool.getName() + ": " + tool.getNumber());
            }  
        }
        
        // save a report of tools to file
        //@author Benjamin Wood: Individual Lesson 12
        public static void saveToolReport(String outputLocation){
            ArrayList<ListItem> tools = theGame.getTools();
            
            //create BufferedReader object for input file
            try (PrintWriter out = new PrintWriter(outputLocation)) {
                
                //print title and column headings
                out.println("\n\n          Tool Report          ");
                out.printf("%n%-10s%10s", "  Tool  ", "  Quantity  ");
                out.printf("%n%-10s%10s", "        ", "            ");
                
                //print the tool and quantiy of each type
                for (ListItem item : tools){
                    out.printf("%n%-10s%10d", item.getName(), item.getNumber());
                }
            
            //throw exception if there is an error during process
            } catch (Exception e) {
                System.out.println("Oops, there was an error.");
            }
        }
        
        
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
                theMap.setLocation(i, 7, loc);
            }
            
            
            
            // define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.";
    
            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 6, loc);
            }
            
            
            
            // define the string for a granary/storehouse location
            String granary = "You are on the granary/storehouse for wheat.\n" +
                "Once you have harvested your fields you may store them here.\n" +
                "Making sure that you have enough wheat will be beneficial.";
    
            // set a granary/storehouse location with a hint
            loc = new Location();
            loc.setDescription(granary);
            loc.setSymbol("+++");
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 5, loc);
            }
            
            
            
            // define the string for a village location
            String village = "You are on the busy streets of the village.\n" +
                "Many people live here as well as more who are moving in.\n" +
                "It's great to see all the village folk going about their day.";
    
            // set a village location with a hint
            loc = new Location();
            loc.setDescription(village);
            loc.setSymbol("^^^");
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 4, loc);
            }
            
            
            
            // define the string for a ruler's court location
            String court = "You are on the Ruler's Court. From here you can\n" +
                "check on the status of your people and the fields that you own.\n" +
                "Be proud of the your people and the effort that they put in.";
    
            // set a ruler's court location with a hint
            loc = new Location();
            loc.setDescription(court);
            loc.setSymbol("###");
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 3, loc);
            }
                
            
            
            // define the string for a undeveloped land location
            String undeveloped = "You are on the Undeveloped part of the land.\n" +
                "Making this into fertile land full of life is your job.\n" +
                "Now that you know the location, what will you do with it?";
    
            // set a ruler's court location with a hint
            loc = new Location();
            loc.setDescription(undeveloped);
            loc.setSymbol("_!_");
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 2, loc);
            }
            
            
            
            // define the string for a desert location
            String desert = "You are on the barren land of the desert.\n" +
                "This is a no mans land where many people have been lost.\n" +
                "Do you dare to venture out with only your faith?";
    
            // set a desert location with a hint
            loc = new Location();
            loc.setDescription(desert);
            loc.setSymbol("___");
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 1, loc);
            }
            
            
            
            // define the string for a lamanites land location
            String lamanites = "You are on the land of the lamanites.\n" +
                "It will be treterous to set foot in this area. It may be\n" +
                "the only place to find what you need though.";
    
            // set a lamanites land location with a hint
            loc = new Location();
            loc.setDescription(lamanites);
            loc.setSymbol("%%%");
           
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 0, loc);
            }
            
            
            theGame.setTheMap(theMap);
            
          
        }

        public void displayMap() {
        Map theMap = theGame.getTheMap();
        System.out.println("City of Aaron Map");
        String columns = "";
                
        //print each line (row)
        for(int i = 0; i < 5; i++){
        
            //print columns of each row
            for(int j = 0; j< 8; j++){
            columns += "|" + theMap.getLocation(i, j).getSymbol();
            }
            
            System.out.println(columns + "|");                       
            columns = "";            
        }  
             
        
        // @author Tiffany Romrell
        MapKeyView menu = new MapKeyView();
        menu.displayMenu();

        
        }
        
        /**
         * the setPlayerPosition method()
         * Purpose:  get the Player class, pass the new row and column 
         * from the new location option in the GameMenuView class
         * Parameter:  int row and int col
         * Returns:  none, void
         * @param row
         * @param col
         */
        
        public static void setPlayerPosition(int row, int col){
            //get instance of ThePlayer
            Player player = theGame.getThePlayer();
            //set new location row and col for ThePlayer
            player.setRowPosition(row);
            player.setColPosition(col);
        }
        public static void getPlayerPosition(int rowPosition, int colPosition){
            Player player = theGame.getThePlayer();
            //get current location row and col for ThePlayer
            rowPosition = player.getRowPosition();
            colPosition = player.getColPosition();
        }
           
        /**
        * the getSavedGame method
        * Purpose: load a saved game from disk
        * Parameters: the file path
        * Returns: none
        * Side Effect: the game reference in the driver is updated
        * @param filePath
        */
        public static void getSavedGame(String filePath)
        {
        //Game theGame = null;

        try (FileInputStream fips = new FileInputStream(filePath))
        {
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game) input.readObject();
            CityOfAaron.setCurrentGame(theGame);
        }
        catch(Exception e)
        {
            System.out.println("There was an error reading the saved game file\n");
        }
        }
        
        public static void setSavedGame(String filePath)
        {
            try (FileOutputStream fops = new FileOutputStream(filePath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(theGame);
            output.flush();
            //prompt the user that the game has been saved
            System.out.println("\nYour game was saved.");
        }
        catch(Exception e)
        {
            System.out.println("There was an error while saving game.\n");
        }
        }

    }

        
        



