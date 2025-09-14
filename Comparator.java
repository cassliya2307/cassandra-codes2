import java.util.Scanner;
public class Comparator{
public static void main(String[] args){


Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1 = scanner.nextInt();

System.out.print("Enter second number: ");
int num2 = scanner.nextInt();

if(num1 == num2 && num2 == num1){

System.out.print('0');

}

else if(num1>num2){

System.out.print('1');


}

else if(num2>num1){

System.out.print("-1");

}









}







}