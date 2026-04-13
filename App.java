0import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double num1, num2;
        char operator;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("qual é o primeiro número? ");
            num1 = scanner.nextDouble();
            System.out.print("qual é o segundo número? ");
            num2 = scanner.nextDouble();
            System.out.print("qual é a operação? (+, -, *, /) ");
            operator = scanner.next().charAt(0);
        }
        switch (operator) {
            case '+':
                System.out.println("resultado: " + (num1 + num2));

                break;

            case '-':
                System.out.println("resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("resultado: " + (num1 * num2));
                break;
            case '/':
                System.out.println("resultado: " + (num1 / num2));
                break;
        }

    }
}
