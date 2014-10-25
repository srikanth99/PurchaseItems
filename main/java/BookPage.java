import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by krish on 22/10/2014.
 */
public class BookPage extends BasePage{

    public void GotoSelectbookpage(String bookname){

        Assert.assertTrue(driver.findElement(By.className("topic-html-content-header")).getText().contains("Welcome to our store"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
        //String drop  =driver.findElement(By.id("products-orderby")).getText();
        //System.out.println(drop);
        Select position = new Select(driver.findElement(By.id("products-orderby")));
        position.selectByVisibleText("Price: Low to High");
        driver.findElement(By.linkText(bookname)).click();
    }

}

