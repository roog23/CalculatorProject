package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        while (true) {
            System.out.print("첫번째 정수를 입력하세요 : ");
            try {
                num1 = sc.nextInt();
            } catch (Exception e) {
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

            System.out.print("연산할 기호를 입력해주세요 : ");
            String pick = sc.next();
            if (!pick.equals("+") && !pick.equals("-") && !pick.equals("*") && !pick.equals("/")) {
                System.out.println("올바른 입력값이 아닙니다. 처음으로 돌아갑니다.");
                continue;
            }
            char sign = pick.charAt(0);

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
                    if (num2 == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."); }
                    else{
                        System.out.println("연산 결과 : "+(num1 / num2));}
                    break;
            }

            System.out.print("계산기를 계속 사용하시겠습니까? (exit 입력 시에만 종료됩니다.) : ");
            String check = sc.next();
            if (check.equals("exit")) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }
        }
    }
}
