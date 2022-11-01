// x va y son berilgan. Jumlani rostlikka tekshiring 
//"koordinatalari x,y bo'lgan nuqta birinchi yoki uchunchi chorakda yotadi"
import java.util.Scanner;
public class math14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("X: "); int X = in.nextInt();
        System.out.print("Y: "); int Y = in.nextInt();

        boolean a = (X<0 && Y>0) || (X>0 && Y<0);

        System.out.print("Javob: " + a );

    }
}
