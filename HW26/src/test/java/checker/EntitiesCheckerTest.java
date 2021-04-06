package checker;


import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class EntitiesCheckerTest {
    private EntitiesChecker checker = new EntitiesChecker();

    @SneakyThrows
    @Test
    void clientDataIsNotEmpty() {
        boolean result = checker.clientDataIsNotEmpty(1);
        assertTrue(result);
    }
    @SneakyThrows
    @Test
    void accountDataIsNotEmpty() {
        boolean result = checker.accountDataIsNotEmpty(1);
        assertTrue(result);
    }
    @SneakyThrows
    @Test
    void statusDataIsNotEmpty() {
        boolean result = checker.statusDataIsNotEmpty(1);
        assertTrue(result);
    }

}