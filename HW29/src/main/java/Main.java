import model.Car;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//      Task1
        Stream.empty()
                .sorted()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new))
        .forEach(System.out::println);

//      Task2
        List<String> list = List.of("Hello", "How are you?", "have a nice day");
        Stream<String> listStream = list.stream()
                .filter(find -> find.contains("H"))
                .distinct();
        System.out.println(listStream.collect(Collectors.toList()));
//      Task3
        Stream<String> secondStringStream = Stream.of("one", "two", "three");
        System.out.println(secondStringStream.collect(Collectors.toSet()));
//      Task4
        Map<String, Integer> stringIntegerMap = Map.of("Alex", 100, "Colin", 200, "Kate", 450);
        List<String> result = stringIntegerMap.keySet().stream()
                .collect(Collectors.toList());
        System.out.println(result);

//      Task5
        List<String> stringList = List.of("1", "2", "2", "3", "44", "6", "6", "7", "0", "11");
        stringList.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(val -> val % 2 == 0)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
//      Task6
        Stream<Integer> integerStream = Stream.of(0, 21, 11, -1, 1, 6, 88, 454656, 9);
        Optional<Integer> stream = integerStream
                .parallel()
                .sorted()
                .filter(var -> var > 3)
                .findFirst();
        System.out.println(stream);
//      Task7
        Car car = new Car("SSC");
        Stream.of("bmw", "lada", "mazda")
              .map(Car::new)
              .map(Car::getName).map(String::toUpperCase)
        .collect(Collectors.toCollection(ArrayList::new))
        .forEach(car::getBeep);

    }

}
