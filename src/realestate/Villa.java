package realestate;

public class Villa extends Property {
 
     private boolean hasSwimmingPool;
    
     
    private int adjacentStreets;

    public Villa(double area, int rooms, String neighborhood, double price, boolean hasSwimmingPool, int adjacentStreets) {
       
        super(area, rooms, neighborhood, price);
        
        
        
        this.hasSwimmingPool = hasSwimmingPool;
        
        this.adjacentStreets = adjacentStreets;
    }

    @Override
    public void display() {
     
        System.out.println("villa: ");
       
        System.out.println("area: " + area + ", rooms: " + rooms + ", neighbour: " + neighborhood + ", price: " + price);
      
        
       
        System.out.println("swimming pool:" + hasSwimmingPool + ", street: " + adjacentStreets);
        
    }
}