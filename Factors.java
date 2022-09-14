public class Factors {

  public static void main(String[] args) {

    int number = 100, count = 0;

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
         count ++;
        System.out.print(i + " ");
      }
    }
        System.out.println(" \nTotal number of Factors is "+count);
  }
}