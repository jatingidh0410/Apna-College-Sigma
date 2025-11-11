package DS.Practice_room;

public class BinarytoDecimal {
    
    public static void binaryToDecimal(int binNum) {
    int myNum = binNum;
    int pow =0;
    int decNum =0;

    while (binNum > 0) {
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
        pow++;
        binNum = binNum / 10;
    }
    System.out.println("Decimal of "+ myNum+" is: "+decNum);
}
    public static void decimalToBinary(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;     
        while (decNum > 0) {
            int rem = decNum % 2; 
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }   
        System.out.println("Binary of "+ myNum+" is: "+binNum);
        

    }
    public static void main(String[] args) {
        binaryToDecimal(1001000101);
        binaryToDecimal(1011);

        decimalToBinary(581);
    }
}
