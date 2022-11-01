// berilga n ta sonning o'rta geometrigini topish
import java.util.Scanner;
public class var10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();

        int s=1,t=0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"-son: ");
            t = in.nextInt();
            s*=t;
        }

        System.out.print("Javob: " + Math.sqrt(s) );

    }
}
