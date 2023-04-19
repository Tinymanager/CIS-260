public class GarageClient2 {
   public static void main(String[] args) {
      Car car1 = new GasCar("Fiat", "500", "2012");
      Car car2 = new DieselCar("VW", "Golf TDI", "2015");
      
      Car car3 = new ElectricCar("Tesla", "Model 3", "2018");
      
      AutoGarage garage = new AutoGarage();
      
      garage.rotateTires(car1);
      garage.fullService(car2); 
      
      garage.fullService(car3);
   }

}