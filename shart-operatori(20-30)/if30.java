// A,B,C sonlar berilgan.Shu sonlar yigindisi eng katta bo'ladigan ikkitasini chiqarish
import java.util.Scanner;
public class if30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        String s = (A==0)? "0 ga teng": (A>0)? (A%2==1)? "Musbat toq son": "Musbat juft son" : (A%2==0)? "Manfiy juft son" : "Manfiy toq son";
        System.out.println("Javob: " +s);
    }
}