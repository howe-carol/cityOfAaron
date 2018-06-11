/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityOfAaron.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author carolhowe
 */
public class Game implements Serializable {   
    
    private String thePlayer;
    private CropData cropData = null;

    public Game() {
    }
    
    public String getThePlayer() {
        return thePlayer;
    }

    public  void setThePlayer(String thePlayer) {
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
        return "Game{" + "thePlayer=" + thePlayer + '}';
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

    public void setThePlayer(Player thePlayer) {
        
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
    * Parameters: a reference to a crop object
    * Returns: none
    */
    public void setCrop(Cropdata offering)
    {
        cropData = offering;
    }

    public void setCropData(CropData cropData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
} 