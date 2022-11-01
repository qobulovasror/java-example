// a,b,c sonlar berilgan. Jumlani rostlikka tekshiring 
//"tomonlari a,b,c bo'lgan uchburchak yasash munkun"
import java.util.Scanner;
public class math20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();

        boolean a = A+B>C && A+C>B && B+C>A;

        System.out.print("Javob: " + a );

    }
}
