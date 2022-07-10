package pages;

import locators.HomeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    HomeLocators homeLocators;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        homeLocators = new HomeLocators();
        PageFactory.initElements(driver, homeLocators);
        wait = new WebDriverWait(driver, 20);
    }

    public void acceptCookies() {
        wait.until(ExpectedConditions.visibilityOf(homeLocators.getCookiesAcceptButton()));
        homeLocators.getCookiesAcceptButton().click();
    }

    public void selectPricingPage() {
        wait.until(ExpectedConditions.visibilityOf(homeLocators.getPricingButton()));
        Actions action = new Actions(driver);
        action.moveToElement(homeLocators.getPricingButton()).perform();
    }

    public void openCalculatorTab() {
        wait.until(ExpectedConditions.visibilityOf(homeLocators.getCalculatorButton()));
        Actions action = new Actions(driver);
        action.moveToElement(homeLocators.getCalculatorButton()).perform();
        homeLocators.getCalculatorButton().click();
    }

    public void selectAcademyPage() {
        wait.until(ExpectedConditions.visibilityOf(homeLocators.getAcademyButton()));
        Actions action = new Actions(driver);
        action.moveToElement(homeLocators.getAcademyButton()).perform();
    }

    public void openKnowledgeBaseTab() {
        wait.until(ExpectedConditions.visibilityOf(homeLocators.getKnowledgeBaseButton()));
        Actions action = new Actions(driver);
        action.moveToElement(homeLocators.getKnowledgeBaseButton()).perform();
        homeLocators.getKnowledgeBaseButton().click();
    }

}

