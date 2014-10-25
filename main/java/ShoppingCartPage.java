import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by krish on 22/10/2014.
 */
public class ShoppingCartPage extends BasePage{
    Utils util =new Utils();

    //goto Shopping Cart

    public void UpdateShoppingCart(String num){

        driver.findElement(By.linkText("Shopping cart")).click();

        //verify
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Shopping cart"));

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).sendKeys(num);
        driver.findElement(By.name("updatecart")).click();

        //select drop down

        util.SelectFromDropdown("customerCurrency", "US Dollar");
        util.SelectFromDropdown("checkout_attribute_1", "Yes [+$10.00]");


    }

    //Estimate shipping cost
    public void EstimateShipping(String Country){



        Select currency = new Select(driver.findElement(By.id("CountryId")));
        currency.selectByVisibleText(Country);
        driver.findElement(By.name("estimateshipping")).click();


    }

    //CheckOut
    public void Gotocheckout(){


        driver.findElement(By.id("checkout")).click();
        //Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Terms of Service"));
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/button/span[1]")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }
}
