/**
 * Created by CK1985 on 4/13/2016.
 */
import static net.mindview.util.Print.*;
public class If_Else {
    static byte result = 0;
    static void checkNumber(int num1, int num2){
        if(num1 > num2){
            result = 1;
        }else if(num1 < num2){
            result = -1;
        }else{
            result = 0;
        }
    }
    public static void main(String[] args){
         checkNumber(5, 19);
         System.out.println(result);
        checkNumber(10, 2);
        System.out.println(result);
        checkNumber(6, 6);
        print(result);
    }
}
