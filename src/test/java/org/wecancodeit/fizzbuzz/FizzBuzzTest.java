package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    4 should say "4"
    5 should say "buzz"

 */
public class FizzBuzzTest {
    @Test
    public void createFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldSay1(){
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(1);
        // assertion
        assertEquals("1",result);
    }

    @Test
    public void twoShouldSay2(){
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(2);
        // assertion
        assertEquals("2",result);
    }

    @Test
    public void threeShouldSay3(){
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(3);
        // assertion
        assertEquals("Fizz",result);
    }

    @Test
    public void fourShouldSay4(){
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(4);
        // assertion
        assertEquals("4",result);
    }

    @Test
    public void fiveShouldSayBuzz(){
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(5);
        // assertion
        assertEquals("Buzz",result);
    }

    @Test
    public void nineShouldSayFizz(){
        // arrangement
        FizzBuzz underTest = new FizzBuzz();
        // action
        String result = underTest.say(9);
        // assertion
        assertEquals("Fizz",result);
    }
}
