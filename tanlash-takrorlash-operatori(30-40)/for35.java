//n son berilgan. S= n^2 + (n+1)^2 + ... + 2n^2
import java.util.Scanner;
public class for35 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int s=0;
        for(int i=0; i<=n; i++){
            s+=Math.pow(n+i, 2);
        }
        System.out.println(s);
    }
}