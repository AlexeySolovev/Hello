import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class HelloWorld {
    static  Locale locale;
    HelloWorld(){
         locale = Locale.getDefault();


    }
    public int sayHello(Date date) {
        int hours = date.getHours();
        int minute = date.getMinutes();
        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", locale);
        if ((hours >= 6) && ((hours <= 8) && (minute <= 59))) {
            System.out.println(bundle.getString("Morning"));
            return  1;
        } else if ((hours >= 9) && ((hours <= 18) && (minute <= 59))) {
            System.out.println(bundle.getString("Day"));
            return  2;
        } else if ((hours >= 19) && ((hours <= 22) && (minute <= 59))) {
            System.out.println(bundle.getString("Evening"));
            return  3;
        } else {
            System.out.println(bundle.getString("Night"));
            return  4;
        }
    }
}
