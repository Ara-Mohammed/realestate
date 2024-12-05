package realestate;

public class RealEstateAgency {
    private Property[] properties;
    private int propertyCount;

    public RealEstateAgency() {
        properties = new Property[100];
        propertyCount = 0;
    }

    public void addProperty(Property property) {
        if (propertyCount < 100) {
          
     properties[propertyCount++] = property;
          System.out.println("property added");
       
        
        } else {
            System.out.println("property cant be added because its full");
        }
    }

   
    public void removeProperty(int index) {
        if (index < 0 || index >= propertyCount) {
            
            
            System.out.println("error");
            return;
        }
        for (int i = index; i < propertyCount - 1; i++) {
            properties[i] = properties[i + 1];
        }
       
        
        properties[--propertyCount] = null;
        
        System.out.println("propery removed");
    }

    public void displayAllProperties() {
        if (propertyCount == 0) {
            
            System.out.println("no propertys");
            return;
        }
        for (int i = 0; i < propertyCount; i++) {
            
         
            System.out.println("property " + (i + 1) + ":");
           
            properties[i].display();
            
            System.out.println();
        }
    }
}