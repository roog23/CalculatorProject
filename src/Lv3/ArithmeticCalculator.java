package Lv3;

import java.util.ArrayList;

public class ArithmeticCalculator<T> {
    private T num1,num2;
    private ArrayList<Double> ResultList = new ArrayList<>();

    public void SetNumber1(T num){
        this.num1= num;
    }

    public void SetNumber2(T num){
        this.num2= num;
    }

    public T GetNumber1() {
        return num1;
    }

    public T GetNumber2(){
        return num2;
    }

    Double calculator(char sign){
        double result =0;
        if (sign == '+')        result = (double)num1 + (double)num2;
        else if(sign =='-')     result = (double)num1 - (double)num2;
        else if(sign == '*')    result = (double)num1 * (double)num2;
        else if(sign == '/')    result = (double)num1 / (double)num2;
        ResultList.add(result);
        return result;
    }

    public void CheckResult(double checkNum){
        int cnt=0;
        for(Double check : ResultList){
            if(check>checkNum){
                System.out.print(check+" ");
                cnt++;
            }
        }
        if(cnt==0){
            System.out.print("입력한 값보다 큰 결과값이 없습니다.");
        }
        System.out.println();
    }
}