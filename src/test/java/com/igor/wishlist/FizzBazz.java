package com.igor.wishlist;

import org.junit.jupiter.api.Test;

public class FizzBazz {

    @Test
    public void test() {

        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 40; i++) {
            boolean isThree = i % 3 == 0;
            boolean isFive = i % 5 == 0;
            if (isThree && isFive) {
                builder.append(FIZZ + BUZZ);
            } else if (isThree) {
                builder.append(FIZZ);
            } else if (isFive) {
                builder.append(BUZZ);
            } else {
                builder.append(i);
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
