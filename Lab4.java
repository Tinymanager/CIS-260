import java.util.Scanner;
 
public class Lab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        // Generate random number between 0 and 2 inclusive
        int computerPick = (int) (System.currentTimeMillis() % 3);
        
        // Your program for Rock - Paper - Scissors goes here!
        System.out.println("Please Enter your choice: Rock(0), Paper(1), Scissors(2)");
        int playerPick = input.nextInt();

        if (computerPick==0 && playerPick==0){
            System.out.println("Both chose Rock, it's a draw");
        } else if (computerPick==0 && playerPick==1){
            System.out.println("Computer chose Rock, Player chose Paper, Player wins");
        } else if (computerPick==0 && playerPick==2){
            System.out.println("Computer chose Rock, Player chose Scissors, Player loses");
        } else if (computerPick==1 && playerPick==0){
            System.out.println("Computer chose Paper, Player chose Rock, Player loses");
        } else if (computerPick==1 && playerPick==1){
            System.out.println("Both chose Paper, it's a draw");
        } else if (computerPick==1 && playerPick==2){
            System.out.println("Computer chose Paper, Player chose Scissors, Player wins");
        } else if (computerPick==2 && playerPick==0){
            System.out.println("Computer chose Scissors, Player chose Rock, Player wins");
        } else if (computerPick==2 && playerPick==1){
            System.out.println("Computer chose Scissors, Player chose Paper, Player loses");
        } else if (computerPick==2 && playerPick==2){
            System.out.println("Both chose Scissors, it's a draw");
        } else {System.out.println("Error: incorrect value entered");}

        input.close();

    } // end of main()

} // end of class Lab4