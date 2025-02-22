public class pmn {
    // Static variables to store first and last occurrences
    public static int first = -1;
    public static int last = -1;
    
    // Method to find the first and last occurrences of a character
    public static void findOccurance(String str, int idx, char element) {
        // Base case: If the index reaches the length of the string, print the results
        if (idx == str.length()) {
            System.out.println("First occurrence: " + first);  // print first occurrence
            System.out.println("Last occurrence: " + last);    // print last occurrence
            return;
        }

        // Get the current character in the string
        char currChar = str.charAt(idx);

        // If the current character matches the target element
        if (currChar == element) {
            if (first == -1) {
                first = idx; // Set first occurrence if it's not set
            }
            last = idx; // Update last occurrence
        }

        // Recursive call with next index
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        // Call the method to find occurrences of character 'a'
        findOccurance(str, 0, 'a');
    }
}
