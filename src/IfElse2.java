/**
 * Created by CK1985 on 4/16/2016.
 */
import static net.mindview.util.Print.*;
public class IfElse2 {
    static int test2(int num1, int num2){
        if(num1 > num2){
            return 1;
        }else if(num1 < num2){
            return -1;
        }else{
            return 0;
        }
    }

    static int checkRange(int begin, int end, int num){
        if(num > end || num < begin){
            return -1;
        }else{
            return 1;
        }
    }

    public static void main(String[] args){
        //print(test2(5, 3));
        int check = checkRange(12, 20, 20);
        if(check == 1){
            print("It is in the range");
        }else{
            print("It is out of the range");
        }
    }
}
