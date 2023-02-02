public class Test {
    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int wxpos = 3;
        int wypos = 3;

        field[0][0]=1;        field[1][0]=11;        field[2][0]=12;        field[3][0]=2;        field[4][0]=0;
        field[0][1]=2;        field[1][1]=21;        field[2][1]=0;        field[3][1]=0;        field[4][1]=0;
        field[0][2]=3;        field[1][2]=31;        field[2][2]=4;        field[3][2]=0;        field[4][2]=0;
        field[0][3]=4;        field[1][3]=41;        field[2][3]=0;        field[3][3]=0;        field[4][3]=0;
        field[0][4]=5;        field[1][4]=51;        field[2][4]=3;        field[3][4]=3;        field[4][4]=3;


        int x = 0;
        int y = 0;
        int max =5;
        int xmax = 4;
        for (int ii=0; ii<max; ii++){
            System.out.print(field[x][y]);
            System.out.print(" ");
            for (int i=0; i<xmax; i++){
                x+=1;
                System.out.print(field[x][y]);
                System.out.print(" ");
            }
            x=0;
            y+=1;
            System.out.println(" ");
        }
    }
}
