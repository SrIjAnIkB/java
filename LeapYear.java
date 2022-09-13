import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
      int year;
      int month;
      int date;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();
      System.out.println("Enter a month :: ");
      Scanner c = new Scanner(System.in);
      month = c.nextInt();
      System.out.println("Enter date :: ");
      Scanner d = new Scanner(System.in);
      date = d.nextInt();
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}
