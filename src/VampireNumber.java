/**
 * Created by CK1985 on 4/19/2016.
 */
import static net.mindview.util.Print.*;

public class VampireNumber {
    static int a(int i) {
        return i/1000;
    }
    static int b(int i) {
        return (i%1000)/100;
    }
    static int c(int i) {
        return ((i%1000)%100)/10;
    }
    static int d(int i) {
        return ((i%1000)%100)%10;
    }
    static int com(int i, int j) {
        return (i * 10) + j;
    }
    static void productTest (int i, int m, int n) {
        if(m * n == i) System.out.println(i + " = " + m + " * " + n);
    }

    //-------------------------------------------//
    static void generatorNumber(){
        int[] arr = new int[]{1,2};
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                swap(i, j, arr);
                for(int x : arr){
                    System.out.print("" + x);
                }
                System.out.println();
                arr[0] = 1;
                arr[1] = 2;
            }
        }
    }

    static void generatorVampireNumber(){
        String str = "VP = ";
        int[]arrNumber = new int[4];
        for(int a = 1; a <= 9; a++){
            for(int b = 0; b <= 9; b++){
                for(int c = 0; c <= 9; c++){
                    for(int d = 0; d <= 9; d++){
                        if(((10*a + b)*(10*c + d)) == 1000*a + 100*b + 10*c + d){
                        //if(a + b == 9){
                            print(str + a + b + c + d);
                        }else{
                           arrNumber[0] = a;
                           arrNumber[1] = b;
                           arrNumber[2] = c;
                           arrNumber[3] = d;
                            outer:
                            for(int i = 0; i <= 3; i++){
                                for(int j = 0; j <= 3; j++){
                                    if(i == j){
                                        continue;
                                    }
                                    else {
                                        swap(i, j,arrNumber);
                                        if (((10 *arrNumber[0] +arrNumber[1]) * (10 *arrNumber[2] +arrNumber[3]))
                                                == 1000 * a + 100 * b + 10 * c + d) {
                                         //if(arrNumbet[0] +arrNumber[1] == 9){
                                            print(str + a + b + c + d);
                                            break outer;
                                        }
                                        arrNumber[0] = a;
                                        arrNumber[1] = b;
                                        arrNumber[2] = c;
                                        arrNumber[3] = d;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        generatorVampireNumber();
        //---------------Result------------
        /*
        VP = 1260
        VP = 1395
        VP = 1435
        VP = 1530
        VP = 2187
        VP = 6880
         */

        /*for(int i = 1001; i < 9999; i++) {
            productTest(i, com(a(i), b(i)), com(c(i), d(i)));
            productTest(i, com(a(i), b(i)), com(d(i), c(i)));
            productTest(i, com(a(i), c(i)), com(b(i), d(i)));
            productTest(i, com(a(i), c(i)), com(d(i), b(i)));
            productTest(i, com(a(i), d(i)), com(b(i), c(i)));
            productTest(i, com(a(i), d(i)), com(c(i), b(i)));
            productTest(i, com(b(i), a(i)), com(c(i), d(i)));
            productTest(i, com(b(i), a(i)), com(d(i), c(i)));
            productTest(i, com(b(i), c(i)), com(d(i), a(i)));
            productTest(i, com(b(i), d(i)), com(c(i), a(i)));
            productTest(i, com(c(i), a(i)), com(d(i), b(i)));
            productTest(i, com(c(i), b(i)), com(d(i), a(i)));
        }*/
        //-------------Result-----------------
        /*
        1260 = 21 * 60
        1395 = 15 * 93
        1435 = 41 * 35
        1530 = 51 * 30
        1827 = 87 * 21
        2187 = 27 * 81
        6880 = 86 * 80
        6880 = 80 * 86
         */
    }
}
