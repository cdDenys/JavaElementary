package calculator;

import interfaceRepo.CalculatorMultiplication;
import interfaceRepo.CalculatorSubstraction;

public class FirstCalculatorImpl implements CalculatorMultiplication, CalculatorSubstraction {
    @Override
    public int calculateValues(int a, int b) {
        return a * b;
    }

    @Override
    public int printFirstVariable(int a) {
        return a;
    }

    @Override
    public int printSecondVariable(int b) {
        return b;
    }
}
