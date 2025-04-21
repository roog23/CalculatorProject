package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T> {
    private T num1,num2;
    // 결과 값을 저장하는 캡슐화된 객체입니다.
    private final List<Double> resultList = new ArrayList<>();

    public void setNumber1(T num) {     // num1에 값을 저장하기 위한 세터입니다.
        this.num1= num;
    }

    public void setNumber2(T num) {     // num2에 값을 저장하기 위한 세터입니다.
        this.num2= num;
    }

    public T getNumber1() {             // num1에 값을 전달하기 위한 게터입니다.
        return num1;
    }

    public T getNumber2() {             // num2에 값을 전달하기 위한 게터입니다.
        return num2;
    }

    // 계산 기능을 수행하고 결과값을 저장하는 메소드입니다.
    public double calculator(char sign) {
        double result = OperatorType.calculator((double)num1,(double)num2,sign);
        resultList.add(result);
        return result;
    }

    // 입력 받은 값보다 큰 결과 값을 출력해주는 메소드입니다.
    public void checkResult(double checkNum) {
        List<Double> ret = resultList.stream()
                                     .filter(num -> num > checkNum)
                                     .collect(Collectors.toList());
        if (ret.isEmpty()) {    // 입력 받은 값보다 큰 결과 값이 없는 경우 실행됩니다.
            System.out.println("입력한 값보다 큰 결과값이 없습니다.");
        }
        else {
            System.out.println(ret);
        }
    }
}