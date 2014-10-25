import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by krish on 22/10/2014.
 */
public class GiftCardPage extends BasePage{
    public void GiftCardPurchase(){

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Bear");
        driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("bear@yahoo.com");
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-button-1")).click();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
