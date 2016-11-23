/**
 * Created by CK1985 on 4/17/2016.
 */
/*
For loop with "labeled break" and "labeled continue"
 */
import static net.mindview.util.Print.*;
public class LabeledFor {
    public static void main(String[] args){
        int i = 0;
        outer: // can not have statements here
        for( ; true; ){
            inner: //Can not have statement here
            for( ; i < 10; i++){
                print("i = " + i);
                if(i == 2){
                    print("continue");
                    continue;
                }
                if(i == 3){
                    print("break");
                    i++; //Otherwise i never increments
                    break;
                }
                if(i == 7){
                    print("continue outer");
                    i++; //Otherwise i never increments
                    continue outer;
                }
                if(i == 8){
                    print("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++){
                    if(k == 3){
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
        //Can not continue or break label here
    }
}
