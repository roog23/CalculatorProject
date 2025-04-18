package Lv3;

public enum OperatorType {
    // 나열된 객체들이 고유의 sign을 가지고 있고, 추상메소드를 구현하고 있습니다.
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

    OperatorType(Character sign) {  // 객체 고유의 sign을 매핑해서 생성시키는 생성자입니다.
        this.sign = sign;
    }

    public Character getSign() {    // 나열된 객체의 고유 sign을 가져오는 게터입니다.
        return this.sign;
    }

    // 연산 기호를 확인하고 기호에 맞는 계산 결과를 출력해주는 메소드 입니다.
    public static double calculator(double num1, double num2, char sign) {
        for(OperatorType w : OperatorType.values()) {
            if(w.getSign().equals(sign)) {
                return w.cal(num1,num2);
            }
        }
        return 0;
    }

    public abstract double cal(double num1, double num2);   // 연산 기능을 구현하기 위한 추상메소드입니다.
}