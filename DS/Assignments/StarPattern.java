package DS.Assignments;
import java.util.Scanner;

public class StarPattern {

    public void pattern1(){
        Scanner sc = new Scanner(System.in);
        // vertical line 
        for(int i=0;i<3;i++){
            System.out.print("* ");
        }
        // print vertical
        for(int j=0;j<3;j++){
            System.out.println("* ");
        }
        sc.close();
    }
    public void pattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deapth of square pattern:");
        int deapth = sc.nextInt();

        for(int i =1;i<=deapth;i++){
            for(int j =1;j<=deapth;j++){
                System.out.print("*("+i+j+")"); // to understand the pattern index.
            }
            System.out.println();
        }
        sc.close();
    }
    public void pattern3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deapth of top-left triangle:");
        int triangle = sc.nextInt();
        // for(int i=1;i<=triangle;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // } // This is considered basic and code specific
        for(int i =1;i<=triangle;i++){
            for(int j =1;j<=triangle;j++){
                if( i>=j){
                    System.out.print("* "); // to understand the pattern index.
                }else{
                    System.out.print(" "); // to understand the pattern index.
                }
            }
            System.out.println();
        }
        sc.close();
    }
    public void pattern4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deapth of top-right triangle:");
        int triangle = sc.nextInt();

        // for(int i=triangle;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i =1;i<=triangle;i++){
            for(int j =1;j<=triangle;j++){
                if( i<=j){
                    System.out.print("* "); // to understand the pattern index.
                }else{
                    System.out.print("  "); // to understand the pattern index.
                }
            }
            System.out.println();
        }

        sc.close();
    }
    public void pattern5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deapth of X pattern:");
        int n = sc.nextInt();
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if( row == col || row+col == n+1){
                    System.out.print("* "); 
                }else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        sc.close();
    }
    public void pattern6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deapth of hollow pattern:");
        int n = sc.nextInt();
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if((row == 1 || row == n) || (col == 1 || col == n)){
                    System.out.print("* "); 
                }else{
                    System.out.print("X "); 
                }
            }
            System.out.println();
        }

        sc.close();
    }
    public void pattern7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deapth of J letter pattern:");
        int n = sc.nextInt();
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if((row == 1 || (row == n && col <=n/2)) || (col == n/2+1)){              
                    System.out.print("* "); 
                }else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        sc.close();
    }
    public void pattern8(){
        for(int row =1 ;row<=5;row++){
            for(int col=1; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public void pattern9(){
        for(int row =1 ;row<=5;row++){
            for(int col=5; col> row;col--){
                System.out.print("  ");
            }
            for(int col =1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public void pattern10(){
        for(int row =1 ;row<=5;row++){
            for(int col=5; col> row;col--){
                System.out.print("* ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPattern obj = new StarPattern();

        // obj.pattern1();
        // obj.pattern2();
        // obj.pattern3();
        // obj.pattern4();
        // obj.pattern5();
        // obj.pattern6();
        // obj.pattern7();
        // obj.pattern8();
        // obj.pattern9();
        obj.pattern10();
    }
}
