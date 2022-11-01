// A, B va C sonlar berilgan. Jumlani rostlikka tekshiring "A<=B<=C"
import java.util.Scanner;
public class math15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();

        boolean a = A<=B && B<=C;

        System.out.print("Javob: " + a );

    }
}
