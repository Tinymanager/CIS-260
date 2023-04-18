package EPTPractice4;
import java.util.Arrays;

public class EPTsort {
    public static void MinMaxSort(int[] a){
        Arrays.sort(a);
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void arrayComparison(int[] a, int[] b){
        int[] highestArray = new int[a.length];
        for (int i=0; i<a.length; i++){
            int MAXTEMP = 0;
            int ATEMP = a[i];
            int BTEMP = b[i];
            if (ATEMP > BTEMP){
                MAXTEMP = ATEMP;
            } else if (BTEMP > ATEMP){
                MAXTEMP = BTEMP;
            }
            highestArray[i] = MAXTEMP;
        }
        for (int i=0; i<highestArray.length; i++){
            System.out.print(highestArray[i] + " ");
        }
    }
}
