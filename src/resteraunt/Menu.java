package resteraunt;

import resteraunt.MenuItems;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    // Class variables
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private Date lastUpdated;

    // Constructors
    public Menu() {
        this.lastUpdated = new Date();
    }

    // Methods
    // Getters and Setters
    public ArrayList<MenuItems> getMenuItems() { return this.menuItems; }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {this.menuItems = menuItems; }

    public Date getLastUpdated() {return this.lastUpdated; }

    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated; }
}
