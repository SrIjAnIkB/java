import java.util.Scanner;
public class palindrome {
 public static void main(String args[]) {
 Scanner in = new Scanner(System.in);
 int r, sum = 0, temp;
 int n = in.nextInt();
 temp = n;
 while (n > 0) {
 r = n % 10;
 n = n / 10;
sum = (sum * 10)+r;
 }
 if(temp==sum)
 System.out.println(sum+" is palindrome number");
 else
 System.out.println(sum+" is not palindrome number");
 }
}