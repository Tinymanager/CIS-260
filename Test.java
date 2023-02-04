import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] field = new int[5][5];
        System.out.println("What x position would you like to start at (1-5)");
        String xpos = input.next();
        System.out.println("What y position would you like to start at (1-5)");
        String ypos = input.next();
        System.out.println("("+xpos+","+ypos+")");

        String position = ypos + xpos;
        int pos = Integer.parseInt(position);


        int x3 = 0;
        int y3 = 0;
        int num = 11;
        int add = 11;
        int mm1 = 5;
        int mm2 = 5;
        for (int i4=0; i4<mm1; i4++){
            for (int i5=0; i5<mm2; i5++){
                field[x3][y3] = num;
                x3+=1;
                num+=1;
            }
            x3=0;
            add += 10;
            num = add;
            y3+=1;
        }

        int xx = 0;
        int yy = 0;
        int m1 = 5;
        int m2 = 5;
        for (int i=0; i<m1; i++){
            for (int iii=0; iii<m2; iii++){
                if(field[xx][yy]==pos){
                    field[xx][yy]=99;
                }
                xx+=1;
            }
            xx=0;
            yy+=1;
        }
        

        int x = 0;
        int y = 0;
        int max = 5;
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
        input.close();
    }
}
