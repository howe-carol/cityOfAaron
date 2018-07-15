/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import byui.cit260.CityOfAaron.model.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author carolhowe
 */

public class ListMenuView extends MenuView {
    
// The List Menu view will provide a list of options

   ListMenuView() {
        super("\n" + 
                   "******************************\n" +
                   "* CITY OF AARON - LIST MENU  *\n" +
                   "******************************\n"+
                   "1. Animals in the storehouse\n" +
                   "2. Tools in the storehouse\n" +
                   "3. Provisions in the storehouse\n" +
                   "4. Authors of this game\n" +
                   "5. Save a Report of Tools\n" +
                   "6. Save a Report of Animals\n" +
                   "7. Quit\n",
        7);
        
   }
     

        @Override public void doAction(int option)
        {
            switch (option)
            {
                case 1: // LIST OF ANIMALES
                    listAnimals();
                    break;
                case 2: // LIST OF TOOLS
                    listTools();
                    break;
                case 3: // LIST OF PROVISIONS
                    listProvisions();
                    break;
                case 4: //LIST TEAM
                    listTeam();
                    break;
                case 5: {
                try {
                    //Save Tool Report
                    toolReport();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ListMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 6:  {
                try {
                    //Save Animal Report
                    animalReport();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ListMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 7: // return to main menu
                    break;
            }
        }

    public void listAnimals() {
        GameControl theGameControl = new GameControl();
        theGameControl.displayAnimalList();
    }

    public void listTools() {
        GameControl theGameControl = new GameControl();
        theGameControl.displayToolList();
    }

    public void listProvisions() {
             System.out.println("list provisions");
    }

    public void listTeam() {
             System.out.println("list team");
    }
    
    /**
     *
     * @author Tiffany Romrell: Individual Lesson 12
     * @throws FileNotFoundException
     */
    public void animalReport() throws FileNotFoundException {
        
        keyboard.nextLine();
        System.out.println("\nPlease enter the file path to save the Animal Report: ");
        String fileName = keyboard.nextLine();
        
        try{
            PrintWriter printWriter = new PrintWriter(fileName);
            Date now = new Date();
            printWriter.println("Animals Report created " + now.toString());
            
            ArrayList<ListItem> listOfAnimals;
            listOfAnimals = GameControl.theGame.getAnimals();
            
            for (int i = 0; i < listOfAnimals.size(); i++) {
                ListItem animal = listOfAnimals.get(i);
                printWriter.println("Animals: " + animal.getName() + ", Quanity: " + animal.getNumber());
            }
            printWriter.close();
            System.out.println("\nAnimal report has been saved.");
            }
        catch(IOException ex){
                System.out.println("Input or Output Error: " + ex.getMessage());
            }
    }
    
    /**
     * @author Benjamin Wood, Individual Assignment Lesson 12
     * @throws FileNotFoundException
     */
    public static void toolReport() throws FileNotFoundException{
        
        //clear the return
        keyboard.nextLine();
        //prompt user
        System.out.println("\nPlease enter the file path to save the Tool Report: ");
        //get user input and assign it a variable name
        String fileName = keyboard.nextLine();
        
        try{
            //start the print writing process
            PrintWriter printWriter = new PrintWriter(fileName);
            //add the date to the first line in the file print
            Date now = new Date();
            printWriter.println("Tools Report created " + now.toString());
            //grab the tool list and create an arraylist
            ArrayList<ListItem> listOfTools;
            listOfTools = GameControl.theGame.getTools();
            //comb through the arraylist and print each line
            for (int i = 0; i < listOfTools.size(); i++) {
                ListItem tool = listOfTools.get(i);
                printWriter.println("Tools: " + tool.getName() + ", Quanity: " + tool.getNumber());
            }
            //clear the buffer
            printWriter.close();
            //prompt user that the file was saved
            System.out.println("\nTool report has been saved.");
            }
        //catch any erros and display to user
        catch(IOException ex){
                System.out.println("Input or Output Error: " + ex.getMessage());
            }
        
    }

   
}