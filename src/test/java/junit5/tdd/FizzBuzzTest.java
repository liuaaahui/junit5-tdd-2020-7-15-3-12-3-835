package junit5.tdd;

import javafx.scene.media.AudioClip;
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

    @Test
    void should_return_fizz_when_play_fizz_buzz_given_3() {
        //given
        int number = 3;
        FizzBuzz fuzzBuzz = new FizzBuzz();
        //when


        String actual = fuzzBuzz.play(number);
        //then

        Assertions.assertEquals("Fizz",actual);
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_given_5() {
        //given
        int number = 5;
        FizzBuzz fuzzBuzz = new FizzBuzz();
        //when
        String actual = fuzzBuzz.play(number);

        //then
        Assertions.assertEquals("Buzz",actual);
    }
}
