package BinarySearch;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        // Example array for testing
        // int[] arr = {2, 5, 8, 12, 15, 19, 20};
        // int[] arr = {20, 19, 15, 12, 8, 5, 2};
        int[] arr = {};
        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        // Check if the array is empty
        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Determine if the array is sorted in ascending order
        boolean isAsc = arr[0] < arr[n - 1];

        System.out.println("Enter target:");
        int target = sc.nextInt();

        // Check for target out of bounds based on array order
        if (isAsc && target > arr[n - 1]) {
            System.out.println("No ceiling since the target is larger than the largest element in an ascending array");
            return;
        } else if (!isAsc && target < arr[n - 1]) {
            System.out.println("No ceiling since the target is smaller than the smallest element in a descending array");
            return;
        }

        int start = 0, end = n - 1;
        int ceilingIndex = ceiling(arr, start, end, target, isAsc);

        System.out.println("Ceiling = " + arr[ceilingIndex]);
    }

    // Ceiling function to find the smallest element greater than or equal to the target
    private static int ceiling(int[] arr, int start, int end, int target, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("ceiling=target at index " + mid);
                return mid;
            }

            if (isAsc) {
                // For ascending order array
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // For descending order array
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if(isAsc){
            return start;
        }
        else{
            return end;
        }
    }
}
