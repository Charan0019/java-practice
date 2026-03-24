
import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first nmber:");
    int a = sc.nextInt();
    System.out.println("enter operator (+, -, *, /):");
    char op = sc.next().charAt(0);
    System.out.println("Enter second number:");
    int b = sc.nextInt();

    switch (op) 
    {
        case '+':
             System.out.println("Result = "+(a+b));
        break;
        case '-':
             System.out.println("Result = "+(a-b));
        break;
        case '*':
             System.out.println("Result = "+(a*b));
        break;
        case '/':
             System.out.println("Result = "+(a/b));
        default:
            System.out.println("Invalid operator");
    }
}
}

