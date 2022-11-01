//n ta elementdan tshkil topgan massivni teskari tartibda chiqarish
import java.util.Scanner;
public class array54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int A[] = new int [5];
        for(int i=0; i<n; i++){
            A[i] = (int) Math.round(Math.random()*10);
        }

        System.out.println("Massiv elementlari: ");
        
        for(int i=0; i<n; i++){
            System.out.println(A[i]);
        }
        System.out.println("Massiv teskari tartibda: ");
        for(int i=n-1; i>=0; i--){
            System.out.println(A[i]);
        }
    }
}
