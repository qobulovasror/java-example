// A, B va C sonlar berilgan. Jumlani rostlikka tekshiring "A,B va C sonlar hech bo'lmaganda bittasi musbat"
import java.util.Scanner;
public class math16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();

        boolean a = A>0 || B>0 || C>0;

        System.out.print("Javob: " + a );

    }
}
