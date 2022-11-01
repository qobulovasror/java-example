// Berilgan A va B sonlarning qiymatlarini almashtirib chiqarish

import java.util.Scanner;
public class var2 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("A: ");
        int A = cin.nextInt();
        System.out.print("B: ");
        int B = cin.nextInt();
        int C = A;
        A = B;
        B = C;
        System.out.print("A: " + A + " B: "+ B);
    }
}
