// A,B,C sonlar berilgan.Shu sonlar yigindisi eng katta bo'ladigan ikkitasini chiqarish
import java.util.Scanner;
public class if27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();
        int A1,B1,C1;
        A1 = B+C;
        B1 = A+C;
        C1 = A+B;
        int max1 = (A1>B1)? (A1>C1)?A1:C1 : (B1>C1)?B1:C1;
        int max2 = (A1>B1)?    (A1>C1)? (C1>B1)?C1:B1 : (B1>A1)?B1:A1   :    (B1>C1)? (C1>A1)?C1:A1 : (A1>B1)?A1:B1;
        System.out.println("Javob: " + max1 + " " + max2);
    }
}
// 12 9 13
// a1=12
// b1=9
// c1=13
//  max2 =>  (A1>B1)?[
//                 (A1>C1)? { (C1>B1)?C1:B1 }
//                 :{ (B1>A1)?B1:A1 }
//             ]:[
//                 (B1>C1)? { (C1>A1)?C1:A1 }
//                 :{ (A1>B1)?A1:B1 };    
//             }]  

