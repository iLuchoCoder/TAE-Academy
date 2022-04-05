import java.util.Scanner;

public class Calculator {

    public static void menu(){
        System.out.println("*********************");
        System.out.println("Enter a digit according the following menu");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtract");
        System.out.println("Q - Quit App");
        System.out.println("*********************");
    }

    public static int sumNumbers(int n1, int n2){
        int result;
        return result = n1 + n2;
    }

    public static int sumSubtract(int n1, int n2){
        int result;
        return result = n1 - n2;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String ans = "";
        while(true){
            menu();
            ans = lector.nextLine();
            if(ans.toUpperCase().equals("Q")){
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
                System.out.println("The result is: " + sumSubtract(n1,n2));
            }
        }
    }
}
