package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void isEmpty_null_success() {
        assertTrue(Util.isEmpty(null));
    }

    @Test
    public void isEmpty_blank_success() {
        assertTrue(Util.isEmpty(""));
    }


    @Test
    public void isEmpty_failure() {
        assertFalse(Util.isEmpty("abc"));
    }
}