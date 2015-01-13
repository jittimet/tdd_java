import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void countOne(){
        assertEquals("1", new FizzBuzz().count(1));
    }
    @Test
    public void countTwo(){
        assertEquals("2", new FizzBuzz().count(2));
    }
    @Test
    public void countThree(){
        assertEquals("FIZZ", new FizzBuzz().count(3));
    }
    @Test
    public void countFour(){
        assertEquals("4", new FizzBuzz().count(4));
    }
    @Test
    public void countFive(){
        assertEquals("BUZZ", new FizzBuzz().count(5));
    }
    @Test
    public void countSix(){
        assertEquals("FIZZ", new FizzBuzz().count(6));
    }
    @Test
    public void countSeven(){
        assertEquals("7", new FizzBuzz().count(7));
    }
    @Test
    public void countEight(){
        assertEquals("8", new FizzBuzz().count(8));
    }
    @Test
    public void countNine(){
        assertEquals("FIZZ", new FizzBuzz().count(9));
    }
    @Test
    public void countTen(){
        assertEquals("BUZZ", new FizzBuzz().count(10));
    }
    @Test
    public void countEleven(){
        assertEquals("11", new FizzBuzz().count(11));
    }
    @Test
    public void countTwelve(){
        assertEquals("FIZZ", new FizzBuzz().count(12));
    }
    @Test
    public void countThirteen(){
        assertEquals("13", new FizzBuzz().count(13));
    }
    @Test
    public void countFourteen(){
        assertEquals("14", new FizzBuzz().count(14));
    }
    @Test
    public void countFifteen(){
        assertEquals("FIZZBUZZ", new FizzBuzz().count(15));
    }
}
