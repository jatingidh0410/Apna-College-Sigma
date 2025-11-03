package DS.Practice_room;
public class Functions { 
    public static void greet() {
        // Function 1: No return type (void)
        System.out.println("Hello World!!");
    }
    public static int avg(int a, int b,int c) {
        // Function 2: With return type (int)
        return (a+b+c)/3;
    }
    public static boolean isEven(int val){
        return (val % 2 == 0);
    }
    public static void palindrome(int isPal){
        int comp = isPal;
        int num = 0;
        int rem;
        while(isPal > 0){
            rem = isPal%10;
            num = (num*10)+rem;
            isPal = isPal/10;
            
        }
        if(num == comp){
            System.out.println(num+" is a palindrome.");
        }else{
            System.out.println(num+" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        // Notes:
        // - If a function returns something, we specify a data type (e.g., int, String, double)
        // - If not, we use 'void' (no return value)
        // - Functions can be system-defined or user-defined

        greet();          // Calls the greet() function
        int sum = avg(2, 4,0);   // Calls the avg() function and stores result
        System.out.println("Avg: " + sum);

        boolean isEvenOrOdd = isEven(9);
        System.out.println("If True num is even else it is Odd:"+isEvenOrOdd);

        palindrome(121);
    }
}
