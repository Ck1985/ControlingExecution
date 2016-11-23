/**
 * Created by CK1985 on 4/14/2016.
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println(',');
        return result;
    }
    public static void main(String[] args){
        /*while(condition()){
            System.out.println("Inner the looping");
        }
        System.out.println("Outer the loping");*/
        while(condition())
            System.out.println("Inner the looping");
        System.out.println("Outer the looping");
    }
}
