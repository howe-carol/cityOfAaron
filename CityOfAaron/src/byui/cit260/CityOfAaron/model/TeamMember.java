/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author carolhowe
 */
public enum TeamMember implements Serializable{
    
    Ben("Ben","He is a worker"),
    Carol("Carol","She is a mom"),
    Tiffany("Tiffany","She is a designer");
    
    private final String name;
    private final String title;
   
    
    
    TeamMember(String name, String title) {
    this.name = name;
    this.title = title;
  

   }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }

 


    
}
