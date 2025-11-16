package DS.Practice_Questions;

public class PQ9_FindPairs {
    
    public static void findPairs(int arr[]){
        int pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total count of pairs is:"+pairs);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        findPairs(arr);
    }
}
