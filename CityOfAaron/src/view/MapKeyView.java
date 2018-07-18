/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import static view.MainMenuView.displayHelpMenuView;

/**
 *
 * @author Tiffany Romrell
 */
public class MapKeyView extends MenuView {

    /**
     * The mapKeyView method
     * Purpose: display map key and get descriptions of the different places
     * parameters:none
     * Returns: none
     */
    public MapKeyView() 
    {
    super("\n" +
        "*********************************\n" +
        "*            Map Key            *\n" + 
        "*********************************\n" +
        " 1: River - ~~~\n" +
        " 2: Farmland - !!!\n" +
        " 3: Granary - +++\n" +
        " 4: Village - ^^^\n" +
        " 5: Ruler's Court - ###\n" +
        " 6: Undeveloped Land - _!_\n" +
        " 7: Desert - ___\n" +    
        " 8: Lamanites Land - %%%\n" +
        " 9: Return to game menu\n",
        9);
    }

    @Override
    public void doAction(int option) {
        switch (option)
       {
           case 1: // Show river key and get description
               river();
               break;
           case 2: // Show farmland key and get description
               farmland();
               break;
           case 3: // Show granary key and get description
               granary();
               break;
           case 4: // Show village key and get description
               village();
               break; 
           case 5: // Show ruler's court key and get description
               rulersCourt(); 
               break;
           case 6: // Show undeveloped land key and get description
               undeveloped();
               break;
           case 7: // Show desert key and get description
               desert();
               break;
           case 8: // Show lamanites land key and get description
               lamanites();
               break;
           case 9: // Show river key and get description
               break;
               
       }
    }

    
    
    
    // get descriptions for different parts of the map
    private void river() {
        System.out.println("You are on the River. The river is the source\n" +
                            "of life for our city. The river marks the eastern\n " +
                            "boundary of the city - it is wilderness to the East.\n");
    }

    private void farmland() {
         System.out.println("You are on the fertile banks of the River.\n" +
                "In the spring, this low farmland floods and is covered with rich\n" +
                "new soil. Wheat is planted as far as you can see.");
    }

    private void granary() {
         System.out.println("You are on the granary/storehouse for wheat.\n" +
                "Once you have harvested your fields you may store them here.\n" +
                "Making sure that you have enough wheat will be beneficial.");
    }

    private void village() {
         System.out.println("You are on the busy streets of the village.\n" +
                "Many people live here as well as more who are moving in.\n" +
                "It's great to see all the village folk going about their day.");
    }

    private void rulersCourt() {
         System.out.println("You are on the Ruler's Court. From here you can\n" +
                "check on the status of your people and the fields that you own.\n" +
                "Be proud of the your people and the effort that they put in.");
    }

    private void undeveloped() {
         System.out.println("You are on the Undeveloped part of the land.\n" +
                "Making this into fertile land full of life is your job.\n" +
                "Now that you know the location, what will you do with it?");
    }

    private void desert() {
         System.out.println("You are on the barren land of the desert.\n" +
                "This is a no mans land where many people have been lost.\n" +
                "Do you dare to venture out with only your faith?");
    }

    private void lamanites() {
         System.out.println("You are on the land of the lamanites.\n" +
                "It will be treterous to set foot in this area. It may be\n" +
                "the only place to find what you need though.");
    }
    
    
    
}
