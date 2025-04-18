package Lv2;

import java.util.Scanner;

import static Lv2.Calculator.calculator;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        char sign;
        // 계산 수행과 결과값을 저장 & 반환하는 객체입니다.
        Calculator calculator = new Calculator();

        // 별도의 작업이 있을 때까지 반복됩니다.
        while (true) {
            int num1 = -1, num2 = -1;   // 음수 확인을 위해 값을 -1로 초기화해줍니다.

            // 올바른 입력값 양의 정수(0 포함)를 입력 받을 때까지 반복됩니다.
            do {
                System.out.print("첫번째 양의 정수(0 포함)를 입력하세요 : ");
                try {   // 예외가 발생할 수 있는 경우입니다.
                    num1 = sc.nextInt();
                } catch (Exception e) {     // 예외 발생 시 처리하는 방법입니다.
                    System.out.print("올바른 입력값이 아닙니다. ");
                    sc.nextLine();
                }
                if (num1 <= -1) {           // 양의 정수(0 포함)가 아닌 입력을 받으면 출력합니다.
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
                if(num2 <= -1) {
                    System.out.println("양의 정수를 입력해주세요");
                }
            } while (num2 <= -1);

            while(true) {    // 올바른 연산 기호를 입력 받을 때까지 반복됩니다
                System.out.print("연산할 기호를 입력해주세요 : ");
                String pick = sc.next();

                // 올바른 연산 기호를 입력 받은 경우 진행됩니다.
                if (pick.equals("+") || pick.equals("-") || pick.equals("*") || pick.equals("/")) {
                    sign = pick.charAt(0);
                    break;
                }

                System.out.println("올바른 입력값이 아닙니다.");
            }

            if(sign == '/' && num2 == 0) {     // 분모에 0이 들어온 예외를 처리합니다.
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            else {
                result = calculator(num1 , num2 , sign);  // 계산 기능을 실행합니다.
                System.out.println("연산 결과 = " + result);
                calculator.setter(result);              // 연산 결과 값을 저장합니다.
            }

            // 저장된 데이터를 처리하는 기능을 수행합니다.
            if(calculator.getter() != 0){     // 저장된 데이터가 있는지 확인합니다.(NPE 발생을 방지해줍니다.)
                System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (yes 입력 시에만 작동합니다.) : ");
                String remove = sc.next();
                if (remove.equals("yes")) { // yes 입력 시 처리 기능을 수행합니다.
                    System.out.println("가장 먼저 저장된 데이터 "+calculator.remove()+" 가 삭제되었습니다.");
                }
            }

            // 작업을 종료시키기 위한 입력을 받아 처리합니다.
            System.out.print("계산기를 계속 사용하시겠습니까? (exit 입력 시에만 종료됩니다.) : ");
            String check = sc.next();
            if (check.equals("exit")) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }
        }
    }
}
