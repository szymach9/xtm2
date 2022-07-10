package pages;

import locators.KnowledgeBaseLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KnowledgeBasePage {

    WebDriver driver;
    WebDriverWait wait;
    KnowledgeBaseLocators knowledgeBaseLocators;

    public KnowledgeBasePage(WebDriver driver) {
        this.driver = driver;
        knowledgeBaseLocators = new KnowledgeBaseLocators();
        PageFactory.initElements(driver, knowledgeBaseLocators);
        wait = new WebDriverWait(driver, 20);
    }

    public void openDocumentationPage() {
    wait.until(ExpectedConditions.visibilityOf(knowledgeBaseLocators.getDocumentationButton()));
    knowledgeBaseLocators.getDocumentationButton().click();
    }
}
