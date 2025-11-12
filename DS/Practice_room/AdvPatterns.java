package DS.Practice_room;
public class AdvPatterns {

    static void InvRotHalfRectPattern(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print("@ ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.err.println();
        }
    }
    static void InvRotHalfNumRectPattern(){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.err.println();
        }
    }
    static void floydsTriangle(){
        int cnt =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(cnt+" ");
                cnt++;
            }
            
            System.out.println();
        }
    }
    static void callByValue(int copy){
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b:"+b);
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a+",b:"+b);
        copy = 10;
        System.out.println(copy);
    }
    static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int c=1;c<=2*(n-i);c++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int mirror=1;mirror<=i;mirror++){
                System.out.print("* ");
            }
            for(int j=2*(n-i);j>=1;j--){
                System.out.print( "  ");
            }
            for(int mirror=1;mirror<=i;mirror++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void rombus(int n){
        for(int i=1;i<=n;i++){
            // space n-i
            for(int space=n-i;space>=1;space--){
                System.out.print("  ");
            }
            
            //rombus star
            for(int star=1;star<=n;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void hollowRombus(int n){
        for(int i=1;i<=n;i++){
            // space n-i
            for(int space=n-i;space>=1;space--){
                System.out.print("  ");
            }
            
            //rombus star
            for(int star=1;star<=n;star++){
               if((star == 1 || star==n) || (i==1 || i==n)){
                    System.out.print("* ");
               }else{
                    System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
    static void diamond(int n){
        
        for(int row=1;row<=n;row++){
            // space 
            for(int col=n-row;col>=1;col--){
                System.out.print("  ");
            }
            // star
            for(int col2=1;col2<=(2*row)-1;col2++){
                System.err.print("* ");
            }
            System.out.println();
        }
        //second half mirror
        for(int row=n;row>=1;row--){
            // space 
            for(int col=n-row;col>=1;col--){
                System.out.print("  ");
            }
            // star
            for(int col2=1;col2<=(2*row)-1;col2++){
                System.err.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // InvRotHalfRectPattern();
        // InvRotHalfNumRectPattern();
        // floydsTriangle();
        // int copy = 5;
        // callByValue(2); // value == copy
        // System.err.println(copy); //call by reference is original value.
        // butterfly(4);
        // rombus(7);
        // hollowRombus(6);
        diamond(5);

    }
}
