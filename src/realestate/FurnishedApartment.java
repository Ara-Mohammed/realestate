package realestate;


public class FurnishedApartment extends Property {
   
    private int furnitureQuality;

    public FurnishedApartment(double area, int rooms, String neighborhood, double price, int furnitureQuality) {
       
        super(area, rooms, neighborhood, price);
      
        
        this.furnitureQuality = furnitureQuality;
    }
    

    
    @Override
    
    public void display() {
        System.out.println("apartment with furniture:");
        System.out.println("area: " + area + " rooms:" + rooms + ", neighbour: " + neighborhood + " price:" + price);
      
        
        System.out.println("furnitures: " + furnitureQuality + " (1=the best 5=the worst)");
    }
}