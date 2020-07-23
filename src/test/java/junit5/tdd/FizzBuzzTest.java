package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_given_1() {
        //given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when

        String actual = fizzBuzz.play(number);
        //then
        
        Assertions.assertEquals("1",actual);
    }
}
