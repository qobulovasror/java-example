//n son berilgan. 1^n + 2^n-1 + ... + n^1
import java.util.Scanner;
public class while38 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        double l=2;
        int k=1;
        while (n!=l) {
            ++k;
            l = Math.pow(2, k);
        }
        System.out.println(k);
    }
}