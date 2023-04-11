import java.util.Scanner;
public class EPTPractice3 {
    
    public static void main(String[] args) {
        //prompt the user to enter the number of students, and each one's name and score.
        //Then display the students with the highest and second-highest score

        //just check the highest grade each time its entered
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int studentNumber = input.nextInt();
        int highestGrade = 0;
        String highestName = "John";
        int secondHighestGrade = 0;
        String secondHighestName = "John";
        String name;
        for (int i=0; i <studentNumber; i++){
            System.out.println("Please enter the name of Student " + (i+1) + " ");
            name = input.next();
            System.out.println("Please enter the grade of Student " + (i+1) + "");
            int grade = input.nextInt();

            int TEMPsecondHighestGrade = 0;
            if (grade > secondHighestGrade){
                TEMPsecondHighestGrade = grade;
            } 
            if (TEMPsecondHighestGrade > highestGrade){
                highestGrade = TEMPsecondHighestGrade;
                highestName = name;
            } else {
                secondHighestGrade = grade;
                secondHighestName = name;
            }

        } 
        System.out.println("The student with the highest score is: " + highestName);
        System.out.println("The student with the second highest score is: " + secondHighestName);
    }
}
