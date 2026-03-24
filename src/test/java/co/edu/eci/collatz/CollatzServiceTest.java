package co.edu.eci.collatz;

import co.edu.eci.collatz.service.CollatzService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CollatzServiceTest {
    
    private CollatzService service;

    @BeforeEach
    void setup(){
        service = new CollatzService();
    }


    @Test
    void sequenceStaringAt13(){
        String result = service.generateSequence(13);
        assertEquals("13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1", result); 
    }

    @Test 
    void sequenceStaringAt1(){
        String result = service.generateSequence(1);
        assertEquals("1", result); 
    }

    @Test 
    void sequenceStaringAt2(){
        String result = service.generateSequence(2);
        assertEquals("2 -> 1", result); 
    }

    @Test
    void sequenceStartingAt6(){
        String result = service.generateSequence(2);
        assertEquals("6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1", result);
    }

    @Test 
    void throwsOnZero(){
        assertThrows(IllegalArgumentException.class, () -> service.generateSequence(0));
    }

    @Test 
    void throwsOnNegative(){
        assertThrows(IllegalArgumentException.class, () -> service.generateSequence(-5));
    }

}
