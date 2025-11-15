package DS.Practice_Questions;
public class PQ2 {

public void Q1(){
    int x = 2, y = 5;
    int exp1 = (x * y / x); // 5 
    int exp2 = (x * (y / x)); // 4
    System.out.print(exp1 + ","); //final op 5,4
    System.out.print(exp2); 
}
public void Q2(){
    int x = 200, y = 50, z = 100;
    if(x > y && y > z){
        System.out.println("Hello");
    }
    if(z > y && z < x){
        System.out.println("Java");
    }
    if((y+200) < x && (y+150) < z){
        System.out.println("Hello Java");
    }
}
public void Q3(){
    int x, y, z;
    x = y = z = 2;
    x += y;
    y -= z;
    z /= (x + y);
    System.out.println(x + " " + y + " " + z);
}
public void Q4(){
    int x = 9, y = 12;
    int a = 2, b = 4, c = 6;
    int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
    System.out.println(exp);
}
public void Q5(){
    int x = 10, y = 5;
    int exp1 = (y * (x / y + x / y));
    int exp2 = (y * x / y + y * x / y);
    System.out.println(exp1);
    System.out.println(exp2);
}
public static void main(String[] args) {
        PQ2 obj = new PQ2();

        // obj.Q1();
        // obj.Q2();
        // obj.Q3();
        // obj.Q4();
        obj.Q5();
    }
}
