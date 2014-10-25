import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by krish on 22/10/2014.
 */
public class Utils extends BasePage{
    public void SelectFromDropdown(String ID, String Text){
        Select Address1 = new Select(driver.findElement(By.id(ID)));
        Address1.selectByVisibleText(Text);
    }

    public static void Waitforsometime(){
        try {
            Thread.sleep(300);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
