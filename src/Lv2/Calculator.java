package Lv2;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    // 연산 결과 값을 저장하는 캡슐화된 객체입니다.
    private final Queue<Integer> resultList = new LinkedList<>();

    // 계산기 기능을 수행합니다.
    static int calculator(int num1,int num2,char sign){
        int result = 0;

        if (sign == '+')        result = num1 + num2;
        else if(sign =='-')     result = num1 - num2;
        else if(sign == '*')    result = num1 * num2;
        else if(sign == '/')    result = num1 / num2;

        return result;
    }

    public void setter(int a){      // resultList에 값을 추가하기 위한 세터입니다.
        resultList.add(a);
    }

    public int getter(){            // resultList의 size()를 출력하는 게터입니다.
        return resultList.size();
    }

    public int remove() {           // resultList의 처음의 값을 전달하고 없애는 역할을 합니다.
        return resultList.poll();
    }

}