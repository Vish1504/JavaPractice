// This is the implementation for binary search using java

// Define the main class and method
Class Main {
    public static void main(String[] args) {
        // Initialize a sorted array
        array arr = [1, 2, 3, 4, 5, 6, 7]

        // Create a Scanner object to read user input
        scanner = new Scanner(System.in)

        // Read the target value from user input
        target = scanner.nextInt()

        // Initialize a boolean variable to track if the target is found
        isFound = false

        // Initialize the start and end pointers for the binary search
        start = 0
        end = length of arr - 1

        // Perform binary search
        While (start <= end) {
            // Calculate the middle index
            middle = (start + end) / 2

            // If the middle element is less than the target, search in the right half
            If (arr[middle] < target) {
                start = middle + 1
            }
            // If the middle element is greater than the target, search in the left half
            Else If (arr[middle] > target) {
                end = middle - 1
            }
            // If the middle element is equal to the target, target is found
            Else If (arr[middle] == target) {
                isFound = true
                // Print the index of the target (1-based index)
                Print "TARGET found at index - " + (middle + 1)
                Break
            }
        }

        // If target is not found after the loop, print not found message
        If (isFound == false) {
            Print "TARGET not found"
        }
    }
}
