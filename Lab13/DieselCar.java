public class DieselCar extends Car {
   protected DieselCar() { }
   
   public DieselCar(String make, String model, String year) {
      super(make, model, year);
   }
   
   public void refuel() {
      System.out.println("Just filled up the tank with low-sulphur diesel");
   }
   
   public void completeOilChange() {
      System.out.println("Changed oil on " + this);
   }

   
}