package Lv3;

public enum OperatorType {
    add('+') {
        public double cal(double num1, double num2) {
            return num1 + num2;
        }
    },
    sub('-') {
        public double cal(double num1, double num2) {
            return num1 - num2;
        }
    },
    mul('*') {
        public double cal(double num1, double num2) {
            return num1 * num2;
        }
    },
    div('/') {
        public double cal(double num1, double num2) {
            return num1 / num2;
        }
    };

    private final Character sign;

    OperatorType(Character sign) {
        this.sign = sign;
    }

    public Character getSign() {
        return this.sign;
    }

    public static double calculator(double num1, double num2, char sign) {
        for(OperatorType w : OperatorType.values()) {
            if(w.getSign().equals(sign)) {
                return w.cal(num1,num2);
            }
        }
        return 0;
    }

    public abstract double cal(double num1, double num2);
}