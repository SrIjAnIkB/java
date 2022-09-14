import java.util.Scanner;
import java.lang.*;
public class SquareCubeOfNum
{
    public static void main(String args[])
    {
        int num,b,c; 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter The Number :\n\n");
        num = sc.nextInt();
 
  b=num*num;
  c=num*num*num;

  System.out.println("\nOutput Is = "+ b +" ,"+ c +"\n\n"); 
 }
}