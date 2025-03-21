import java.util.Scanner; //declaring scanner class package//

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner class for taking inputs from user//

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];  //declaring array for taking list of numbers from user//

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); //taking input//
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the elements in the array is: " + sum);
        scanner.close();
    }
} 
    

