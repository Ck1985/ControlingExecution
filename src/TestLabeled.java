/**
 * Created by CK1985 on 4/18/2016.
 */
import static net.mindview.util.Print.*;
public class TestLabeled {
    public static void main(String[] args){
        /*int i = 0;
        outer:
        while(true){
            print("Outer loop");
            while(true){
                i++;
                if(i == 2){
                    break;
                }
                if(i == 4){
                    break outer;
                }
            }
        }*/
        int i = 0;
        outer:
        for( ;true; ){
            print("outer loop");
            i++;
            inner:
            for( ; i < 2; ){
                if(i == 1){
                    break inner;
                }
                if(i == 3){
                    break outer;
                }
            }
        }
    }
}
