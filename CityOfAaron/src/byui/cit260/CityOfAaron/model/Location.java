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
public class Location implements Serializable{
    
    //class instance variables
    private String description;
    private String symbol;
    
    public Location(String description, String symbol) {
        this.description = description;
        this.symbol = symbol;
    }

    public Location() {
    }
   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + ", symbol=" + symbol + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
