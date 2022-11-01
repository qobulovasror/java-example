// A son berilgan. Jumlani rostlikka tekshiring "A son ikki xobali juft son"
import java.util.Scanner;
public class math17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();

        boolean a = A>9 && A<100 && A%2==0;

        System.out.print("Javob: " + a );

    }
}
