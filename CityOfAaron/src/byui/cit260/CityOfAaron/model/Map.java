/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author Benjamin Wood, Carol Howe, Tiffany Romrell
 */
public class Map implements Serializable {
    private int rowCount;//stores the number of rows
    private int colCount;//stores the number of columns
    private Location[][]locations;//a reference to a 2-dimensinal array
                                  //of Location objects    
    
    /**
     * parameterized Map constructor
     * Purpose: Sets row and column values
     *  and creates an array of Location objects
     * Parameters: row count and column count
     * Returns: none
     */
    public Map(int _rows, int _cols)
    {
        this.rowCount = _rows;
        this.colCount = _cols;

        // create the array of location objects
        this.locations = new Location[_rows][_cols];
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }
    
    
    /**
     * The getLocation method
     * Purpose: returns the location object at the given row and column
     * Parameters: a row and column
     * Returns: a Location object
     */
    public Location getLocation(int row, int col)
    {
        return this.locations[row][col];
    }
    
    /**
    * The setLocation method
    * Purpose: stores a location object at the row and column
    * Parameters: a row and column, and a reference to a location object
    * Returns: void
    */
    public void setLocation(int row, int col, Location _location)
    {
        this.locations[row][col] = _location;
    } 
    
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", locations=" + locations + '}';
    }
}
