package DS.Practice_room;

import java.util.Scanner;
    
public class ArraysP1 {
    static void arraydeclaration(){
        int marks[] = new int[3]; //size we gave as 10 //declare
        int number[] = {1,2,3}; //define
        int moreNumber[] = {4,5,6};
        String fruits[] = {"apple","pineapple","orange","kiwi"};

        System.out.println(marks+"\n"+number+moreNumber+"\n"+fruits);
    }
    static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
        System.out.println("Here we are using call by reference.");
    }
    public static void main(String[] args) {
        int marks[] = new int[3]; //size we gave as 10 //declare
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you subject wise marks:");
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter Subject "+(i+1)+" marks :");
            marks[i] = sc.nextInt();
        }
        // now here we call the update method
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" marks got in subject "+(i+1));
        }
        // we can take the average and calculate percentage as well.
        
        sc.close();
    }
}
