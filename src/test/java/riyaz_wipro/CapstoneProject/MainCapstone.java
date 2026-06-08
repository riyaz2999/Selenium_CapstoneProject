package riyaz_wipro.CapstoneProject;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainCapstone {

    public static void main(String[] args) throws Exception {

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        System.out.println("Browser launched successfully.");

        // Maximize the browser window
        driver.manage().window().maximize();
        System.out.println("Browser window maximized.");

        // Navigate to the test automation practice website
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Navigated to: https://testautomationpractice.blogspot.com/");

        // Verify page heading is present
        WebElement wb = driver.findElement(
                By.xpath("//h1[contains(text(),'Automation Testing Practice')]"));
        System.out.println("Page Heading Found: " + wb.getText());

        // ── FORM FIELDS ──────────────────────────────────────────────

        // Enter Name
        driver.findElement(By.xpath("//input[@placeholder='Enter Name']"))
                .sendKeys("Riyaz Shaik");
        System.out.println("Name entered: Riyaz Shaik");
        Thread.sleep(2000);

        // Enter Email
        driver.findElement(By.id("email")).sendKeys("testng@gmail.com");
        System.out.println("Email entered: testng@gmail.com");
        Thread.sleep(2000);

        // Enter Phone Number
        driver.findElement(By.id("phone")).sendKeys("912345678");
        System.out.println("Phone entered: 912345678");
        Thread.sleep(2000);

        // Enter Address in Textarea
        driver.findElement(By.id("textarea")).sendKeys("Vijayawada, Andhra Pradesh");
        System.out.println("Address entered: Vijayawada, Andhra Pradesh");
        Thread.sleep(2000);

        // ── RADIO BUTTON ─────────────────────────────────────────────

        // Select Gender: Male
        driver.findElement(By.id("male")).click();
        System.out.println("Radio Button selected: Male");
        Thread.sleep(2000);

        // ── CHECKBOX ─────────────────────────────────────────────────

        // Select Day: Sunday
        driver.findElement(By.id("sunday")).click();
        System.out.println("Checkbox checked: Sunday");
        Thread.sleep(2000);

        // ── DROPDOWNS ────────────────────────────────────────────────

        // Select Country: India
        Select country = new Select(driver.findElement(By.xpath("//select[contains(@id,'country')]")));
        country.selectByVisibleText("India");
        System.out.println("Country selected: India");
        Thread.sleep(2000);

        // Select Color: White
        Select colors = new Select(driver.findElement(By.xpath("//select[contains(@id,'colors')]")));
        colors.selectByVisibleText("Blue");
        System.out.println("Color selected: Blue");
        Thread.sleep(2000);

        // Select Animal: Rabbit
        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Lion");
        System.out.println("Animal selected: Lion");
        Thread.sleep(2000);

     // ================= DATE PICKERS =================

        System.out.println("Date Picker Automation Started.");

        // Date Picker 1: Standard input
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("03/25/2026");
        System.out.println("Date Picker 1 (datepicker) set to: 03/25/2026");
        Thread.sleep(2000);

        // Click label to dismiss calendar popup
        driver.findElement(By.xpath("//label[contains(text(),'Date Picker 3')]")).click();
        System.out.println("Clicked elsewhere to close the calendar popup.");

        // Date Picker 2: JS Executor (read-only field)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement date = driver.findElement(By.id("txtDate"));
        js.executeScript("arguments[0].value='09/09/2021';", date);
        System.out.println("Date Picker 2 (txtDate) set via JavaScript: 09/09/2021");
        Thread.sleep(2000);

     // ================= DATE PICKER 3 FINAL FINAL FIX =================

        JavascriptExecutor jsd = (JavascriptExecutor) driver;

        // Start Date
        WebElement sd = driver.findElement(By.id("start-date"));
        jsd.executeScript("arguments[0].value='2015-05-12';", sd);

        // End Date
        WebElement ed = driver.findElement(By.id("end-date"));
        jsd.executeScript("arguments[0].value='2016-07-12';", ed);

        // Debug
        System.out.println("Start Date = " + sd.getAttribute("value"));
        System.out.println("End Date = " + ed.getAttribute("value"));
        
        // Click Submit button for date range
        driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
        System.out.println("Submit button clicked for date range.");
        Thread.sleep(2000);

        // ── FILE UPLOAD ────────────z`───────────────────────────────────

        // Define file paths for upload
        String singleFilePath = new File("D:\\Wipro\\Assignment - 25 - SDET.pdf").getAbsolutePath();
        String file1Path = new File("D:\\Wipro\\Riyaz_Resume.pdf").getAbsolutePath();
        String file2Path = new File("D:\\Wipro\\image.png").getAbsolutePath();

        // Single File Upload
        WebElement singleInput = driver.findElement(By.id("singleFileInput"));
        singleInput.sendKeys(singleFilePath);
        System.out.println("Single file uploaded: " + singleFilePath);

        WebElement singleSubmitBtn = driver.findElement(By.xpath("//form[@id='singleFileForm']/button"));
        singleSubmitBtn.click();
        System.out.println("Single file upload form submitted.");

        // Multiple Files Upload
        WebElement multipleInput = driver.findElement(By.id("multipleFilesInput"));
        String multipleFilesPaths = file1Path + "\n" + file2Path;
        multipleInput.sendKeys(multipleFilesPaths);
        System.out.println("Multiple files uploaded: \n  File1: " + file1Path + "\n  File2: " + file2Path);

        WebElement multipleSubmitBtn = driver.findElement(By.xpath("//form[@id='multipleFilesForm']/button"));
        multipleSubmitBtn.click();
        System.out.println("Multiple files upload form submitted.");

        // ── ACTIONS CLASS ─────────────────────────────────────────────

        Actions act = new Actions(driver);

        // Double Click
        WebElement copyBtn = driver.findElement(
                By.xpath("//button[text()='Copy Text']"));
        act.doubleClick(copyBtn).perform();
        System.out.println("Action performed: Double Click on 'Copy Text' button.");

        // Mouse Hover
        WebElement pointMe = driver.findElement(
                By.xpath("//button[text()='Point Me']"));
        act.moveToElement(pointMe).perform();
        Thread.sleep(2000);
        System.out.println("Action performed: Mouse Hover on 'Point Me' button.");

        // Drag and Drop
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        act.dragAndDrop(source, target).perform();
        Thread.sleep(2000);
        System.out.println("Action performed: Drag and Drop — source dropped onto target.");

        // Slider
        WebElement slider = driver.findElement(
                By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        act.dragAndDropBy(slider, 100, 0).perform();
        Thread.sleep(2000);
        System.out.println("Action performed: Slider moved 100px to the right.");

        // Dynamic Links Count
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Thread.sleep(2000);
        System.out.println("Total hyperlinks found on page: " + links.size());

        // Read copied text from name field
        String text = driver.findElement(By.id("name")).getAttribute("value");
        System.out.println("Value in 'name' field after double-click copy: " + text);

        // ── ALERTS ───────────────────────────────────────────────────

        // Simple Alert
        driver.findElement(By.id("alertBtn")).click();
        Alert a = driver.switchTo().alert();
        System.out.println("Simple Alert text: " + a.getText());
        Thread.sleep(3000);
        a.accept();
        System.out.println("Simple Alert accepted.");
        Thread.sleep(2000);

        // Confirm Alert
        driver.findElement(By.id("confirmBtn")).click();
        Alert b = driver.switchTo().alert();
        System.out.println("Confirm Alert text: " + b.getText());
        Thread.sleep(3000);
        b.dismiss();
        System.out.println("Confirm Alert dismissed.");
        Thread.sleep(3000);

        // Prompt Alert
        driver.findElement(By.id("promptBtn")).click();
        Alert c = driver.switchTo().alert();
        System.out.println("Prompt Alert text: " + c.getText());
        c.sendKeys("Riyaz");
        System.out.println("Prompt Alert input entered: Riyaz");
        Thread.sleep(2000);
        c.accept();
        System.out.println("Prompt Alert accepted.");

        // ── JAVASCRIPT SCROLL ─────────────────────────────────────────

        Thread.sleep(3000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        // Scroll Down to bottom
        js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        System.out.println("JavaScript Scroll: Scrolled DOWN to bottom of the page.");
        Thread.sleep(3000);

        // Scroll Up to top
        js1.executeScript("window.scrollTo(0,0)");
        System.out.println("JavaScript Scroll: Scrolled UP to top of the page.");
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
        System.out.println("Browser closed. Test execution completed successfully.");
    }
}