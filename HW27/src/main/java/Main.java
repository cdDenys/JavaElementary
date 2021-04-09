import HelperRepo.StringHelper;
import calculator.FirstCalculatorImpl;
import calculator.SecondCalculatorImpl;
import interfaceRepo.CalculatorAddition;
import interfaceRepo.CalculatorSubstraction;

public class Main {
    public static void main(String[] args) {
        int firstVariable = 10;
        int secondVariable = 40;
        FirstCalculatorImpl firstCalculator = new FirstCalculatorImpl();
        SecondCalculatorImpl secondCalculator = new SecondCalculatorImpl();
        CalculatorAddition.printResult(firstCalculator.calculateValues(firstVariable, secondVariable));
        CalculatorAddition.printResult(secondCalculator.calculateValues(firstVariable, secondVariable));
        CalculatorAddition.printResult(firstCalculator.printFirstVariable(firstVariable));
        CalculatorSubstraction.printResult(firstCalculator.printSecondVariable(secondVariable));

//-------------------------------------------------------------------------------------------------------------
        StringHelper stringHelper = new StringHelper();
        System.out.println("Valid string: " + stringHelper.getResult("alex@mail.com"));
        System.out.println("Invalid string: " + stringHelper.getResult("alex"));
        System.out.println("Invalid string: " + stringHelper.getResult(""));
        System.out.println("Invalid string: " + stringHelper.getResult("      "));


    }
}
