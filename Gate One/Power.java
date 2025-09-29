import java.util.Scanner;
public class Power{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter base number: ");
int base = scanner.nextInt();

System.out.print("Enter power: ");
int power = scanner.nextInt();

int result = 1;

for(int count = 1; count <= power; count++) {
result = result * base;
}

System.out.println(result);










}



}