package Assignment1;
public class ArrayTest {
    public static void main(String[] args) {
        int[][] Array = {
            {3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8}
            };

        int maxnumber = Array[0][0];
        for(int i=0; i<Array.length; i++){
            for (int j=0; j<Array[i].length; j++){
                if (Array[i][j] > maxnumber){
                maxnumber = Array[i][j];
                }
            }
        }
        System.out.println(maxnumber);

        int rownumber = 0;
        int min = Array[0][0];
        int j = 2;
        for (int i=0; i<Array.length; i++){
            if (Array[i][j] < min){
                min = Array[i][j];
                rownumber = i;
            }
        }
        System.out.println(rownumber);
    }
}
