package pages;

import locators.DocumentationLocators;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;

public class DocumentationPage {

    WebDriver driver;
    WebDriverWait wait;
    DocumentationLocators documentationLocators;

    public DocumentationPage(WebDriver driver) {
        this.driver = driver;
        documentationLocators = new DocumentationLocators();
        PageFactory.initElements(driver, documentationLocators);
        wait = new WebDriverWait(driver, 20);
    }

    public void downloadDocument() {
        wait.until(ExpectedConditions.visibilityOf(documentationLocators.getDownloadUserManualButton()));
        documentationLocators.getDownloadUserManualButton().click();
    }

    public void checkDownloadFile() {
            File dir = new File("D:\\Chrome_Pobrane");
            File[] dirContents = dir.listFiles();

            for (File pdf : dirContents) {
                Assertions.assertThat(pdf.exists());
            }
        }
    }

