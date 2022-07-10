package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorLocators {

    @FindBy(xpath = "//iframe[@class='pricing-iframe']")
    private WebElement pricingFrame;

    @FindBy(xpath = "//select[@name='accountType']")
    private WebElement accountType;

    @FindBy(xpath = "//select[@name='subscriptionLength']")
    private WebElement duration;

    @FindBy(xpath = "//select[@name='numberOfUsers']")
    private WebElement numberOfUsers;

    @FindBy(xpath = "//div[@class='total-cost']/p/span")
    private WebElement totalCost;

    @FindBy(xpath = "//label[@for='EUR']")
    private WebElement eur;

    @FindBy(xpath = "//label[@for='USD']")
    private WebElement usd;


    public WebElement getPricingFrame() {
        return pricingFrame;
    }

    public void setPricingFrame(WebElement pricingFrame) {
        this.pricingFrame = pricingFrame;
    }

    public WebElement getAccountType() {
        return accountType;
    }

    public void setAccountType(WebElement accountType) {
        this.accountType = accountType;
    }

    public WebElement getDuration() {
        return duration;
    }

    public void setDuration(WebElement duration) {
        this.duration = duration;
    }

    public WebElement getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(WebElement numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public WebElement getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(WebElement totalCost) {
        this.totalCost = totalCost;
    }

    public WebElement getEur() {
        return eur;
    }

    public void setEur(WebElement eur) {
        this.eur = eur;
    }

    public WebElement getUsd() {
        return usd;
    }

    public void setUsd(WebElement usd) {
        this.usd = usd;
    }
}
