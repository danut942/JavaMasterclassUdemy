public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionalResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubstractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        if (this.secondNumber == 0){
            return 0;
        } else {
            return this.firstNumber / this.secondNumber;
        }
    }
}
