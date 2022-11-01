// butun son berilgan. Agar son musbat bo'lsa 1 ga oshirilsin.
// Manfiy bo'sa 2ga kamaytirilsin. 0 ga teng bo'sa 10 o'zlashtirsin.
import java.util.Scanner;
public class if22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        if(A>0){
            A++;
        }else if(A<0){
            A=A-2;
        }else{
            A=10;
        }

        System.out.print("Javob: " + A );

    }
}
