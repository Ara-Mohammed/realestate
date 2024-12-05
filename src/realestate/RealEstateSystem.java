package realestate;


public class RealEstateSystem {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();
        

       
        Property villa = new Villa(250, 5, "Tropical Shore", 2_500_000, true, 3);
      
        Property apartment = new Apartment(120, 3, "Downtown", 500_000, 4, true);
      
        
        
        Property furnishedApartment = new FurnishedApartment(85, 2, "Suburbs", 350_000, 4);

      
        agency.addProperty(villa);
        
   agency.addProperty(apartment);
   
        agency.addProperty(furnishedApartment);
        

        
        System.out.println("all properties:");
        agency.displayAllProperties();
        
    agency.removeProperty(1);
    

        System.out.println("properties after:");
       
        
        agency.displayAllProperties();
    }
}