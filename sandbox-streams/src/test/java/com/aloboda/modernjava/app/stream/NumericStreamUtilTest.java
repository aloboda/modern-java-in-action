package com.aloboda.modernjava.app.stream;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class NumericStreamUtilTest {
    @Test
    public void when_get_natural_even_numbers_then() {
        assertThat(NumericStreamUtil.getNaturalEvenNumbers(100).count(), Matchers.is(50L));
    }
}
