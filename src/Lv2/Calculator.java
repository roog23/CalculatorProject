package Lv2;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Integer> resultList = new LinkedList<>();

    static int calculator(int num1,int num2,char sign){
        int result =0;

        if (sign == '+')        result = num1 + num2;
        else if(sign =='-')     result = num1 - num2;
        else if(sign == '*')    result = num1 * num2;
        else if(sign == '/')    result = num1 / num2;

        return result;
    }

    public void setter(int a){
        resultList.add(a);
    }

    public int getter(){
        return resultList.size();
    }

    public int remove() {
        return resultList.poll();
    }

}