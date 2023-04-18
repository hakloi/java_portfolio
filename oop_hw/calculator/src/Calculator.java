import java.util.Set;

public class Calculator {
    private Integer num1;
    private Integer num2;

    private Calculator(){
        // private constructor
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Builder newBuilder() {
        return new Calculator().newBuilder();
    }
    
    public class Builder {

        private Builder() {
            // private constructor - Метод возвращает уже готовый объект
        }

        public Builder setNum1(Integer num1) {
            Calculator.this.num1 = num1;
            return this;
        }
    
        public Builder setNum2(Integer num2) {
            Calculator.this.num2 = num2;
            return this;
        }

        public Calculator build() {
            return Calculator.this;
        }
        
}
