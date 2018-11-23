import java.util.Date;
import java.util.logging.Logger;
public class Test {
    private static Logger log = Logger.getLogger(Test.class.getName());
    public void testMorning(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello(new Date(1542994105837L-43200000L ));
        log.info("testMorning завершился");
    }
    public void testDay(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello(new Date(1542994105837L-36000100L));
        log.info("testDay завершился");
    }
    public void testEv(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello(new Date(1542994105837L));
        log.info("testEv завершился");
    }
    public void testNight(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello(new Date(1542994105837L+360000000L));
        log.info("testNight завершился");
    }
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        log.info("testSayHello завершился");

    }
}
