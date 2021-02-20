package com.aloboda.modernjava.app.stream;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

public class NumericStreamUtilTest {
    @Test
    public void when_get_natural_even_numbers_then() {
        assertThat(NumericStreamUtil.getNaturalEvenNumbers(100).count(), Matchers.is(50L));
    }

    @Test
    public void when_calculate_pythagorean_triangles_then_return_correct_tuples() {
        final List<int[]> triangles = NumericStreamUtil.getPythagoreanTriples(100).skip(5).limit(5).collect(Collectors.toList());
        assertThat(triangles.get(0), Matchers.equalTo(new int[]{9, 12, 15}));
        assertThat(triangles.get(1), Matchers.equalTo(new int[]{9, 40, 41}));
    }
}
