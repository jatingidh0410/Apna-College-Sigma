package DS.Practice_Questions;

public class PQ5_LinearSearch {

    public static int linearSearch(int arr1[],int data){

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]== data){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10,12,14,16};
        // TC is O(n) // because we check the i to n elements :. 
        int key = 10;

        int index = linearSearch(arr1, key);
        if(index == -1){
            System.out.println("Element not found. ");
        }else{
            System.out.println("Element found a index:"+index);
        }
    }
}
