public class AutoGarage {
   public AutoGarage() {
      System.out.println("Welcome to the auto garage");
   }
   
   public void fullService(Car c) {
      this.rotateTires(c);
      this.changeOil(c);
      c.refuel();
   }
   
   public void rotateTires(Car c) {
      System.out.println("Rotating tires on a " + c);
   }
      
   public void changeOil(Car c) {
      /*try {
         this.changeOil(c);
      } catch (Exception e) {
         System.out.println(e);
      }*/
      // task 3: put this next line in a try..catch block
      try {
         c.completeOilChange();
      } catch (Exception e) {
         System.out.println(e.toString());
      }
   }
}