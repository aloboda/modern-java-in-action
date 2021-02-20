package com.aloboda.modernjava.app.stream;

import java.util.stream.IntStream;

public class NumericStreamUtil {
    public static IntStream getNaturalEvenNumbers(final int lastNumberInclusive) {
        return IntStream.rangeClosed(1, lastNumberInclusive)
                .filter(n -> n % 2 == 0);
    }
}
