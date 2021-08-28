import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void fizzTest() {
        assertFalse(fizzBuzz.isFizz(1));
        assertTrue(fizzBuzz.isFizz(3));
    }

    @Test
    void buzzTest() {
        assertFalse(fizzBuzz.isBuzz(1));
        assertFalse(fizzBuzz.isBuzz(3));
        assertTrue(fizzBuzz.isBuzz(5));
    }

    @Test
    void fizzBuzzTest() {
        assertFalse(fizzBuzz.isFizzBuzz(1));
        assertTrue(fizzBuzz.isFizzBuzz(15));
    }

    @Test
    void outputTest() {
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7","FizzBuzz"), fizzBuzz.output(List.of(1,2,3,4,5,6,7,15)));
    }
}