package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void canAddTwoNumber(){
        int answer = 2 + 2;
        assertEquals("2 + 2: ", 4, answer);
    }
}
