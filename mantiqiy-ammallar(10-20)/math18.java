// uchta son berilgan. Jumlani rostlikka tekshiring 
//"berilgan uchta son hech bo'lmaganda ikkitasi bir-biriga teng"
import java.util.Scanner;
public class math18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();

        boolean a = A==B || A==C || B==C;

        System.out.print("Javob: " + a );

    }
}
