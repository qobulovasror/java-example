// X kg shokalad A so'm va Y kg konfet B so'm turadi.
// 1kg shokalad 1kg konfetdan qancha qimmat turishini toping
import java.util.Scanner;
public class var6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,X,B,Y;
        System.out.print("X kg: "); X = in.nextInt();
        System.out.print("A so'm: "); A = in.nextInt();
        System.out.print("Y kg: "); Y = in.nextInt();
        System.out.print("B so'm: "); B = in.nextInt();
        int C;
        C = A / X - B / Y;
        System.out.print("javob: " + C);

    }
}
