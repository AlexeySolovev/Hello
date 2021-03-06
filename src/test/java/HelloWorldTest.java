import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    public void sayHelloMorning() {
        //Fri Nov 23 08:28:25 MSK 2018
        Calendar calendar = new GregorianCalendar(2014, 10, 1, 8, 30);
        assertEquals(1, helloWorld.sayHello(calendar.getTime()));
        log.info("Тест 1 прошел");
    }

    @Test
    public void sayHelloDay() {
        Calendar calendar = new GregorianCalendar(2014, 10, 1, 10, 30);
        assertEquals(2, helloWorld.sayHello(calendar.getTime()));
        log.info("Тест 2 прошел");
    }

    @Test
    public void sayHelloEvening() {
        Calendar calendar = new GregorianCalendar(2014, 10, 1, 20, 30);
        assertEquals(3, helloWorld.sayHello(calendar.getTime()));
        log.info("Тест 3 прошел");
    }

    @Test
    public void sayHelloNight() {
        Calendar calendar = new GregorianCalendar(2014, 10, 1, 23, 30);
        assertEquals(4, helloWorld.sayHello(calendar.getTime()));
        log.info("Тест 4 прошел");
    }
}