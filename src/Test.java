import java.util.Scanner;

public class Test {


    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

        int tempAnswer = a;
    for (int j = 0; j < a; j++) {
        tempAnswer += (int) (Math.pow(2.0, j) * b);
        System.out.print(tempAnswer + " ");
    }        }
        in.close();
    }
}