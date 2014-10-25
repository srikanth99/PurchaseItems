import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by krish on 22/10/2014.
 */
public class ComputerPage extends BasePage {
    public void GotopurchaseNotebook(){

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[2]/div[2]/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/h2/a")).click();

    }
}
