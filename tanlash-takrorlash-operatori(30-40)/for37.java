//n son berilgan. 1^n + 2^n-1 + ... + n^1
import java.util.Scanner;
public class for37 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int s=0,t=n;
        for(int i=1; i<=n; i++){
            s+=Math.pow(i,t);
            --t;
        }
        System.out.println(s);
    }
}