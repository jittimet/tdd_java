import com.ais.captcha.Captcha;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptchaTest {
    @Test
    public void onePlusOnePattern1 () {
        assertEquals("One + 1", new Captcha(1,1,1,1).getCaptcha());
    }

    @Test
    public void twoPlusOnePattern1() {
        assertEquals("Two + 1", new Captcha(1,2,1,1).getCaptcha());
    }

    @Test
    public void twoPlusTwoPattern1() {
        assertEquals("Two + 2", new Captcha(1,2,1,2).getCaptcha());
    }

    @Test
    public void twoPlusOnePattern2 () {
        assertEquals("2 + One", new Captcha(2,2,1,1).getCaptcha());
    }

    @Test
    public void twoPlusTwoPattern2 () {
        assertEquals("2 + Two", new Captcha(2,2,1,2).getCaptcha());
    }

    @Test
    public void threePlusOnePattern2 () {
        assertEquals("3 + One", new Captcha(2,3,1,1).getCaptcha());
    }

    @Test
    public void plusOperator() {
        assertEquals("+", new Captcha(1,1,1,1).getOperator());
    }

    @Test
    public void oneMultiplyOnePattern1 () {
        assertEquals("One * 1", new Captcha(1,1,2,1).getCaptcha());
    }

    @Test
    public void oneMinusOnePattern1 () {
        assertEquals("One - 1", new Captcha(1,1,3,1).getCaptcha());
    }

    @Test
    public void leftOperandIsTwo() {
        assertEquals("Two", new Captcha(1, 2, 1, 1).getLeftOperand());
    }

    @Test
    public void leftOperandIsThree() {
        assertEquals("Three", new Captcha(1,3,1,1).getLeftOperand());
    }

    @Test
    public void leftOperandIsFour() {
        assertEquals("Four", new Captcha(1,4,1,1).getLeftOperand());
    }

}
