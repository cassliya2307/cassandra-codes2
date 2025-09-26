public class TaskEight{

public static void main(String[] args){

int sum3 = 0;


int sum = 0;
int count = 1;
int num = 1;
while(count <= 5){

num = num * 4;
sum += num;
count++;

}






int sum2 = 0;
int count2 = 1;
int num2 = 1;
while(count2 <= 5){

num2 = num2 * 8;
sum2 += num2;
count2++;

}

sum3 = sum + sum2;
System.out.print(sum3);

}




}