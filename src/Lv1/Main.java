package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2;

        // 계산기를 별도의 작업이 있을 때까지 반복됩니다.
        while (true) {
            // 정수를 입력 받고, int 형이 아닌 입력이 들어오면 계산기를 처음으로 되돌립니다.
            System.out.print("첫번째 정수를 입력하세요 : ");
            try {   // 예외가 발생할 수 있는 경우입니다.
                num1 = sc.nextInt();
            } catch (Exception e) {     // 예외 발생 시 처리하는 방법입니다.
                System.out.println("올바른 입력값이 아닙니다. 처음으로 돌아갑니다.");
                sc.nextLine();
                continue;
            }

            System.out.print("두번째 정수를 입력하세요 : ");
            try {
                num2 = sc.nextInt();
            } catch (Exception e) {
                System.out.println("올바른 입력값이 아닙니다. 처음으로 돌아갑니다.");
                sc.nextLine();
                continue;
            }

            // + , - , / , * 사칙연산 기호를 입력받고, 외의 입력이 들어오면 처음으로 되돌립니다.
            System.out.print("연산할 기호를 입력해주세요 : ");
            String pick = sc.next();

            // 입력 받은 기호가 잘못된 경우 처리하는 방법입니다.
            if (!pick.equals("+") && !pick.equals("-") && !pick.equals("*") && !pick.equals("/")) {
                System.out.println("올바른 입력값이 아닙니다. 처음으로 돌아갑니다.");
                continue;
            }

            char sign = pick.charAt(0);

            // 입력받은 연산 기호에 맞는 연산을 진행합니다.
            switch (sign) {
                case '+':
                    System.out.println("연산 결과 : "+(num1 + num2));
                    break;
                case '-':
                    System.out.println("연산 결과 : "+(num1 - num2));
                    break;
                case '*':
                    System.out.println("연산 결과 : "+(num1 * num2));
                    break;
                case '/':
                    if (num2 == 0){ // 분모에 0이 들어온 예외를 처리합니다.
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."); }
                    else{
                        System.out.println("연산 결과 : "+(num1 / num2));}
                    break;
            }

            // 계산기를 종료시키기 위한 입력을 받아 처리합니다.
            System.out.print("계산기를 계속 사용하시겠습니까? (exit 입력 시에만 종료됩니다.) : ");
            String check = sc.next();
            if (check.equals("exit")) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }
        }
    }
}
