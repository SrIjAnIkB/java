import java.util.*;
public class Avgposneg {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double array[]=new double [10];
for(int i=0;i<array.length;i++){
array[i]=sc.nextInt();
}
double sum=0;
double sum1=0;
double count=0;
double count1=0;
for(int j=0;j<array.length;j++){
if(array[j]>0){
count++;
sum+=array[j];
}
else{
count1++;
sum1+=array[j];
}
}
System.out.println(“Average of positive numbers: “+(sum/count));
System.out.println(“Average of negative numbers: “+(sum1/count1));
}

}

