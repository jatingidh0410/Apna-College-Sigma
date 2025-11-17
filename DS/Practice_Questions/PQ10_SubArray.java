package DS.Practice_Questions;

public class PQ10_SubArray {
    public static void subArray(int arr1[]){

        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr1.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(+arr1[k]+",");  
                }
                System.out.print(" Subset "+(j+1)+":");
            }
            System.out.println();
        }
    }
    public static void maxSubArray(int arr1[]){
        int currSum=0,maxSum =Integer.MIN_VALUE;
         for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr1.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr1[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum in the sub Array is:"+maxSum);
    }
    public static void maxSubArrayPrefix(int arr1[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr1.length];

        // Calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr1[i];
        }

        // Check all subarrays
        for (int i = 0; i < arr1.length; i++) {
            int start = i;
            for (int j = i; j < arr1.length; j++) {
                int end = j;
                currSum = (i == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Sum in the sub Array is: " + maxSum);
    }
    public static void maxSubArrayKadane(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("Maximum Sum in the subarray is: " + maxSoFar);
    }

    public static void main(String[] args) {
        // int arr1[] ={2,4,6,8,10};
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        // subArray(arr1);
        // maxSubArray(arr1);
        // maxSubArrayPrefix(arr1);
        maxSubArrayKadane(arr);
    }
}
