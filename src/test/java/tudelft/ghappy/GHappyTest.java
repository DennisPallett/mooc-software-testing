package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.mirror.Mirror;

public class GHappyTest {

    @ParameterizedTest(name = "input={0}, expected={1}")
    @CsvSource(
            {"xxggxx,true",
            "xxgxx,false",
            "xxggyygxx,false",
            "g,false",
            "ggg,true"})
    public void testMirror (String input, String expected) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(input);

        if (Boolean.parseBoolean(expected))
            Assertions.assertTrue(result);
        else
            Assertions.assertFalse(result);
    }

}
