package Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter The first Number: ");
        int firstNum = in.nextInt();
        System.out.println("Please Enter The second Number: ");
        int secondNum = in.nextInt();
        System.out.println("Choose your operation by number: ");
        System.out.println("1. ( + )");
        System.out.println("2. ( - )");
        System.out.println("3. ( / )");
        System.out.println("4. ( * )");
        System.out.println("5. ( % )");

        int op = in.nextInt();

        int calculate ;
        switch (op) {
            case 1:
                calculate = firstNum + secondNum;
                System.out.printf("%d + %d = %d",firstNum, secondNum, calculate);
                break;
            case 2:
                calculate = firstNum - secondNum;
                System.out.printf("%d - %d = %d",firstNum, secondNum, calculate);
                break;
            case 3:
                calculate = firstNum / secondNum;
                System.out.printf("%d / %d = %d",firstNum, secondNum, calculate);
                break;
            case 4:
                calculate = firstNum * secondNum;
                System.out.printf("%d * %d = %d",firstNum, secondNum, calculate);
                break;
            case 5:
                calculate = firstNum % secondNum;
                System.out.printf("%d % %d = %d",firstNum, secondNum, calculate);
                break;
            default:
                System.out.println("Wrong entry !, please try again.");
        }

    }
}
