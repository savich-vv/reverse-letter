package org.example.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    @Test
    public void reverse_shouldReverseString_ifContainsString() {
        String result = Reverse.reverseLettersOnly("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }
}

