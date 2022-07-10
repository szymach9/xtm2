package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocators {

    @FindBy(xpath = "//a[@href='https://xtm.cloud/pricing/']")
    private WebElement pricingButton;

    @FindBy (xpath = "//a[@href='https://xtm.cloud/pricing/#calculator']" )
    private WebElement calculatorButton;

    @FindBy (xpath = "//*[@id='hs-eu-confirmation-button']")
    private WebElement cookiesAcceptButton;

    @FindBy(xpath = "//*[@id=\"menu-item-88\"]/a")
    private WebElement academyButton;

    @FindBy(xpath = "//*[@id=\"menu-item-91\"]/a")
    private WebElement knowledgeBaseButton;

    
    public WebElement getPricingButton() {
        return pricingButton;
    }

    public void setPricingButton(WebElement pricingButton) {
        this.pricingButton = pricingButton;
    }

    public WebElement getCalculatorButton() {
        return calculatorButton;
    }

    public void setCalculatorButton(WebElement calculatorButton) {
        this.calculatorButton = calculatorButton;
    }

    public WebElement getCookiesAcceptButton() {
        return cookiesAcceptButton;
    }

    public void setCookiesAcceptButton(WebElement cookiesAcceptButton) {
        this.cookiesAcceptButton = cookiesAcceptButton;
    }

    public WebElement getAcademyButton() {
        return academyButton;
    }

    public void setAcademyButton(WebElement academyButton) {
        this.academyButton = academyButton;
    }

    public WebElement getKnowledgeBaseButton() {
        return knowledgeBaseButton;
    }

    public void setKnowledgeBaseButton(WebElement knowledgeBaseButton) {
        this.knowledgeBaseButton = knowledgeBaseButton;
    }
}
