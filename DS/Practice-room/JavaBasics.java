// import java.io.Console;
import java.util.*;
public class JavaBasics{
    public void samplePrint(){
         System.out.println("Hello This is Day 1 of Learning DSA");
        System.out.print("Hello Jatin using \\n  \n"); // \n can be used
        System.out.println("To print to next line"); // println can also be used.

        // we also covered inputs,typeconversion and type casting;


        int a =22;
        String b ="Jatin";
        System.out.println("My name is " + b + " and age is " + a);
    }
    public void dataTypes(){ 
        byte b = 8;
        System.out.println("Byte value: " + b);

        char ch = 'J';
        System.out.println("Char stores a single character: " + ch);

        boolean var = true;
        System.out.println("Boolean stores true or false: " + var);

        float fl = 8.0333f;
        System.out.printf("Float stores floating values with precision: %.2f%n", fl);

        // Other primitive types: int, long, double, short
        int num = 25;
        long bigNum = 123456789L;
        double dbl = 45.6789;
        short sh = 300;
        System.out.println("Int: " + num + ", Long: " + bigNum + ", Double: " + dbl + ", Short: " + sh);

        // Type casting example
        float a = 99.99f;
        int marks = (int) a; // explicit type casting
        System.out.println("Explicit type casting from float to int: " + marks);
    }
    public void sumOf2Num(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Value: ");
        int value1 = sc.nextInt();
        System.out.print("Enter the Second Value: ");
        int value2 = sc.nextInt();
        int Sum = value1+value2;
        System.out.println("Sum of "+value1+ " and "+value2+" is: "+Sum);
        int product = value1*value2;
        System.out.println("Product of "+value1+ " and "+value2+" is: "+product);


        sc.close();
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
    public void areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        float rad = sc.nextFloat();
        float AreaOfCircle = 3.14f*rad*rad;
        System.out.println("Area of the Given Circle is: "+AreaOfCircle);

        sc.close();
    }
    
    public static void main(String[] args) {
       JavaBasics obj = new JavaBasics();

    //    obj.samplePrint();
    //    obj.areaOfRectangle();
    //    obj.dataTypes();
    //    obj.sumOf2Num();
       obj.areaOfCircle();



    }
}