import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //get user input
        System.out.print("Enter 1st Number :- ");
        double num1 = scn.nextDouble();
        System.out.print("Enter 2nd Number :- ");
        double num2 = scn.nextDouble();
        System.out.print("Select Operatorr (/,*,-,+) :- ");
        char opr = scn.next().charAt(0);

        //switch operation
        switch (opr){
            case '+' :
                System.out.println("Answer is :- "+(num1+num2));
                break;
            case '-' :
                System.out.println("Answer is :- "+(num1-num2));
                break;
            case '*' :
                System.out.println("Answer is :- "+(num1*num2));
                break;
            case '/' :
                System.out.println("Answer is :- "+(num1/num2));
                break;
            default:
                System.out.println("incorrect operator!");
        }
    }
}
