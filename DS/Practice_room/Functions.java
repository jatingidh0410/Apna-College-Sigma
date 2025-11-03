package DS.Practice_room;
public class Functions {
    
    // Function 1: No return type (void)
    public static void greet() {
        System.out.println("Hello World!!");
    }

    // Function 2: With return type (int)
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Notes:
        // - If a function returns something, we specify a data type (e.g., int, String, double)
        // - If not, we use 'void' (no return value)
        // - Functions can be system-defined or user-defined

        greet();          // Calls the greet() function
        int sum = add(2, 4);   // Calls the add() function and stores result
        System.out.println("Sum: " + sum);
    }
}
