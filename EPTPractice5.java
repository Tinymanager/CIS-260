import java.util.Scanner;
public class EPTPractice5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String words = input.nextLine();
        words.toLowerCase();
        boolean returnedval = false;
        for (int i=0; i<words.length(); i++){
            // char CTEMP = words.charAt(i);
            returnedval = isVowel(words.charAt(i));
            System.out.println("Is the character " + words.charAt(i) + " is a vowel?: " + returnedval);
        }
    }

    public static boolean isVowel(char TEMP){
        
    if (TEMP == 'a' || TEMP == 'e' || TEMP == 'i' || TEMP == 'o' || TEMP == 'u'){
            return true;
        }
        return false;
    }
}
