import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size, amount, i, count;
    int[] denominations;
    
    System.out.print("Enter the size of currency denominations: ");
    size = sc.nextInt();
    
    denominations = new int[size];
    System.out.println("Enter the currency denominations value: ");
    for (i = 0; i < size; i++) {
      denominations[i] = sc.nextInt();
    }
    
    System.out.print("Enter the amount you want to pay: ");
    amount = sc.nextInt();
    
    System.out.println("Your payment approach in order to give min no of notes will be");
    for (i = size - 1; i >= 0; i--) {
      if (amount >= denominations[i]) {
        count = amount / denominations[i];
        System.out.println(denominations[i] + ":" + count);
        amount = amount % denominations[i];
      }
    }
    }
    }