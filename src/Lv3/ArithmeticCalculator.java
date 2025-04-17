package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T> {
    private T num1,num2;
    private List<Double> ResultList = new ArrayList<>();

    public void setNumber1(T num) {
        this.num1= num;
    }

    public void setNumber2(T num) {
        this.num2= num;
    }

    public T getNumber1() {
        return num1;
    }

    public T getNumber2() {
        return num2;
    }

    Double calculator(char sign) {
        double result = OperatorType.calculator((double)num1,(double)num2,sign);
        ResultList.add(result);
        return result;
    }

    public void checkResult(double checkNum) {
        List<Double> ret = ResultList.stream()
                                     .filter(num -> num > checkNum)
                                     .collect(Collectors.toList());
        if (ret.isEmpty()) {
            System.out.println("입력한 값보다 큰 결과값이 없습니다.");
        }
        else {
            System.out.println(ret);
        }
    }
}