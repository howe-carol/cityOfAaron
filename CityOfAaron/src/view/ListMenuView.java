/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;




/**
 *
 * @author carolhowe
 */

public class ListMenuView extends MenuView {
    
// The List Menu view will provide a list of options

   ListMenuView() {
        super("\n" + " CITY OF AARON - LIST MENU\n" +
                   "1. Animals in the storehouse\n" +
                   "2. Tools in the storehouse\n" +
                   "3. Provisions in the storehouse\n" +
                   "4. Authors of this game\n" +
                   "5. Quit\n",
        5);
        
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
                case 5: // return to main menu
                    break;
            }
        }

    public void listAnimals() {
             System.out.println("list animals");
    }

    public void listTools() {
             System.out.println("list tools");
    }

    public void listProvisions() {
             System.out.println("list provisions");
    }

    public void listTeam() {
             System.out.println("list team");
    }


   
}