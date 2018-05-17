/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityOfAaron.model;

/**
 *
 * @author carolhowe
 */
public enum TeamMember {
    
    private String name;
    private String title;
    private Point coordinates;
TeamMember(String name, String title, Point coordinates) {
    this.name = name;
    this.title = title;
    this.coordinates = coordinates;
}

}
