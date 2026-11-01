import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void acceptsSupportedOperations() {
        assertTrue(Main.isOperationValid("DEPOSITO"));
        assertTrue(Main.isOperationValid("SAQUE"));
        assertTrue(Main.isOperationValid("TRANSFERENCIA"));
    }

    @Test
    void rejectsUnsupportedOperations() {
        assertFalse(Main.isOperationValid("PAGAMENTO"));
        assertFalse(Main.isOperationValid("deposito"));
        assertFalse(Main.isOperationValid(""));
    }
}
