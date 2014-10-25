import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by krish on 22/10/2014.
 */
public class MyaccountPage extends BasePage {
    public void Myorders(){

        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a")).click();
        Utils.Waitforsometime();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/input")).click();
        Utils.Waitforsometime();
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Order Status"));



    }
}
