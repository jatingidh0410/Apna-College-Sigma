// import java.io.Console;
import java.util.*;
public class JavaBasics{
    public void samplePrint(){
         System.out.println("Hello This is Day 1 of Learning DSA");
        System.out.print("Hello Jatin using \\n  \n"); // \n can be used
        System.out.println("To print to next line"); // println can also be used.

        int a =22;
        String b ="Jatin";
        System.out.println("My name is " + b + " and age is " + a);
    }
    public void areaOfRectangle(){
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle: ");
        a = sc.nextFloat();
        System.out.print("Enter the width of Rectangle: ");
        b = sc.nextFloat();
        System.out.println("Area of Rectangle: "+(a*b));

        sc.close();
    }
    public static void main(String[] args) {
       JavaBasics obj = new JavaBasics();

    //    obj.samplePrint();
    //    obj.areaOfRectangle();
    

    }
}