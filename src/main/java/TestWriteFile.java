import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class TestWriteFile {
    public static void main (String ... arg) throws IOException {
        Writer writer = new FileWriter("captcha.log", true);
        writer.write("Test");
        writer.flush();
        writer.close();
    }
}
