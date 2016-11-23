/**
 * Created by CK1985 on 4/16/2016.
 */
public class CommaOperator {
    public static void main(String[] args){
        for(int i = 1, j = i * 2; i <= 6; i++, j += 5){
            System.out.println("i = " + i + " and j = " + j);
        }
    }
}
