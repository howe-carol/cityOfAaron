/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityOfAaron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author carolhowe
 */
public class Game implements Serializable {   
    
    private Player thePlayer;
    private CropData cropData;
    private Map theMap;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provision;

    public Game() {
    }
    
    public Player getThePlayer() {
        return thePlayer;
    }

    public  void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "theMap=" + theMap + ", thePlayer=" + thePlayer + ", cropData=" + cropData + ", animals=" + animals + ", tools=" + tools + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;
    }

       
    /**
    * the getCrops() method
    * Purpose: get a reference to the crop object
    * Parameters: none
    * Returns: a reference to a crop object
    */
    public CropData getCrop()
    {
        return cropData;
    }
    /**
    * the setCrops() method
    * Purpose: store a reference to a crop object
    * @param cropData
    * Parameters: a reference to a crop object
    * Returns: none
    */
    public void setCrop(CropData cropData)
    {
        this.cropData = cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public CropData getCropData() {
        return cropData;
    }

     public Map getTheMap() {
        return theMap;
    } 
        
    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }
    
    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }
    
    
}