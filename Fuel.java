import java.util.Scanner;
public class Fuel{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);


System.out.print("Enter the number of trips driven: ");
int trips = scanner.nextInt();





for(count = 1 ;count <= trips ; count += 1 ){


System.out.print("Enter the number of miles driven" + count + ": ");
int miles = scanner.nextInt();

System.out.print("Enter the number of gallons used" + count + ": ");
int gallon = scanner.nextInt();


double miles2 = miles / gallon;
System.out.print("Miles per gallon is equal to: " + count + miles2);

 double totalMiles += miles;
 double totalGallons += gallon;



}

if (totalGallons > 0){

double averageMiles = totalMiles / totalGallons;
System.out.print("Average miles per gallon for the trips: " + averageMiles);



}

else{
System.out.println("No trips entered! " );




}

}



}