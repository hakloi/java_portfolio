import java.util.Set;

public class Calculator {
    private double num1;
    private double num2;

    private Calculator(){
        // private constructor
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public Builder newBuilder() {
        return new Calculator().newBuilder();
    }
    
    public class Builder {

        private Builder() {
            // private constructor - Метод возвращает уже готовый объект
        }

        public Builder setNum1(double num1) {
            Calculator.this.num1 = num1;
            return this;
        }
    
        public Builder setNum2(double num2) {
            Calculator.this.num2 = num2;
            return this;
        }

        public Calculator build() {
            return Calculator.this;
        }
        
}
}
