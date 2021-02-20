package com.aloboda.modernjava.app.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamUtil {
    public static IntStream getNaturalEvenNumbers(final int lastNumberInclusive) {
        return IntStream.rangeClosed(1, lastNumberInclusive)
                .filter(n -> n % 2 == 0);
    }

    public static Stream<int[]> getPythagoreanTriples(final int adjacentLastNumber) {
        return IntStream.rangeClosed(1, adjacentLastNumber).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, adjacentLastNumber)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );
    }
}
