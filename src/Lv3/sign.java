package Lv3;

public enum sign {
    add('+'),
    sub('-'),
    mul('*'),
    div('/');

    final private Character sign;

    private sign(Character sign) {
        this.sign = sign;
    }

    public Character getSign() {
        return this.sign;
    }

    public static double calculator(double num1, double num2, char symbol) {
        for(sign w : Lv3.sign.values()) {
            if(w.getSign().equals(symbol)) {
                if(w.getSign() == '+') return num1+num2;
                else if(w.getSign() == '-') return num1-num2;
                else if(w.getSign() == '*') return num1*num2;
                else if(w.getSign() == '/') return num1/num2;
            }
        }
        return 0;
    }

}
