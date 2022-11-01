// A son berilgan. Jumlani rostlikka tekshiring "A > 2 va A<=3"
import java.util.Scanner;
public class math13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int A = in.nextInt();

        boolean a = A>2 && A<=3;

        System.out.print("Javob: " + a );

    }
}
