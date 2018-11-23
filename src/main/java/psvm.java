import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.LogManager;

public class psvm {
    public static void main(String[] args)  {
      Test test = new Test();
        try {
            LogManager.getLogManager().readConfiguration(
                    psvm.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
      test.testMorning();
      test.testDay();
      test.testEv();
      test.testNight();
      test.testSayHello();

    }
}
