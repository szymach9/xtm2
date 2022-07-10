package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocumentationLocators {

    @FindBy(xpath = "//a[text()='XTM Editor - User Manual']")
    private WebElement downloadUserManualButton;

    public WebElement getDownloadUserManualButton() {
        return downloadUserManualButton;
    }

    public void setDownloadUserManualButton(WebElement downloadUserManualButton) {
        this.downloadUserManualButton = downloadUserManualButton;
    }
}
