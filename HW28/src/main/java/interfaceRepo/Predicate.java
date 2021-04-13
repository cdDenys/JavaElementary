package interfaceRepo;

@FunctionalInterface
public interface Predicate <T>{
    boolean checkAmount(T t);
}
