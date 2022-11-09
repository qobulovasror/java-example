//m, n o'lchamli massiv berilgan. 
//massiv ni 90 gradusga burish
import java.util.Scanner;
public class array70 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        int arr[][] = new int[n][m]; 
        int arr2[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int) Math.ceil(Math.random()*9);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
