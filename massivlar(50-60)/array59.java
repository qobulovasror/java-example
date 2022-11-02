//n ta elementdan iborat massiv va k son berilgan. 
//K sondan eng yaqin massiv elementini chiqarish
import java.util.Scanner;
public class array59{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printf("n: "); int n = input.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            int t=0;
            // A[i] = (int) Math.round(Math.random()*10);
            t=input.nextInt();
            A[i]=t;
        }
        int max = 0;
        for(int i=0;i<n;i++){
            int max1=0;
            for(int j=0;j<n;j++){
                if(A[i]==A[j])
                    ++max1;
            }
            if(max1>max)
                max=max1;
        }

        System.out.println(max);
        for(int i=0;i<n;i++){
            printf(A[i]+" ");
        }
        
     
    }
    public static void printf(String param){
        System.out.print(param);
    }
    public static void printf(int param){
        System.out.print(param+" ");
    }
}
