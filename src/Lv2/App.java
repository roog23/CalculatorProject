package Lv2;

import java.util.Scanner;

import static Lv2.Calculator.calculator;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        char sign;
        Calculator calculator = new Calculator();

        while (true) {
            int num1=-1, num2=-1;
            do {
                System.out.print("첫번째 양의 정수(0 포함)를 입력하세요 : ");
                try {
                    num1 = sc.nextInt();
                } catch (Exception e) {
                    System.out.print("올바른 입력값이 아닙니다. ");
                    sc.nextLine();
                }
                if(num1 <= -1){
                    System.out.println("양의 정수를 입력해주세요");
                }
            } while (num1 <= -1);

            do {
                System.out.print("두번째 양의 정수(0 포함)를 입력하세요 : ");
                try {
                    num2 = sc.nextInt();
                } catch (Exception e) {
                    System.out.print("올바른 입력값이 아닙니다. ");
                    sc.nextLine();
                }
                if(num2 <= -1){
                    System.out.println("양의 정수를 입력해주세요");
                }
            } while (num2 <= -1);

            while(true){
                System.out.print("연산할 기호를 입력해주세요 : ");
                String pick = sc.next();
                if (pick.equals("+") || pick.equals("-") || pick.equals("*") || pick.equals("/")) {
                    sign = pick.charAt(0);
                    break;
                }
                System.out.println("올바른 입력값이 아닙니다.");
            }

            if(sign=='/'&&num2==0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            else {
                result = calculator(num1, num2, sign);
                System.out.println("연산 결과 = " + result);
                calculator.setter(result);
            }

            if(calculator.getter()!=0){
                System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (yes 입력 시에만 작동합니다.) : ");
                String remove = sc.next();
                if (remove.equals("yes")) {
                    System.out.println("가장 먼저 저장된 데이터 "+calculator.remove()+" 가 삭제되었습니다.");
                }
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
