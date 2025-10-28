import java.util.*;
public class PQ3 {

    public void Q1(){
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a val to check whether a number is even or odd:");
        val = sc.nextInt();
        // if((val%2)==0){
        //     System.out.print(val+" is Even");
        // }else{
        //      System.out.print(val+" is Odd");
        // }

        String res = (val % 2 ==0)?"Even":"Odd";
        System.out.println(res); // alsoo called as ternary operator.

        sc.close();
    }
    public void Q2(){
        double temp=103.5;
        if(temp >= 100.00){
            System.out.println("You Have Fever,Take Rest.");
        }else{
            System.out.println("You are Healthy.");
        }
    }
    public void Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1-7 to Choose a Day:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("You Chose Monday");
                break;
            case 2:
                System.out.println("You Chose Tuesday");
                break;
            case 3:
                System.out.println("You Chose Wednesday");
                break;
            case 4:
                System.out.println("You Chose Thursday");
                break;
            case 5:
                System.out.println("You Chose Friday");
                break;
            case 6:
                System.out.println("You Chose Saturday");
                break;
            case 7:
                System.out.println("You Chose Sunday");
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
        sc.close();
    }



    public static void main(String[] args) {
        PQ3 obj = new PQ3();

        // obj.Q1();
        // obj.Q2();
        obj.Q3();
    }
}
