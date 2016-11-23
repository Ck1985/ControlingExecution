/**
 * Created by CK1985 on 4/18/2016.
 */
public class PrintMessageApplication {
    public static void main(String[] args){
        int choosen = 1;
        while(choosen < 7) {
            switch (choosen) {
                case 1:
                    System.out.println("Hi");
                    break;
                case 2:
                    System.out.println("My name is Java");
                    break;
                case 3:
                    System.out.println("I am program language for android");
                    break;
                case 4:
                    System.out.println("I will help you to be a programmer professinal");
                    break;
                case 5:
                    System.out.println("Try hard by your self, you will successful");
                    break;
                case 6:
                    System.out.println("You will be a milionare by coding in the future");
                    break;
                default:
                    System.out.println("Good luck");
                    break;
            }
            choosen++;
        }
    }
}
