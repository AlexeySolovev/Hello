import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class HelloWorldTest {
    HelloWorld helloWorld;
    @Before
    public void initTest() {
         helloWorld = new HelloWorld();
    }
    @Test
    public void sayHelloM() {
        assertEquals(1,helloWorld.sayHello(new Date(1542994105837L-43200000L)));
    }

    @Test
    public void sayHelloD() {
        assertEquals(2,helloWorld.sayHello(new Date(1542994105837L-36000100L)));
    }
    @Test
    public void sayHelloE() {
        assertEquals(3,helloWorld.sayHello(new Date(1542994105837L)));
    }
    @Test
    public void sayHellon() {
        assertEquals(4,helloWorld.sayHello(new Date(1542994105837L+360000000L)));
    }
}