package Page;

import Driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.TimeOutDuration;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Created by duzhe on 2018/3/21.
 *
 * @Description:
 */
public class BasePage {

    public static AppiumDriver driver = DriverFactory.getAndroidDriver();

    //超时时间
//    private final int TIMEOUT = 10;
    private final long TIMEOUT_SECONDS = 10;

    Duration timeOutDuration = Duration.ofSeconds(TIMEOUT_SECONDS);

    public BasePage(){

        //初始化所有元素
        System.out.println("initEelments ");
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOutDuration) , this);
        System.out.println(this.getClass() + " init sucess");
    }

}
