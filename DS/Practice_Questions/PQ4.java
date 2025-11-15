package DS.Practice_Questions;
import java.util.Scanner;

public class PQ4 {
    public void Q1(){
        for(int i=0;i<5;i++) {
            System.out.println("Hello");
            i+=2;
        }
    }
    public void Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of integers you want to enter:");
        int size = sc.nextInt();
        int even = 0, odd =0;
        for(int i=1;i<=size;i++){
            System.out.print("Enter the num "+i+":");
            int value = sc.nextInt();
            if(value %2 == 0){
                even += value;
            }else{
                odd += value;
            }
        }
        System.out.println("Sum of even:"+ even +" and Sum of odd:"+odd);

        sc.close();
    }
    public void Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial:");
        int fact = sc.nextInt();
        int ans =1;
        for(int i =1;i<=fact;i++){
            ans *= i;
        }
        sc.close();
        System.out.println("Factorial is:"+ans);
    }
    public void Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get table:");
        int table = sc.nextInt();
        for(int i=1;i<=10;i++){   
            int count = table*i;
            System.out.print(count+" ");
        }
        sc.close();
    }
    public void Q5(){
        for(int i=0;i<=5;i++ ) {
            System.out.println("i = "+i);
        }
        //System.out.println("i after the loop = "+ i ); 
        // as you can see this is wrong in the code. 
        //i is declared in the loop not outside so the scope of i is till the loop itself
    }
    public static void main(String[] args) {
        PQ4 obj = new PQ4();

        obj.Q1();
        // obj.Q2();
        // obj.Q3();
        // obj.Q4();
    }
}
