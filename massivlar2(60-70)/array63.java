//m, n o'lchamli massiv va k son berilgan. 
//k satir elimentlarini chiqarish
import java.util.Scanner;
public class array63 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        System.out.print("k:"); int k = in.nextInt();
        int arr[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int) Math.ceil(Math.random()*10);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(k==i+1)
                    System.out.print(arr[i][j]+" ");
            }
        }
        System.out.print("\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
