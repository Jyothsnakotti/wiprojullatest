package com.wipro.junitdemo;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testUppercaseStrings() {
        assertTrue(StringUtils.isUpperCase("HELLO"));
        assertTrue(StringUtils.isUpperCase("USA"));
        assertTrue(StringUtils.isUpperCase("JAVA123!")); // digits & symbols ignored
        assertTrue(StringUtils.isUpperCase("HELLO WORLD"));
    }

    @Test
    void testNonUppercaseStrings() {
        assertFalse(StringUtils.isUpperCase("Hello"));
        assertFalse(StringUtils.isUpperCase("hello"));
        assertFalse(StringUtils.isUpperCase("java123"));
        assertFalse(StringUtils.isUpperCase("Hello World"));
    }

    @Test
    void testNullOrEmptyStrings() {
        assertFalse(StringUtils.isUpperCase(null));
        assertFalse(StringUtils.isUpperCase(""));
    }
}
