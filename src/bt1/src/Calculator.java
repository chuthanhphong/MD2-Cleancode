public class Calculator {


    public static int calculate(int firstOperand, int secondOperand, char operator) {
        public final char ADDITION = '+';
        public final char SUBTRACTION = '-';
        public final char MULTIPLICATION= '*';
        public final char  DIVISION  = '/';

        switch (operator) {
            case ADDITION: :
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by operator");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}