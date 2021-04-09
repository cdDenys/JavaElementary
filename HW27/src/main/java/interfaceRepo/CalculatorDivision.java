package interfaceRepo;

public interface CalculatorDivision {
    default int calculateValues(int a, int b) {
        return a / b;
    }

    int printFirstVariable(int a);

    int printSecondVariable(int b);

    static void printResult(int result){
        System.out.println("result: " + result);
    }
}
