import java.util.Scanner;
import java.lang.Math;
public class Lab3 {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first x value");
        Double x1 = input.nextDouble();
        System.out.println("Please enter the first y value");
        Double y1 = input.nextDouble();

        System.out.println("Please enter the second x value");
        Double x2 = input.nextDouble();
        System.out.println("Please enter the second y value");
        Double y2 = input.nextDouble();

        System.out.println("Please enter the third x value");
        Double x3 = input.nextDouble();
        System.out.println("Please enter the third y value");
        Double y3 = input.nextDouble();

        Double e1;
        Double e2;
        Double e3;
        e1 = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        e2 = Math.sqrt(((x2-x3)*(x2-x3)) + ((y2-y3)*(y2-y3)));
        e3 = Math.sqrt(((x3-x1)*(x3-x1)) + ((y3-y1)*(y3-y1)));

        if ((e1+e2)>e3 && (e1+e3)>e2 && (e2+e3)>e1){
            Double perimeter = e1 + e2 + e3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        }else {System.out.println("Error: Please enter vertices that create a triangle");}
        input.close();
    }
}