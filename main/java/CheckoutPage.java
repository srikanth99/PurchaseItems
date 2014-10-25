import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by krish on 22/10/2014.
 *
 */
public class CheckoutPage extends BasePage{

    Utils util = new Utils();
    // Goto Billing Address
    public void GotoBillingAddress(){
//uploading
        //util.SelectFromDropdown("billing-address-select","New Address" );
//uploading

        util.SelectFromDropdown("BillingNewAddress_CountryId","Canada" );

        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("forest");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1 the Road");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("123teu");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0987102930");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();

    }
    //Shipping to Selected Address

    public void GotoShippingtoAddress(){
        driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();

    }

    //Shipping to Instore

    public void ShippinginStore(){
        driver.findElement(By.id("PickUpInStore")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
    }

    //Shipping Methods
    public void GotoShippingMethod(){
        driver.findElement(By.id("shippingoption_1")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
    }

    //Making Payments and confirming Orders

    public void GotoPaymentMethod(){
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
        Utils.Waitforsometime();
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
        Utils.Waitforsometime();
        driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
        Utils.Waitforsometime();
    }
}

