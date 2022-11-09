//m, n o'lchamli massiv berilgan. 
//har bir satr elementlari yig;ingisini chiqarish
import java.util.Scanner;
public class array65 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        int arr[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int) Math.ceil(Math.random()*10);
            }
        }
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                l+=arr[i][j];
            }
            l=0;
            System.out.println(l);
        }
    }
}
