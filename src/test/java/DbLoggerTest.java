import com.ais.log.DbLogger;
import com.ais.log.FileLogger;
import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class DbLoggerTest {
    @Test
    public void writeMessageToDB() throws Exception {
        DbLogger logger = new DbLogger();
        Connection conn = mock(Connection.class);
        PreparedStatement stat = mock(PreparedStatement.class);
        when(conn.prepareStatement(anyString())).thenReturn(stat);
        logger.setConn(conn);

        logger.persist("Test", new Date().toString());
        verify(stat).execute();

    }
}
