public class EPTPractice2 {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int returned = MaxVal(A);
        System.out.println(returned);
    }

    public static int MaxVal(int[] A){
        int val = 0;
        int max = 0;
        for (int i=0; i<=A.length-1; i++){
            for (int j=0; j<=A.length-1; j++){
                if (A[i] > A[j]){
                    A[i] = val;
                } else {
                    A[j] = val;
                }
            }
        }
        return max;
    } 

}
