
    public class revstr {
        // Method to print the string in reverse using recursion
        public static void printRev(String str, int idx) {
            if (idx == 0) {
                // Base case: print the first character
                System.out.println(str.charAt(idx));
                return;
            }
            // Print the current character
            System.out.println(str.charAt(idx));
            // Recursive call to print the next character
            printRev(str, idx - 1);
        }
    
        public static void main(String[] args) {
            // Define the string
            String str = "abcd";
            // Start the recursion with the last index of the string
            printRev(str, str.length() - 1); // Corrected 'lenght()' to 'length()'
        }
    }
    