import java.util.*;

public class PQ {

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

    public static void main(String[] args) {
        // Create an object of PQ
        PQ obj = new PQ();

        obj.averageOf3Num();
    }
}
