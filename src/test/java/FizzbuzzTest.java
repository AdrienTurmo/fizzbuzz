import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {

    private Fizzbuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void answer_ShouldReturnOne_whenParameterIsOne() {
        // When
        String answer = fizzbuzz.answer(1);

        // Then
        assertEquals("1", answer);
    }

    @Test
    public void answer_ShouldReturnTwo_whenParameterIsTwo() {
        // When
        String answer = fizzbuzz.answer(2);

        // Then
        assertEquals("2", answer);
    }

    @Test
    public void answer_ShouldReturnFizz_whenParameterIs3() {
        // When
        String answer = fizzbuzz.answer(3);

        // Then
        assertEquals("Fizz", answer);
    }

    @Test
    public void answer_ShouldReturnBuzz_whenParameterIsFive() {
        // When
        String answer = fizzbuzz.answer(5);

        // Then
        assertEquals("Buzz", answer);
    }

    @Test
    public void answer_ShouldReturnFizz_whenParameterIs6() {
        // When
        String answer = fizzbuzz.answer(6);

        // Then
        assertEquals("Fizz", answer);
    }

    @Test
    public void answer_ShouldReturnFizz_whenParameterIs9() {
        // When
        String answer = fizzbuzz.answer(9);

        // Then
        assertEquals("Fizz", answer);
    }

    @Test
    public void answer_ShouldReturnBuzz_whenParameterIsTen() {
        // When
        String answer = fizzbuzz.answer(10);

        // Then
        assertEquals("Buzz", answer);
    }

    @Test
    public void answer_ShouldReturnFizzBuzz_whenParameterIsFifteen() {
        // When
        String answer = fizzbuzz.answer(15);

        // Then
        assertEquals("FizzBuzz", answer);
    }
}
