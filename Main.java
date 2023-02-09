import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int size, targetCount, target;
int[] transactions;
int sum;

System.out.print("Enter the size of transaction array: ");
size = sc.nextInt();

transactions = new int[size];
System.out.println("Enter the values of array: ");
for (int i = 0; i < size; i++) {
  transactions[i] = sc.nextInt();
}

System.out.print("Enter the total no of targets that needs to be achieved: ");
targetCount = sc.nextInt();

while (targetCount-- > 0) {
  sum = 0;
  System.out.print("Enter the value of target: ");
  target = sc.nextInt();

  for (int i = 0; i < size; i++) {
    sum += transactions[i];
    if (sum >= target) {
      System.out.println("Target achieved after " + (i + 1) + " transactions");
      break;
    }
  }
  if (sum < target) {
    System.out.println("Given target is not achieved");
  }
}
}
}
