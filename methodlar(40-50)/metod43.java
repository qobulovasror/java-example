// ikkita sonn o'rta geometrigini hisoblovchi funksiya tuzing
import java.util.Scanner;
public class metod43 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int a = in.nextInt();
        System.out.print("B: "); int b = in.nextInt();
        
        System.out.println(myFunction(a, b));
    }
    public static int myFunction(int a, int b){
        return (int) Math.sqrt(a*b);
    }
}