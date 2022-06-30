package nz.co.patterns;

import nz.sounie.patterns.SomeRecord;
import nz.sounie.patterns.TryingSwitchPatterns;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TryingSwitchPatternsTest {
    @Test
    void anInt() {
        TryingSwitchPatterns tryingSwitchPatterns = new TryingSwitchPatterns();
        int myInt = 123;

        assertEquals("Hello int 123", tryingSwitchPatterns.doMatchStuff(myInt));

        assertEquals("Int value 100", tryingSwitchPatterns.doMatchStuff(100));

        assertEquals("Int value 500", tryingSwitchPatterns.doMatchStuff(500));
    }

    @Test
    void aFloat() {
        TryingSwitchPatterns tryingSwitchPatterns = new TryingSwitchPatterns();

        float someFloat = 123.0f;

        assertEquals("Some non-int number 123.0", tryingSwitchPatterns.doMatchStuff(someFloat));
    }

    @Test
    void aString() {
        TryingSwitchPatterns tryingSwitchPatterns = new TryingSwitchPatterns();

        assertEquals("Didn't find a match, so defaulting", tryingSwitchPatterns.doMatchStuff("Some string"));
    }

    @Test
    void nullValue() {
        TryingSwitchPatterns tryingSwitchPatterns = new TryingSwitchPatterns();

        assertEquals("Found a null", tryingSwitchPatterns.doMatchStuff(null));
    }

    @Test
    void aRecord() {
        TryingSwitchPatterns tryingSwitchPatterns = new TryingSwitchPatterns();

        assertEquals("A record named Trevor with size 15", tryingSwitchPatterns.doMatchStuff(new SomeRecord("Trevor", 15)));
    }
}