import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class HelloWorldTest {
    HelloWorld helloWorld;
    private static Logger log;

    @Before
    public void initTest() {
        try {
            LogManager.getLogManager().readConfiguration(
                    HelloWorldTest.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        helloWorld = new HelloWorld();
        log = Logger.getLogger(HelloWorld.class.getName());
    }

    @After
    public void afterTest() {
        helloWorld = null;
    }

    @Test
    public void sayHelloM() {
        assertEquals(4, helloWorld.sayHello(new Date(1542994105837L - 43200000L)));
        log.info("Тест 1 прошел");
    }

    @Test
    public void sayHelloD() {
        assertEquals(1, helloWorld.sayHello(new Date(1542994105837L - 36000100L)));
        log.info("Тест 2 прошел");
    }

    @Test
    public void sayHelloE() {
        assertEquals(2, helloWorld.sayHello(new Date(1542994105837L)));
        log.info("Тест 3 прошел");
    }

    @Test
    public void sayHellon() {

        assertEquals(2, helloWorld.sayHello(new Date(1542994105837L+360000000L)));
        log.info("Тест 4 прошел");
    }
}