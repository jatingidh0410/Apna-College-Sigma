package DS.Practice_room;


public class prefixSuffix {

    static void PrefixAdd(){
        int a[]= {10,5,3,7,1,8,20,30};
		 int n = a.length;
 
		 int prefix[]= new int[n];
		 prefix[0]= a[0];
		 for( int i=1;i<n;i++)
		 {
		 	prefix[i]= prefix[i-1]+a[i];
		 }
		 for( int i=0;i<n;i++){
			System.out.print( prefix[i]+ " ");
	    }   
    }
    static void PrefixMax(){
        int a[] = {5,2,3,10,1};
        int n = a.length;
        int pmax[] = new int[n];
        pmax[0] = a[0];
        for(int i=1;i<n;i++){
            pmax[i] = Math.max(pmax[i-1], a[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(pmax[i]+" ");
        }

    }
    static void Suffix() {
    int a[] = {10, 4, 7, 40};
    int n = a.length;
    int suffix[] = new int[n];
    // last element stays the same
    suffix[n-1] = a[n-1];
    // fill suffix sums from right to left
    for (int i = n - 2; i >= 0; i--) {
        suffix[i] = a[i] + suffix[i + 1];
    }
    // print result
    for (int i = 0; i < n; i++) {
        System.out.print(suffix[i] + " ");
    }
}
    static void SuffixMax() {
    int a[] = {10, 4, 7, 40};
    int n = a.length;
    int suffixMax[] = new int[n];
    
    // The last element is the same as in the original array
    suffixMax[n - 1] = a[n - 1];
    
    // Build suffix maximum array from right to left
    for (int i = n - 2; i >= 0; i--) {
        suffixMax[i] = Math.max(a[i], suffixMax[i + 1]);
    }
    
    // Print result
    for (int i = 0; i < n; i++) {
        System.out.print(suffixMax[i] + " ");
    }
}

    public static void main(String[] args) {
        // PrefixAdd();
        // PrefixMax();
        Suffix();
        SuffixMax();
    }
}
