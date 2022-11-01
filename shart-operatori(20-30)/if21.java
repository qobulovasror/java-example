// butun son berilgan. Agar son musbat bo'lsa 1 ga oshirilsin.
// Aks holda o'zgartirilmasin.
import java.util.Scanner;
public class if21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        if(A>0){
            A++;
        }

        System.out.print("Javob: " + A );

    }
}
