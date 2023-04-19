public class GasCar extends Car {
   protected GasCar() { }
   
   public GasCar(String make, String model, String year) {
      super(make, model, year);
   }
   
   public void refuel() {
      System.out.println("Just filled up the tank with 91 octane gas");
   }
      
   public void completeOilChange() {
      System.out.println("Changed oil on " + this);
   }

}