package pageobjets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    @FindBy(xpath = "//a[contains(text(),'Sing in)]") protected WebElement lknsingin;
    public menuPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickSingin(){
        wait.until(ExpectedConditions.elementToBeClickable(lknsingin));
        lknsingin.click();
    }
}
