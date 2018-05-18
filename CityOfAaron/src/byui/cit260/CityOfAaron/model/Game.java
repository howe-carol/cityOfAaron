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

    public Game() {
    }
    
    
    
    
    // private thePlayer = Player; ?

    public String getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(String thePlayer) {
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
    
    
    
} 