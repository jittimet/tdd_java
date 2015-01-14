import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class CaptchaServiceTest {
    @Test
    public void testRandomCaptcha() throws IOException {

        CaptchaService captchaService = new CaptchaService();
        Logger logger = new Logger();
        logger.setWriter(new FileWriter("captcha.log", false));
        captchaService.setLogger(logger);

        Randomizer randomizer = mock(Randomizer.class);
        when(randomizer.getPattern()).thenReturn(1);
        when(randomizer.getOperand()).thenReturn(1,1);
        when(randomizer.getOperator()).thenReturn(1);

        captchaService.setRandomizer(randomizer);
        assertEquals("One + 1", captchaService.getCaptcha());
    }
}
