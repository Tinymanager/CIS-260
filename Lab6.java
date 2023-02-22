
public class Lab6 {
    public static void main(String[] args) {
        int num = 1;
        Boolean cond = false;
        int i = 1;
        int rem = 0;
        int count = 0;

        while (!cond){//num
            for (i=1; i<=20; i++){//i
                System.out.println(num + "/" + i + "" + ", rem " + num%i);
                rem = num%i;
                if (rem > 0){
                    break;
                }
                if (rem == 0){
                    count = count+1;
                }
            }
            if (count == 20){
                cond = true;
            } else {
                count = 0;
            }
            i=0;
            num++;
        }
    }
}

