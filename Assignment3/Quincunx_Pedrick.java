package Assignment3;
import java.util.Scanner;

public class Quincunx_Pedrick {
    public static void main(String[] args) {
        //Ask user for number of balls and number of slots
        //Simulate the path of each ball by printing its path
        //Use an array for the slots at the bottom
        //The number of rows of nails is (numberofslots-1)
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of slots");
        int numofSlots = input.nextInt();
        int[] slots = new int[numofSlots];
        System.out.println("Please enter the number of balls");
        int ballcount = input.nextInt();
        int nailrowcount = (numofSlots-1);

        for (int i=0; i<ballcount; i++){
            int endingslot = BallPath(nailrowcount);
            slots[endingslot]++;
        }
        System.out.println(" ");
        printingSlots(slots, numofSlots);
    }

    public static int BallPath(int nailscount){
        System.out.println(" ");
        System.out.println("Sending down a new ball");
        //ball has a 50% for going right or left each hit
        int location = 0;
        //nails count is the number of rows
        for (int i=0; i<nailscount; i++){
            //50% chance of L or R
            double direction = Math.random();
            if (direction > 0.5){ //right
                location = location + 1;
                System.out.print("R");
            } else if (direction < 0.5){//left
                System.out.print("L");
            } else if (direction == 0.5){//Just in case
                direction = Math.random();
                if (direction > 0.5){ //right
                    location = location + 1;
                    System.out.print("R");
                } else if (direction < 0.5){//left
                    System.out.print("L");
                }
            }
        }

        return location;
    }


    public static void printingSlots(int[] slots, int slotcount) {
        for (int i = slotcount; i >0; i--) {
            for (int slot : slots) {
                if (slot >= i) System.out.print("O");   //prints for each ball in the slot
                else System.out.print(" ");     //prints nothing in that slot if there is no ball
            }
            System.out.println();
        }
    }
}

