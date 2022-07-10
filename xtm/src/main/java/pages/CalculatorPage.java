package pages;

import locators.CalculatorLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {

    WebDriver driver;
    WebDriverWait wait;
    CalculatorLocators calculatorLocators;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        calculatorLocators = new CalculatorLocators();
        PageFactory.initElements(driver, calculatorLocators);
        wait = new WebDriverWait(driver, 20);
    }

    public void switchToFrame() {
        wait.until(ExpectedConditions.visibilityOf(calculatorLocators.getPricingFrame()));
        driver.switchTo().frame(calculatorLocators.getPricingFrame());
    }

    public void selectAccountType() {
        Select select = new Select(calculatorLocators.getAccountType());
        select.selectByValue("LSP");
    }

    public void selectDuration() {
        Select select = new Select(calculatorLocators.getDuration());
        select.selectByValue("3");
    }

    public void selectNumberOfUsers() {
        Select select = new Select(calculatorLocators.getNumberOfUsers());
        select.selectByValue("7");
    }

    public String totalCostValue()
    {
        return calculatorLocators.getTotalCost().getText();
    }

    public void EurCost() {
        wait.until(ExpectedConditions.visibilityOf(calculatorLocators.getTotalCost()));
        calculatorLocators.getEur().click();
    }

    public void UsdCost() {
        wait.until(ExpectedConditions.visibilityOf(calculatorLocators.getTotalCost()));
        calculatorLocators.getUsd().click();
    }
}
