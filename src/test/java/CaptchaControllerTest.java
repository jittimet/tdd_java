import com.ais.controller.CaptchaController;
import com.ais.service.CaptchaService;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class CaptchaControllerTest {

    @Test
    public void testCaptcha() throws Exception {
        CaptchaController captchaController = new CaptchaController();
        CaptchaService captchaService = mock(CaptchaService.class);
        when(captchaService.getCaptcha()).thenReturn("One + 1");

        captchaController.setCaptchaService(captchaService);

        assertEquals("One + 1", captchaController.getCaptcha());

    }

}
