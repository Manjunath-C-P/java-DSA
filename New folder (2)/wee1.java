public import java.util.*;

public class Wee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // Input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " "); // Use print instead of println to stay on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
 {
    
}
