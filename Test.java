public class Test {
    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int xpos = 3;
        int ypos = 3;

        field[0][0]=0;
        field[1][0]=1;
        field[2][0]=0;

        System.out.println(field[1][0]);

        int x = 0;
        int y = 0;
        int max = 25;
        for (int i=0; i<max; i++){
            System.out.println(field[x][y]);
        }
    }
}
