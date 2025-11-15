package DS.Practice_Questions;

public class PQ6_LargestNumber {

    public static int largestNum(int arr[]){
        int highest = Integer.MIN_VALUE; // this is -infinity.
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            // same TC O(n)
            if(arr[i]>highest){
                highest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Value is: "+smallest);
        return highest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,6,25,7,8,9,10,26,9};
        System.out.println("Largest value in this array is: "+largestNum(arr));
        

    }
}
