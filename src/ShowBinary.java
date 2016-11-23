/**
 * Created by CK1985 on 4/15/2016.
 */
import static net.mindview.util.Print.*;

public class ShowBinary {
    static void showVersion1(){
        int x = 1 + 4 + 16 + 64;
        int y = 2 + 8 + 32 + 128;

        print("x = " + Integer.toBinaryString(x));
        print("y = " + Integer.toBinaryString(y));
        print("x & y = " + Integer.toBinaryString(x & y));
        print("x | y = " + Integer.toBinaryString(x | y));
        print("x ^ y = " + Integer.toBinaryString(x ^ y));
        print("~x = " + Integer.toBinaryString(~x));
        print("~y = " + Integer.toBinaryString(~y));
    }

    static void printBinary(String s, int num){
        if(num == 0){
            System.out.println(s + ' ' + num);
        }else{
            int bit_bu = Integer.numberOfLeadingZeros(num);
            num <<= bit_bu;

            System.out.print(s + ' ');
            for(int i = 1; i <= 32 - bit_bu; i++) {
                System.out.print(Integer.numberOfLeadingZeros(num) == 0 ? 1 : 0);
                num <<= 1;
            }
            print();
        }
    }

    static void showVersion2(){
        int x = 0x55, y = 0xAA;
        printBinary("x =", x);
        printBinary("y =", y);
        printBinary("x & y =", x & y);
        printBinary("x | y =", x | y);
        printBinary("x ^ y =", x ^ y);
        printBinary("~x =", ~x);
        printBinary("~y =", ~y);
    }

    public static void main(String[] args){
        //showVersion1();
        /*
        x = 1010101
        y = 10101010
        x & y = 0
        x | y = 11111111
        x ^ y = 11111111
        ~x = 11111111111111111111111110101010
        ~y = 11111111111111111111111101010101
         */
        showVersion2();
        /*
        x = 1010101
        y = 10101010
        x & y = 0
        x | y = 11111111
        x ^ y = 11111111
        ~x = 11111111111111111111111110101010
        ~y = 11111111111111111111111101010101
         */
    }
}
