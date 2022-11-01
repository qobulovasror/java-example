// A,B,C sonlar berilgan.Shu sonlar yigindisi eng katta bo'ladigan ikkitasini chiqarish
import java.util.Scanner;
public class if28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();
        boolean a = A>B && B>C;
        if(a){
            A=A*2;
            B=B*2;
            C=C*2;
        }else{
            A=-A;
            B=-B;
            C=-C;
        }
        System.out.println("Javob: " + A + " " + B + " "+ C);
    }
}