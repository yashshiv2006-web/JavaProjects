import java.util.*;
import java.util.Random;

public class Random_guessing{
    public static void main(String arg[]){
        Random random  = new Random();
        int guess = random.nextInt(10);
        System.out.println("____WELCOME TO NUMBER GUESSING GAME___");
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number (1-10): ");
            int your_n = sc.nextInt();
            if (guess > your_n){
                System.out.println("BAD LUCK ＞︿＜");
                System.out.println("Try Large number");
            }
            else if (guess < your_n){
            System.out.println("BAD LUCK ＞︿＜");
            System.out.println("Try Small number");
            }
            else if(guess == your_n){
            System.out.println("GOOD JOB");
            System.out.println("You WON (●'◡'●)");
            break ;
            }
            else{
            System.out.println("---Error---");
            }

        }
    }
}


// use of recursion
// user enter any number  eg: your_n 
// check if guess > your_n   #print Try Large number
// check if guess < your_n   #print Try Small number number
// 