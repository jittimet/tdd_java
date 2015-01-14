import com.ais.captcha.Randomizer;
import com.ais.log.DbLogger;
import com.ais.log.FileLogger;
import com.ais.log.Logger;
import com.ais.service.CaptchaService;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class CaptchaServiceTest {
    @Test
    public void testRandomCaptcha() throws Exception {

        CaptchaService captchaService = new CaptchaService();
        FileLogger logger = mock(FileLogger.class);
        captchaService.setLogger(logger);

        Randomizer randomizer = mock(Randomizer.class);
        when(randomizer.getPattern()).thenReturn(1);
        when(randomizer.getOperand()).thenReturn(1,1);
        when(randomizer.getOperator()).thenReturn(1);

        captchaService.setRandomizer(randomizer);
        assertEquals("One + 1", captchaService.getCaptcha());
    }

    @Test
    public void testRandomCaptchaWithDbLogger() throws Exception {


        DbLogger logger = mock(DbLogger.class);

        CaptchaService captchaService = new CaptchaService();
        captchaService.setLogger(logger);

        Randomizer randomizer = mock(Randomizer.class);
        when(randomizer.getPattern()).thenReturn(1);
        when(randomizer.getOperand()).thenReturn(1,1);
        when(randomizer.getOperator()).thenReturn(1);

        captchaService.setRandomizer(randomizer);
        assertEquals("One + 1", captchaService.getCaptcha());
    }
}
