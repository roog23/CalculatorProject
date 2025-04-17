package Lv3;

public class ArithmeticCalculator<T> {
    private T num1,num2;

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
        return result;
    }
}