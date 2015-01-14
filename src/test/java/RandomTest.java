import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RandomTest {

    @Test
    public void pattern(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(0));
        int int_pattern = ran.getPattern().intValue();
        System.out.println("int_pattern="+int_pattern);
        assertEquals(1, int_pattern);

    }
    @Test
    public void patternUsingMockito(){
        Random random = mock(Random.class);
        when(random.nextInt(anyInt())).thenReturn(0);
        Randomizer ran = new Randomizer();
        ran.setRandom(random);
        int int_pattern = ran.getPattern().intValue();
        assertEquals(1, int_pattern);

    }
    @Test
    public void pattern2(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(1));
        int int_pattern = ran.getPattern().intValue();
        System.out.println("int_pattern="+int_pattern);
        assertEquals(2, int_pattern);

    }

    @Test
    public void operator(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(1));
        int int_operator = ran.getOperator().intValue();
        System.out.println("int_operator="+int_operator);
        assertEquals(2, int_operator);
    }
    @Test
    public void operatorUsingMockito(){
        Random random = mock(Random.class);
        when(random.nextInt(anyInt())).thenReturn(1);
        Randomizer ran = new Randomizer();
        ran.setRandom(random);
        int int_operator = ran.getOperator().intValue();
        assertEquals(2, int_operator);
    }
    @Test
    public void operator3(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(2));
        int int_operator = ran.getOperator().intValue();
        System.out.println("int_operator="+int_operator);
        assertEquals(3, int_operator);
    }

    @Test
    public void operand1(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(0));
        int int_operand = ran.getOperand().intValue();
        System.out.println("int_operand="+int_operand);
        assertEquals(1, int_operand);
    }

    @Test
    public void operandUsingMockito(){
        Random random = mock(Random.class);
        when(random.nextInt(anyInt())).thenReturn(0);
        Randomizer ran = new Randomizer();
        ran.setRandom(random);
        int int_operand = ran.getOperand().intValue();
        assertEquals(1, int_operand);
    }

    @Test
    public void operand5(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(4));
        int int_operand = ran.getOperand().intValue();
        System.out.println("int_operand="+int_operand);
        assertEquals(5, int_operand);
    }

    @Test
    public void operand9(){
        Randomizer ran = new Randomizer();
        ran.setRandom(new MyRandom(8));
        int int_operand = ran.getOperand().intValue();
        System.out.println("int_operand="+int_operand);
        assertEquals(9, int_operand);
    }



    private class MyRandom extends Random {
        private final int i;
        public MyRandom(int i) {
            this.i = i;
        }
        public int nextInt(int max){
            return i;
        }
    }
}
