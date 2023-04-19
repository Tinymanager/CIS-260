public abstract class Car {
   protected String make;
   protected String model;
   protected String year;
   
   protected Car() { }
   
   public Car(String make, String model, String year) {
      this.make = make;
      this.model = model;
      this.year = year;
   }
   
   public String getMake() {
      return make;
   }
   
   public String getModel() {
      return model;
   }
   
   public String getYear() {
      return year;
   }
   
   // No setter methods. Why?
   
   // Other methods
   
   public  void refuel() {
      System.out.println("Done");
   }
   
   public abstract void completeOilChange() throws NoOilPanException;// task 2.1 fix the signature
         
   public String toString() {
      return year + " " + make + " " + model;
   }
}