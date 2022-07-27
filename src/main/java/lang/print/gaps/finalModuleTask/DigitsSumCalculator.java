package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        calculateSum(1234);
    }
    public static void calculateSum(int number) {
        int first, second, third, fourth;
        fourth = number / 1000;
        third = (number - (fourth * 1000)) / 100;
        second = ((number - (fourth * 1000)) - third * 100) / 10;
        first = ((number - (fourth * 1000)) - third * 100) - second * 10;

        System.out.println(first + second + third + fourth);
    }
}
