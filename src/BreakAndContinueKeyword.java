/**
 * Created by CK1985 on 4/16/2016.
 */
public class BreakAndContinueKeyword {
    static void showRange(){
        for(int i = 1; i < 150; i++){
            if(i == 99){
                //break;
                return;
            }else{
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        /*for(int i = 1; i < 100; i++){
            if(i == 70){
                break;
            }else if(i % 5 != 0){
                continue;
            }else{
                System.out.print(i + " ");
            }
        }*/

        /*int k = 1;
        while(true){
            k++;
            if(k == 70){
                break;
            }else if(k % 5 != 0){
                continue;
            }else{
                System.out.print(k + " ");
            }
        }*/
        showRange();
    }
}
