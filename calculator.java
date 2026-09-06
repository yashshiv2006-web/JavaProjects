import java.util.*;

public class calculator{

    public static void main(String arg[]){
    while (true){
    System.out.println("---Calculator---");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st Number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter 2nd Number : ");
    int num2 = sc.nextInt();

    System.out.println("Press + for Addition");
    System.out.println("Press - for Subtraction");
    System.out.println("Press * for Multiplication");
    System.out.println("Press / for Division");
    System.out.print("Enter Your Choice : ");

    String choice = sc.next();
    switch(choice){
        case "+":System.out.println("Addition is :"+(num1+num2));
                break ;
        case "-":System.out.println("Subtraction is :"+(num1-num2));
                break ;
        case "*":System.out.println("Multipication is :"+(num1*num2));
                break ;
        case "/":System.out.println("Division is :"+(num1/num2));
                break ;
        default :System.out.println("INVALID TRY AGAIN");
                break ;
    }
    System.out.print("Do you wany to claculate more (y/n):");
    String mood = sc.next();
    if(mood.equals("y")){
        continue;
    }
    else if  (mood.equals("n")){
        System.out.println("Thankyou for using this calculator ");
        break ;
    }
    }

    }

}
