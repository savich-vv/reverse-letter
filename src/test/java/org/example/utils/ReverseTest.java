package org.example.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    @Test
    public void reverse_shouldReverseString_ifContainsString() {
        String result = Reverse.reverseLettersOnly("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverse_shouldReturnString_ifContainsNull() {
        String result = Reverse.reverseLettersOnly(null);
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverse_shouldReturnString_ifContainsOneLetter() {
        String result = Reverse.reverseLettersOnly("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void reverse_shouldReturnCharacter_ifStringContainsOnlyCharacter() {
        String result = Reverse.reverseLettersOnly("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void reverse_shouldReturnString_ifStringContainsOnlyLetters() {
        String result = Reverse.reverseLettersOnly("abcd");
        Assertions.assertEquals("dcba", result);
    }

//    @Test
//    public void reverse_shouldReturnString_if Небуквенные символы по краям и в середине() {
//        String result = Reverse.reverseLettersOnly("Jva the bet");
//        Assertions.assertEquals("teb eht avJ", result);
//    }

    @Test
    public void reverse_shouldReturnString_ifStringContainsCapitalLetterInFirstWord() {
        String result = Reverse.reverseLettersOnly("Jva the bet");
        Assertions.assertEquals("teb eht avJ", result);
    }
}