import java.util.Scanner; 
public class Lab2 { 
 public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("How much do you want to invest each month?");
    Double startmoney = input.nextDouble();
    System.out.println("What is your interest rate (percentage)?");
    Double interest = input.nextDouble();
    Double I = interest/100/12;
    Double currentmoney = startmoney * (1 + I);
    int month = 0;

    for (int i=0; i<6; i++){
        month++;
        System.out.println("After " + month + " month, you will have " + currentmoney);
        currentmoney = (startmoney + currentmoney) * (1+I);
    }
    input.close();
 } 
} 