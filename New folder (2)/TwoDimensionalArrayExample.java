public class TwoDimensionalArrayExample {
    
        public static void main(String[] args) {
            // Create a 2D array
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Print the array
            System.out.println("The 2D array is:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }
    
}
