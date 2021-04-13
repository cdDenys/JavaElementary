import interfaceRepo.Consumer;
import interfaceRepo.Function;
import interfaceRepo.Predicate;
import interfaceRepo.Supplier;
import model.Cat;

public class Main {
    public static void main(String[] args) {
        Predicate<Double> predicate = doubleVariable -> doubleVariable > 1500;
        System.out.println(predicate.checkAmount(1600.00));
        System.out.println(predicate.checkAmount(1400.00));

        Consumer<String> consumer = string -> {
            char[] result = string.toCharArray();
            for (char i : result) {
                System.out.println("Char: " + i);
            }
        };
        consumer.stringConverter("Hello");

        Function<Integer, String> function = byteVariable -> {
          switch (byteVariable){
              case 1:
                  return "one";
              case 2:
                  return "two";
              case 3:
                  return "three";
              case 4:
                  return "four";
              case 5:
                  return "five";
              case 6:
                  return "six";
              case 7:
                  return "seven";
              case 8:
                  return "eight";
              case 9:
                  return "nine";
              case 10:
                  return "ten";
              default:
                  return "unknown";
          }
        };
        System.out.println(function.getStringNumber( 2));
        System.out.println(function.getStringNumber( 7));
        System.out.println(function.getStringNumber( 10));

        Supplier<Cat> supplier = () -> new Cat("Alex", "Persian", 8);
        System.out.println(supplier.get());
    }
}
