package DS.Practice_room;
public class Pattern {
    public void pattern1(){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern2(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        // 0 1 triangle .
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Pattern obj = new Pattern();

        // obj.pattern1();
        // obj.pattern2();
        pattern3(4);
    }
}

