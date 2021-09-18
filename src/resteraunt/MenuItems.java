package resteraunt;

public class MenuItems {
    // class variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    // Constructors
    public MenuItems(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not categorized";
        this.isNew = false;
    }

    public MenuItems(String name, String description, Double price, String Category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }
    // Methods
    // Getters and Setters
    public String getName() {return this.name;}

    public void setName(String name) { this.name = name;}

    public String getDescription() {return this.description;}

    public void setDescription(String description) {this.description = description;}

    public Double getPrice() {return this.price;}

    public void setPrice(Double price) { this.price = price;}

    public String getCategory() { return this.category;}

    public void setCategory(String category) { this.category = category; }

    public Boolean isNew() { return this.isNew; }

    public void setIsNew( Boolean isNew) { this.isNew = isNew; }

    // Other methods
    @Override
    public String toString() {
        // PsuedoCode
        // printOutMenuItem()
        String returnString = "";
        //       print itemName
        returnString += "Item Name: " + this.name + "\n";

        //       print itemDescription
        returnString += "Item Description: " + this.description + "\n";

        //       print itemPrice
        returnString += "Item Price: " + this.price + "\n";

        //       print itemCategory
        returnString += "Item Category: " + this.category + "\n";

        //       print itemIsNew
        returnString += "Item Is New?: " + this.isNew + "\n";

        return returnString;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        // PseudoCode
        // isEqual ( menuItem )
        //    if menuItems is not a menuItem
        if (!(obj instanceof MenuItems)) {
            // return false
            return false;
        }
        MenuItems menuItem = (MenuItems) obj;
        //    if itemName equals menuItems.itemName
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;
        //          and itemDescription equals menuItems.itemDescription
        //          and itemPrice equals menuItems.itemPrice
        //          and itemCategory equals menuItems.itemCategory
        //              then return true
        //          otherwise return false
        else return false;
    }
}
