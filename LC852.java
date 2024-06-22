public class LC852 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            // Compare mid element with the next element
            if (arr[mid] < arr[mid + 1]) {
                // If mid element is less than next element, peak is to the right
                start = mid + 1;
            } else {
                // If mid element is greater than or equal to next element, peak is to the left or at mid
                end = mid;
            }
        }

        // Start and end will converge at the peak element
        System.out.println(arr[start]);
    }
}
