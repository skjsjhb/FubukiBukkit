package org.bukkit.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.bukkit.support.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringUtilStartsWithTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        "Apple",
                        "Apples",
                        false
                ),
                Arguments.of(
                        "Apples",
                        "Apple",
                        true
                ),
                Arguments.of(
                        "Apple",
                        "Apple",
                        true
                ),
                Arguments.of(
                        "Apple",
                        "apples",
                        false
                ),
                Arguments.of(
                        "apple",
                        "Apples",
                        false
                ),
                Arguments.of(
                        "apple",
                        "apples",
                        false
                ),
                Arguments.of(
                        "Apples",
                        "apPL",
                        true
                ),
                Arguments.of(
                        "123456789",
                        "1234567",
                        true
                ),
                Arguments.of(
                        "",
                        "",
                        true
                ),
                Arguments.of(
                        "string",
                        "",
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testFor(String base, String prefix, boolean result) {
        assertThat(StringUtil.startsWithIgnoreCase(base, prefix), is(result), base + " starts with " + prefix + ": " + result);
    }
}
