/**
 * Created by CK1985 on 4/14/2016.
 */
import java.util.Random;
public class PrintNumber {
    static void showNumber(){


        for(byte i = 0; i <= 100; i++){
            System.out.println(i + " ");
        }
    }
    static void checkRelation(){
        Random ran = new Random();
        int mark = 0;
        for(int i = 1; i <= 25; i++){
            if(i == 1){
                int newRan = ran.nextInt(100);
                System.out.println(newRan);
            }else if(i == 2){
                mark = ran.nextInt(100);
                System.out.println("The secondly random number is: " + mark);
            }else{
                int newRan1 = ran.nextInt(100);
                if(newRan1 > mark){
                    System.out.println("The random " + i + " has value = " + newRan1 + " is greater the secondly random number");
                }else if(newRan1 < mark){
                    System.out.println("The random " + i + " has value = " + newRan1 + " is smaller the secondly random number");
                }else{
                    System.out.println("They are equals and = " + newRan1);
                }
            }
        }
    }

    static void checkRelationWhile(){
        boolean condition = true;
        while(condition){
            Random ran1 = new Random();
            Random ran2 = new Random();

            int num1 = ran1.nextInt();
            int num2 = ran2.nextInt();

            if(num1 > num2){
                System.out.println("num1 = " + num1 + " > num2 = " + num2);
            }else if(num1 < num2){
                System.out.println("num1 = " + num1 + " < num2 = " + num2);
            }else{
                System.out.println("num1 = " + num1 + " = num2 = " + num2);
            }
        }
    }
    public static void main(String[] args){
        //showNumber();
        //checkRelation();
        checkRelationWhile();
    }
}
