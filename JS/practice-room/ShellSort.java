package bvimit.org;
import java.util.*;

public class ShellSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Shell Sort
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Instead of nested for, use while with if-else checks
                while (j >= gap) {
                    if (arr[j - gap] > temp) {
                        arr[j] = arr[j - gap]; // shift element
                        j -= gap;
                    } else {
                        break; // no need to compare further
                    }
                }
                arr[j] = temp;
            }
        }

        // Output sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
