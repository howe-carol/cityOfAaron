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
    private String Player = thePlayer; //not sure?

    public Game() {
    }
    
    

    public String getPlayer() {
        return Player;
    }

    public void setPlayer(String Player) {
        this.Player = Player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.Player);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "Player=" + Player + '}';
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
        if (!Objects.equals(this.Player, other.Player)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
