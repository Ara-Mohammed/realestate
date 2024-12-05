package realestate;


public abstract class Property {
    
    protected double area;
    protected int rooms;
    protected String neighborhood;
    protected double price;

    public Property(double area, int rooms, String neighborhood, double price) {
     this.area =area;
        this.rooms = rooms;
        
        this.neighborhood =neighborhood;
        
      this.price =price;
    }

    public abstract void display();
}