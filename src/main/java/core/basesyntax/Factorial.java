package core.basesyntax;

public class Factorial {
    public int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
