// kiritilgan n sonni N!! ikkilangan faktoriyalini topish
import java.util.Scanner;
public class metod49 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("K: "); int K = in.nextInt();
        
        System.out.println(myFunction(K));
    }
    public static int myFunction(int a){
        int s=1;
        for(int i=1; i<=a; i++){
            s*=i;
        }
        a=1;
        for(int i=1; i<=s; i++){
            a*=i;
        }

        return a;
    }
}

