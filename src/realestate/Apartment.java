package realestate;

public class Apartment extends Property {
    
    private int floor;
    private boolean hasParking;

   
    public Apartment(double area, int rooms, String neighborhood, double price, int floor, boolean hasParking) {
     
        super(area, rooms, neighborhood, price);
       
        
        this.floor = floor;
        
        this.hasParking = hasParking;
    }

    @Override
    public void display() {
        
        System.out.println("apartment: ");
        
        
        System.out.println("area:" + area + " rooms: " + rooms + " neighbour: " + neighborhood + " price " + price);
        System.out.println("floor: " + floor + " parking: " + hasParking);
    }
}
