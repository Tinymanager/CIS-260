public class ElectricCar extends Car {
   protected ElectricCar() { }
   
   public ElectricCar(String make, String model, String year) {
      super(make, model, year);
   }
   
   public void refuel() {
      System.out.println("Just recharged the battery!");
   }
      
   public void completeOilChange() throws NoOilPanException{
      
      // task 2.1 fix the signature
      // task 2: implement this method
      throw new NoOilPanException();
   }

}