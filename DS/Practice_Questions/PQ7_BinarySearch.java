package DS.Practice_Questions;

public class PQ7_BinarySearch {
    
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid + 1;  // search right half
            }
            else{
                end = mid - 1;    // search left half
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 6, 7, 8, 9, 9, 10, 25, 26}; // array should be sorted.
        int key = 8;
        System.out.println("Using BS, Element found at index position: "+binarySearch(arr, key));
    }
}
