import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class LoggerTest {

    @Test
    public void writeMessageToFile() throws IOException {
        Logger logger = new Logger();
        FileWriter fileWriter = mock(FileWriter.class);
        logger.setWriter(fileWriter);
        logger.persist("Test", new Date().toString());
        verify(fileWriter).write(anyString());
    }

}
