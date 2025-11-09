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
    public static void main(String[] args) {
        
        // InvRotHalfRectPattern();
        // InvRotHalfNumRectPattern();
        // floydsTriangle();
        int copy = 5;
        callByValue(2); // value == copy
        System.err.println(copy); //call by reference is original value.

    }
}
