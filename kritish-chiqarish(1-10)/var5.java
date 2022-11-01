// x ning qiymati berilganda y= 3x^6-6x^2-7 ning qiymatini toping

import java.util.Scanner;
import java.lang.Math;
public class var5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("x= ");
        int x = in.nextInt();
        float resoult = (float) (3*Math.pow(x,6)-6*Math.pow(x,2)-7);
        System.out.print("y="+resoult);
    }  
}