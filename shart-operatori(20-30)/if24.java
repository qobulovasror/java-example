// A,B sonlar berilgan. A va B teng sonlar bo'sa 0 o'zlashtirsin
//Aks holda ikkalasini yig'indisini o'zlashtirsin 
import java.util.Scanner;
public class if24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        A=B = (A==B)? 0: A+B;
        System.out.print("Javob: " + A + " " + B );
    }
}
