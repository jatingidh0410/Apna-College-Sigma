package DS.Practice_Questions;

import java.util.Arrays;

public class PQ11_Sorting {
    public static void BubbleSort(int arr1[]){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr1.length-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
            
        }
        System.out.print(Arrays.toString(arr1));
    }
    public static void SelectionSort(int arr1[]){
        for(int i=0;i<arr1.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[j]<arr1[minPos]){
                    minPos = j;
                }
            }
            int temp = arr1[minPos];
            arr1[minPos] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("Selection Sort:"+ Arrays.toString(arr1));
            
    }
    public static void InsertionSort(int arr1[]){
        for(int i=1;i<arr1.length;i++){
            int curr = arr1[i];
            int prev = i-1;
            while(prev >=0 && arr1[prev] > curr){
                arr1[prev+1] = arr1[prev];
                prev--;
            }
            arr1[prev+1] = curr;
        }
        System.out.print("Insertion Sort:"+Arrays.toString(arr1));
    }
    public static void InbuildSort(int arr1[]){
        Arrays.sort(arr1);
        System.out.print("Inbuild Sort: (nlogn) "+Arrays.toString(arr1));
    }
    public static void CountingSort(int arr1[]){
        // we use this only when are no range is no too big 
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            largest = Math.max(largest, arr1[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]++;
        }
        // sorting.
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr1[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.print("Counting Sort:"+Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int arr1[] = {5,4,1,3,2};

        // BubbleSort(arr1);
        // InbuildSort(arr1);
        CountingSort(arr1);
    }
}
