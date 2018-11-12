package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "input={0}, shift={1}, expected={2}")
    @CsvSource(
            {"abc,3,def",
             "abc,0,abc",
             "a,1,b",
             "xyz,3,abc",
            "abc,-3,xyz"})
    public void testCipher (String input, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(input, shift);

        Assertions.assertEquals(expected, result);
    }
}
