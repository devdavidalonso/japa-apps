import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void acceptsMatchingCodes() {
        assertTrue(Main.isCodeValid("AG123", "AG123"));
        assertTrue(Main.isCodeValid("#CX9", "#CX9"));
    }

    @Test
    void rejectsDifferentCodes() {
        assertFalse(Main.isCodeValid("AG123", "AG124"));
    }

    @Test
    void comparesCodesCaseSensitively() {
        assertFalse(Main.isCodeValid("banco01", "BANCO01"));
    }

    @Test
    void rejectsNullCodes() {
        assertFalse(Main.isCodeValid(null, "AG123"));
        assertFalse(Main.isCodeValid("AG123", null));
        assertFalse(Main.isCodeValid(null, null));
    }
}
