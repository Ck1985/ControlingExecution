/**
 * Created by CK1985 on 4/16/2016.
 */
import java.util.*;
public class ForeachLoop {
    public static void main(String[] args){
        float[] arrayfloat = new float[10];
        Random ran = new Random();
        for(int i = 0; i < arrayfloat.length; i++){
            arrayfloat[i] = ran.nextFloat();
        }

        /*for(int j = 0; j < arrayfloat.length; j++){
            System.out.println(arrayfloat[j]);
        }*/

        /*for(float x : arrayfloat){
            System.out.println(x);
        }*/

        String stringSource = "Super Hacking Anonymous";
        char[] charArray = stringSource.toCharArray();
        for(char c : charArray){
            System.out.print(c + "  ");
        }
    }
}
