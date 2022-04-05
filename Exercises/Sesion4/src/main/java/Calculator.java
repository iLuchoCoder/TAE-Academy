import java.util.Scanner;

public class Calculator {

    public static void menu(){
        System.out.println("*********************");
        System.out.println("Enter a di8git according the following menu");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("Q - Quit App");
        System.out.println("*********************");
    }

    public static double sumNumbers(double n1, double n2){
        double result;
        return result = n1 + n2;
    }

    public static double subtractNumbers(double n1, double n2){
        double result;
        return result = n1 - n2;
    }

    public static Double multiplyNumbers(double n1, double n2){
        double result;
        return result = n1 * n2;
    }

    public static Double divideNumbers(double n1, double n2){
        double result;
        if(n2==0){
           return result = -1;
        }
        return result = n1 / n2;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String ans = "";
        while(true){
            menu();
            ans = lector.nextLine();
            if(ans.equalsIgnoreCase("Q")){
                break;
            }
            if(ans.equals("1")){
                System.out.println("Enter the first number to sum");
                int n1 = Integer.parseInt(lector.nextLine());
                System.out.println("Enter the second number to sum");
                int n2 = Integer.parseInt(lector.nextLine());
                System.out.println("The result is: " + sumNumbers(n1,n2));
            }
            if(ans.equals("2")){
                System.out.println("Enter the first number to subtract");
                int n1 = Integer.parseInt(lector.nextLine());
                System.out.println("Enter the second number to subtract");
                int n2 = Integer.parseInt(lector.nextLine());
                System.out.println("The result is: " + subtractNumbers(n1,n2));
            }
            if(ans.equals("3")){
                System.out.println("Enter the first number to multiply");
                int n1 = Integer.parseInt(lector.nextLine());
                System.out.println("Enter the second number to multiply");
                int n2 = Integer.parseInt(lector.nextLine());
                System.out.println("The result is: " + multiplyNumbers(n1,n2));
            }
            if(ans.equals("4")){
                System.out.println("Enter the first number to divide");
                int n1 = Integer.parseInt(lector.nextLine());
                System.out.println("Enter the second number to divide");
                int n2 = Integer.parseInt(lector.nextLine());
                System.out.println("The result is: " + divideNumbers(n1,n2));
            }
        }
    }
}
