import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char op;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();
        System.out.print("\nВведите нужную операцию (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch(op) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.print("Невозможно совершить операцию");
                return ;
        }
        if ((num2 == 0) & (op=='/')) {
            System.out.print("\nНевозможно совершить операцию: Деление на ноль\n");
        }
        else {
            System.out.print("\nВаш результат:\n");
            System.out.print(num1 + " " + op + " " + num2 + " = " + result);
        }
    }
}

