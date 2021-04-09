package calculator;

import interfaceRepo.CalculatorAddition;
import interfaceRepo.CalculatorDivision;

public class SecondCalculatorImpl implements CalculatorAddition, CalculatorDivision {


    @Override
    public int calculateValues(int a, int b) {
        return a + b;
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
