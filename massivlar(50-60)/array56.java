import java.util.Scanner;
public class array56 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int A[] = new int [n];
        for(int i=0;i<n;i++){
            A[i] = (int) Math.ceil(Math.random()*10);
        }

        for(int i=0;i<n;i+=2){
            System.out.println(A[i]);
        }
    }    
}
