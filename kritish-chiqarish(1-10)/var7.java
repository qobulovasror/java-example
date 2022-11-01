// A va B berilgan. A*x+B=0  ning javobini topish
import java.util.Scanner;
public class var7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int A = in.nextInt();

        System.out.print("B: ");
        int B = in.nextInt();

        double C = -B/A;
        System.out.print("Javob: " + C);

    }
}

