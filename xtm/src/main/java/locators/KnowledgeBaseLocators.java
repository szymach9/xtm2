package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KnowledgeBaseLocators {

    @FindBy(xpath = "//li[@id='menu-item-5037']")
    private WebElement documentationButton;

    public WebElement getDocumentationButton() {
        return documentationButton;
    }

    public void setDocumentationButton(WebElement documentationButton) {
        this.documentationButton = documentationButton;
    }


}
