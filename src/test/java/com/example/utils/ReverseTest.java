package com.example.utils;

public class ReverseTest {
    private Reverse reverse = new StringReverse();

    @Test
    public void reverser_shouldReverseString_ifContainsString() {
        String result = reverse.reverse("J@va the be$t!123");
        Assertions.asserEquals("t@eb eht av$J!123", result);
    }
}
