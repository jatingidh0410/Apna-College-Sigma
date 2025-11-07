package DS.Practice_room;
public class Search {
    static boolean linearSearch(int arr[], int n, int target)
	{
		for( int i=0;i<n;i++)
		{
			if( arr[i]==target)
			{
				return true;
			}
		}
		// if we never find the element in the array
		return false;
	}
    static boolean binarySearch( int arr[], int n, int target)
	{
		int lo=0;
		int hi=n-1;
 
		while(lo<=hi)
		{
			int mid =(lo+hi)/2;
 
			if(arr[mid]< target)
			{
				// we want to search on right side of mid
				lo = mid+1;
			}
			else if( arr[mid]> target)
			{
				// we want to search on left side of mid
				hi = mid-1;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
    public static void main(String[] args) {
        // int arr[]= {10,40,70,80,4,56};
	    //  int n=6;
 
	    //  boolean result1 = linearSearch(arr,n, 4);  // true
	    //  System.out.println(result1);
	    //  boolean result2 = linearSearch(arr,n,99);  // false
	    //  System.out.println( result2);
	    //  boolean result3= linearSearch( arr,n,88); //false
	    //  System.out.println( result3);

        // binary search
        int arr[]= {10,33,44,56,66,77,88,97,112};
 
		 int n = arr.length;
 
		 boolean res1= binarySearch(arr,n,97);  // true
		 System.out.println( res1 );
 
		 boolean res2= binarySearch( arr,n, 25); //false
		 System.out.println( res2);
    }
}
