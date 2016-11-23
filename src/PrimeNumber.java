/**
 * Created by CK1985 on 4/15/2016.
 */
public class PrimeNumber {
    static void checkPrime(int boundRange){
        int countPrime = 0;
        for(int i = 3; i <= boundRange; i++){
            for(int j = 2; j <= i - 1; j++){
                if( i % j == 0){
                    break;
                }else{
                    if(j == i - 1){
                        System.out.print(i + " ");
                        countPrime++;
                    }else{
                        continue;
                    }
                }
            }
        }

        /*for(int i = 1; i < boundRange; i++ ) {
            int factors = 0;
            for(int j = 1; j < (i + 2)/2; j++ ) {
                if((i % j) == 0) factors++;
            }
            if(factors < 2){
                System.out.println(i + " is prime");
                countPrime++;
            }

        }*/
        System.out.println("Count = " + countPrime);
    }
    public static void main(String[] args){
        System.out.println("All numbers are prime from [1, 100] are: ");
        checkPrime(1000);
    }
}
