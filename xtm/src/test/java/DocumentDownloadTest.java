import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import pages.DocumentationPage;
import pages.HomePage;
import pages.KnowledgeBasePage;

import java.io.File;
import java.time.Duration;

public class DocumentDownloadTest {
    private FluentWait<WebDriver> wait;
    private File documentPDF;
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://xtm.cloud/");
    }

    @Test
    public void downloadDocument() throws InterruptedException {
        HomePage homePage = new HomePage(driver );
        homePage.acceptCookies();
        homePage.selectAcademyPage();
        Thread.sleep(2000);
        homePage.openKnowledgeBaseTab();
        KnowledgeBasePage knowledgeBasePage = new KnowledgeBasePage(driver);
        Thread.sleep(2000);
        knowledgeBasePage.openDocumentationPage();
        DocumentationPage documentationPage = new DocumentationPage(driver);
        documentationPage.downloadDocument();
        Thread.sleep(3000);
        documentationPage.checkDownloadFile();
    }

    @After
   public void tearDown() { driver.quit(); }
}
