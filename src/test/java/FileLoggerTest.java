import com.ais.log.FileLogger;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class FileLoggerTest {

    @Test
    public void writeMessageToFile() throws IOException {
        FileLogger logger = new FileLogger();
        FileWriter fileWriter = mock(FileWriter.class);
        logger.setWriter(fileWriter);
        logger.persist("Test", new Date().toString());
        verify(fileWriter).write(anyString());
    }

}
