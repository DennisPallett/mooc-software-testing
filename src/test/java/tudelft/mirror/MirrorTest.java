package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest(name = "input={0}, expected={1}")
    @CsvSource(
            {"aBCa,a",
            "aBCaa,a",
            "aba,aba",
            "abba,abba",
            "aaa,aaa"})
    public void testMirror (String input, String expected) {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testEmptyInput() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testNoResult() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abc");
        Assertions.assertEquals("", result);
    }

}
