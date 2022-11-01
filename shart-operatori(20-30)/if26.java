// uchta sonlar berilgan. sonlarning kichigini aniqlash 
import java.util.Scanner;
public class if26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();
        A = (A>B)? (A>C)?A:C : (B>C)?B:C ;
        System.out.print("Javob: " + A );
    }
}

