import java.util.Scanner;
public class array55 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int A[] = new int [n];
        for(int i=0;i<n;i++){
            A[i] = (int) Math.ceil(Math.random()*10);
        }

        for(int i=n-1;i>=0; i--){
            if(A[i]%2==0)
                System.out.println(A[i]);
        }
    }
}
