//m, n o'lchamli massiv berilgan. 
//massiv elemenylarni belgilangan qismini 0 ga tenglashtirish
import java.util.Scanner;
public class array69 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("n:"); int n = in.nextInt();
        System.out.print("m:"); int m = in.nextInt();
        int arr[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int) Math.ceil(Math.random()*9);
            }
        }
        int l=m-1;
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(j>=l){
                    arr[i][j] = 0;
                }
            }
            if(i<n/2){
                l--;
            }else l++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
