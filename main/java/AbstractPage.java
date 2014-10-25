import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by krish on 22/10/2014.
 */
public class AbstractPage extends BasePage{

    Utils util = new Utils();

    //Rigistration

    public void registration(String Fname, String Sname, String Email, String password)

    {

        driver.findElement(By.linkText("Register")).click();
        Assert.assertTrue(driver.findElement(By.tagName("Body")).getText().contains("Your Personal Details"));
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys(Fname);
        driver.findElement(By.id("LastName")).sendKeys(Sname);
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).submit();
        Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("Your registration completed"));
        String value = driver.findElement(By.className("result")).getText();
        System.out.println("meaasage is " + value);

        this.logout();
    }

    //Log in to Nop after Registraion

    public void login(String username, String Password) {
        driver.findElement(By.linkText("Log in")).click();
        Assert.assertTrue(driver.findElement(By.className("page-title")).getText().contains("Welcome, Please Sign In!"));
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(Password);
        // driver.findElement(By.className("buttons")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

    }

    public boolean isitemaddedtocart() {
        return driver.findElement(By.className("content")).getText().equalsIgnoreCase("The product has been added to your shopping cart");
    }

    //Log out
    public void logout() {
        driver.findElement(By.linkText("Log out")).click();
    }

    //Adding to the ADDCart

    public void AdditemtoCart(String id, String quantity, String buttonID) {

        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(quantity);
        driver.findElement(By.id(buttonID)).click();

    }

    public boolean isShippingoptionshown() {
        return driver.findElement(By.tagName("body")).getText().contains("Next Day Air ($0.00)");
    }

    public boolean isCheckoutshown() {
        return driver.findElement(By.tagName("body")).getText().contains("Checkout");
    }

    public boolean isShippingpage() {
        return driver.findElement(By.tagName("body")).getText().contains("Shipping Address");
    }


    public boolean isShippingmethodpage() {
        return driver.findElement(By.tagName("body")).getText().contains("Shipping Method");
    }


    public boolean isOrderconfirmed() {
        return driver.findElement(By.className("details")).getText().contains("Order");
    }

    public void forgotpassword(String email) {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/span/a")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[2]/input")).click();
        Assert.assertTrue(driver.findElement(By.className("page-body")).getText().contains("Email with instructions has been sent to you."));

    }



    public boolean Orderstatus(){

        return driver.findElement(By.tagName("body")).getText().contains("Order Status");
    }



}
