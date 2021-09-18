package resteraunt;

public class Resteraunt {
    public static void main (String [] args){
        MenuItems item1 = new MenuItems( "Salad",  "delicious Greens", 7.50, "Healthy", true );
        MenuItems item2 = new MenuItems( "Salad",  "delicious Greens", 7.50, "Healthy", true );
        MenuItems item3 = new MenuItems( "Cake",  "delicious Desserts", 5.50, "Unhealthy", true );


        // Test out the tostring method
        System.out.println(item1.toString());

        // Test out the tostring method
        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));


    }
}
