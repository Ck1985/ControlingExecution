/**
 * Created by CK1985 on 4/18/2016.
 */
public class FibonacciNumber {
    static boolean checkFibonacci(int num){
        int start = 0;
        int end = 1;
        int newValue;

        while(end <= num){
            newValue = start + end;
            start = end;
            end = newValue;
            if(end == num){
                break;
            }
        }
        if(end == num){
            return true;
        }
        else{
            return false;
        }
    }

    static void generatorFibonacci(int numEnd){
         if (checkFibonacci(numEnd)){
             int start = 0, end = 1, newValue = 0;
             System.out.print(start + " " + end);
             while(end <= numEnd){
                 newValue = start + end;
                 start = end;
                 end = newValue;
                 if(end == numEnd){
                     System.out.print(" "+ newValue);
                     break;
                 }else{
                     System.out.print(" " + newValue);
                 }
             }
         }else{
             System.out.println("Sorry! this number is out of Fibonaccy sequence");
         }
    }

    public static void main(String[] args){
         generatorFibonacci(34);
    }
}
