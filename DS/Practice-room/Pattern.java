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
        //System.out.println("Sample");
    }

    public static void main(String[] args) {
        Pattern obj = new Pattern();

        obj.pattern1();
        obj.pattern2();
    }
}
