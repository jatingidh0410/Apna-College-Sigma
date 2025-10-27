import java.util.*;

public class PQ1 {

    public void averageOf3Num() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Value: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Value: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Value: ");
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("Average of " + a + ", " + b + ", and " + c + " is: " + average);

        sc.close();
    }
    public void areaOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a Square: ");
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("Area of side is: "+area);
        

        sc.close();
    }
    public void totalCost(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount for Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the amount for Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the amount for Eraser: ");
        float eraser = sc.nextFloat();
        float gst = (pencil+pen+eraser)*0.18f;
        float totalAmt = (pencil+pen+eraser)+gst;
        System.out.println("Total Bill is :"+totalAmt);
        sc.close();
    }
    public void typePromotion(){
        byte b = 4;
        char c ='a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b) + (i*c) + (d*s);
        System.out.println(result);
    }
    public static void main(String[] args) {
        // Create an object of PQ
        PQ1 obj = new PQ1();

        // obj.averageOf3Num();
        // obj.areaOfSquare();
        // obj.totalCost();
        obj.typePromotion();

        int $ = 24;
        System.out.println($); // so yes $ and _ can be used as variable and it wont give an error

    }
}
