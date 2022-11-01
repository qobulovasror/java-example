// A va B sonlar berilgan. Jumlani rostlikka tekshiring "A >= 10 yoki B<=13"
import java.util.Scanner;
public class math19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: ");
        int A = in.nextInt();

        System.out.print("B: ");
        int B = in.nextInt();

        boolean a = A>=10 || B<=13;

        System.out.print("Javob: " + a );

    }
}
