package DS.Practice_room;

import java.util.Arrays;

public class Sorting {
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
        
    }
    public static void main(String[] args) {
        int arr1[] = {5,4,1,3,2};

        // BubbleSort(arr1);
        SelectionSort(arr1);

    }
}
