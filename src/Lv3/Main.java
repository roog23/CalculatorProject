package Lv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();
        char sign;

        while (true) {
            while(true) {
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                try {
                    cal.setNumber1(sc.nextDouble());
                    break;
                } catch (Exception e) {
                    System.out.print("올바른 입력값이 아닙니다. ");
                    sc.nextLine();
                }
            }

            while(true) {
                System.out.print("두번째 숫자를 입력해주세요 : ");
                try {
                    cal.setNumber2(sc.nextDouble());
                    break;
                } catch (Exception e) {
                    System.out.println("올바른 입력값이 아닙니다. ");
                    sc.nextLine();
                }
            }

            while(true) {
                System.out.print("연산할 기호를 입력해주세요 : ");
                String pick = sc.next();
                if (pick.equals("+") || pick.equals("-") || pick.equals("*") || pick.equals("/")) {
                     sign = pick.charAt(0);
                    break;
                }
                System.out.println("올바른 입력값이 아닙니다.");
            }

            if(sign=='/' && cal.getNumber2()==0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            else {
                double result = cal.calculator(sign);
                System.out.println("연산 결과 : "+result);
            }

            System.out.print("원하는 값보다 큰 값의 계산 결과를 출력합니다.");
            cal.checkResult(sc.nextDouble());

            System.out.print("계산기를 계속 사용하시겠습니까? (exit 입력 시에만 종료됩니다.) : ");
            String check = sc.next();
            if (check.equals("exit")) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }
        }

    }
}